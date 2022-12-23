package com.mangxiao.vue.backend.sample.mapper;

import com.github.pagehelper.Page;
import com.mangxiao.vue.backend.sample.model.Student;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface StudentMapper {

    @Results(id="StudentMap", value = {
            @Result(property = "id", column = "id", id = true),
            @Result(property = "stuName", column = "stu_name"),
            @Result(property = "stuNo", column = "stu_no"),
            @Result(property = "chineseScore", column = "chinese_score"),
            @Result(property = "mathScore", column = "math_score"),
            @Result(property = "englishScore", column = "english_score"),
            @Result(property = "profileAvatarImage", column = "profile_avatar_image"),
            @Result(property = "createAt", column = "create_at"),
            @Result(property = "updateAt", column = "update_at"),
            @Result(property = "createUser", column = "create_user"),
            @Result(property = "updateUser", column = "update_user"),
            @Result(property = "yn", column = "yn")
    })
    /**
     * 根据学生编号获取该生信息
     */
    @Select("SELECT id, stu_name, stu_no, chinese_score, math_score, english_score, profile_avatar_image, create_at, update_at, create_user, update_user, yn FROM student WHERE stu_no = #{stuNo}")
    Student getStu(Student stu);

    /**
     * 获取所有学生信息
     * @return
     */
    @Select("SELECT id, stu_name, stu_no, chinese_score, math_score, english_score, profile_avatar_image, create_at, update_at, create_user, update_user, yn FROM student")
    @ResultMap("StudentMap")
    List<Student> getAll();

    /**
     * 带分页的查询
     * @return
     */
    @Select("SELECT id, stu_name, stu_no, chinese_score, math_score, english_score, profile_avatar_image, create_at, update_at, create_user, update_user, yn FROM student WHERE yn = #{yn}")
    @ResultMap("StudentMap")
    Page<Student> getStusByPage(Student stu);

    /**
     * 新增一条学生信息
     * @param stu
     * @return
     */
    @Insert("INSERT INTO student (stu_name, stu_no, chinese_score, math_score, english_score, profile_avatar_image) VALUES(#{stuName},#{stuNo},#{chineseScore},#{mathScore},#{englishScore},#{profileAvatarImage})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int addStu(Student stu);

    /**
     * 删除一条学生信息
     * @param stuNo
     * @return
     */
    @Delete("DELETE FROM student WHERE stu_no=#{stuNo}")
    int deleteStu(String stuNo);

    /**
     * 更新一条学生信息
     * @param stu
     * @return
     */
    @Update("UPDATE student SET chinese_score=#{chineseScore}, math_score=#{mathScore}, english_score=#{englishScore}, profile_avatar_image=#{profileAvatarImage}, update_user=#{updateUser},yn=#{yn} WHERE stu_no=#{stuNo}")
    int updateStu(Student stu);
}
