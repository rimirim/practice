package com.example.demo.controller.jsPractice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/js")
public class JsPractice {

    @GetMapping("/boolTest")
    public String boolTest (){
        log.info ("boolean Test");

        return "/js/boolTest";
    }
    @GetMapping("/classTest")
    public String classTest (){
        log.info ("class Test");

        return "/js/classTest";
    }
}
