package com.mangxiao.vue.backend.sample.dao.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.mangxiao.vue.backend.sample.dao.StudentDao;
import com.mangxiao.vue.backend.sample.mapper.StudentMapper;
import com.mangxiao.vue.backend.sample.model.Student;
import com.mangxiao.vue.backend.sample.util.Pages;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class StudentDaoImpl implements StudentDao {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public Student getStu(Student stu) {
        return studentMapper.getStu(stu);
    }

    @Override
    public List<Student> getAll() {
        return studentMapper.getAll();
    }

    @Override
    public List<Student> getStusByPage(Student stu, Pages p) {
        PageHelper.startPage(p.getPageNo(), p.getPageSize());
        Page<Student> result = studentMapper.getStusByPage(stu);
        List<Student> dataList = new ArrayList<>();
        if (result != null){
            dataList = result.getResult();
        }
        return dataList;
    }

    @Override
    public int addStu(Student stu) {
        return studentMapper.addStu(stu);
    }

    @Override
    public int deleteStu(String stuNo) {
        return studentMapper.deleteStu(stuNo);
    }

    @Override
    public int updateStu(Student stu) {
        return studentMapper.updateStu(stu);
    }

}
