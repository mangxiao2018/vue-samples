package com.mangxiao.vue.backend.sample.web;

import com.mangxiao.vue.backend.sample.model.Student;
import com.mangxiao.vue.backend.sample.service.StudentService;
import com.mangxiao.vue.backend.sample.util.Pages;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.ibatis.annotations.Param;
import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api("Vue后端CRUD的api清单")
@RequestMapping(value = "/stu")
@RestController
public class StudentController {

    private static Log log = LogFactory.getLog(StudentController.class);

    @Autowired
    private StudentService studentService;

    @ApiOperation("有条件的分页查询所有学生信息")
    @RequestMapping(value = "/queryStudentsByPage")
    @ResponseBody
    public List<Student> queryStudentsByPage(Student student, @RequestParam(defaultValue = "1",value = "pageNo") Integer pageNo, @RequestParam(defaultValue = "10",value = "pageSize") Integer pageSize){
        log.info("....queryStudentsByPage.......");
        Pages p = new Pages(pageNo, pageSize);
        List<Student> dataList = studentService.getStusByPage(student, p);
        for (Student stu : dataList){
            log.info(stu.toString());
        }
        return dataList;
    }

    @ApiOperation("通过学号stuNo获取该学生信息")
    @RequestMapping(value = "/getStudentByNo")
    @ResponseBody
    public Student getStudentByNo(Student student){
        Student ret = studentService.getStu(student);
        return ret;
    }

    @ApiOperation("获取所有学生信息不带分页")
    @RequestMapping(value = "/getStudents")
    @ResponseBody
    public List<Student> getStudents(){
        List<Student> dataList = studentService.getAll();
        return dataList;
    }


    @ApiOperation("新增一条学生信息")
    @RequestMapping(value = "/addStu")
    @ResponseBody
    public Boolean addStudent(Student student){
        Boolean ret = studentService.addStu(student);
        return ret;
    }


    @ApiOperation("删除一条学生信息")
    @RequestMapping(value = "/deleteStudent")
    @ResponseBody
    public Boolean deleteStudent(@Param("stuNo") String stuNo){
        Boolean ret = studentService.deleteStu(stuNo);
        return ret;
    }


    @ApiOperation("更新一条学生信息")
    @RequestMapping(value = "/updateStu")
    @ResponseBody
    public Boolean updateStudent(Student student){
        Boolean ret = studentService.updateStu(student);
        return ret;
    }
}
