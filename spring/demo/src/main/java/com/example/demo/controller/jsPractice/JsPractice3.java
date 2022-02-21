package com.example.demo.controller.order38;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/js3/ncvue")
public class JsPractice3 {

    @GetMapping("/vue-index")
    public String index () {
        log.info("index()");

        return "/ncvue/index";
    }

}
