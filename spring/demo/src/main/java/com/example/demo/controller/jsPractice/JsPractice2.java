package com.example.demo.controller.order41;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/js2/jsArray")
public class JsPractice2 {

    @GetMapping("/usefulAPI")
    public String getUsefulAPI () {
        log.info("getUsefulAPI()");

        return "/js/usefulArrayApi";
    }

    @GetMapping("/repeatAPI")
    public String getRepeatAPI () {
        log.info("getRepeatAPI()");

        return "/js/repeatArrayApi";
    }
}
