package com.yujunquan.studylife.projects.mvc.controller;


import com.yujunquan.studylife.projects.mvc.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    private HelloService helloService;

    @RequestMapping("/")
    public String hello(){

        return "hello";
    }

    @RequestMapping("/hello/{contents}")
    public String sayBack(@PathVariable String contents){
        contents = helloService.sayBack(contents);
        return contents;
    }

}
