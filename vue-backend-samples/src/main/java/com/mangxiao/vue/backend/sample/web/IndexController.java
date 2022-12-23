package com.mangxiao.vue.backend.sample.web;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Api("Vue后端CRUD的api清单")
@RequestMapping(value = "/")
@RestController
public class IndexController {
    private static Log log = LogFactory.getLog(IndexController.class);

    @ApiOperation("首页测试")
    @RequestMapping(value = "/index")
    @ResponseBody
    public String index(@RequestParam("id") Long id){
        log.info("....index.......");
        log.info("#~id:"+id);
        return "ok";
    }
}
