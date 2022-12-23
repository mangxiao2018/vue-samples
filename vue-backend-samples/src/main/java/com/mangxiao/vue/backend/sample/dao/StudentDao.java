package com.mangxiao.vue.backend.sample.dao;

import com.mangxiao.vue.backend.sample.model.Student;
import com.mangxiao.vue.backend.sample.util.Pages;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentDao {
    /**
     * 根据学生编号获取该生信息
     * @param stu
     * @return
     */
    Student getStu(Student stu);

    /**
     * 获取所有学生信息
     * @return
     */
    List<Student> getAll();

    /**
     * 带分页的查询
     * @param stu
     * @param p
     * @return
     */
    List<Student> getStusByPage(Student stu, Pages p);

    /**
     * 新增一条学生信息
     * @param stu
     * @return
     */
    int addStu(Student stu);

    /**
     * 删除一条学生信息
     * @param stuNo
     * @return
     */
    int deleteStu(String stuNo);

    /**
     * 更新一条学生信息
     * @param stu
     * @return
     */
    int updateStu(Student stu);
}
