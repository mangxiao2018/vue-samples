package com.mangxiao.vue.backend.sample.service.impl;

import com.mangxiao.vue.backend.sample.dao.StudentDao;
import com.mangxiao.vue.backend.sample.model.Student;
import com.mangxiao.vue.backend.sample.service.StudentService;
import com.mangxiao.vue.backend.sample.util.Pages;
import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StudentServiceImpl implements StudentService {

    private Log log = LogFactory.getLog(StudentServiceImpl.class);
    @Autowired
    private StudentDao studentDao;
    @Override
    public Student getStu(Student stu) {
        return studentDao.getStu(stu);
    }

    @Override
    public List<Student> getAll() {
        return studentDao.getAll();
    }

    @Override
    public List<Student> getStusByPage(Student stu, Pages p) {
        return studentDao.getStusByPage(stu, p);
    }

    @Override
    public Boolean addStu(Student stu) {
        Boolean ret = Boolean.TRUE;
        if (studentDao.addStu(stu) == 0){
            ret = Boolean.FALSE;
        }
        return ret;
    }

    @Override
    public Boolean deleteStu(String stuNo) {
        Boolean ret = Boolean.TRUE;
        if (studentDao.deleteStu(stuNo) == 0){
            ret = Boolean.FALSE;
        }
        return ret;
    }

    @Override
    public Boolean updateStu(Student stu) {
        Boolean ret = Boolean.TRUE;
        if (studentDao.updateStu(stu) == 0){
            ret = Boolean.FALSE;
        }
        return ret;
    }
}
