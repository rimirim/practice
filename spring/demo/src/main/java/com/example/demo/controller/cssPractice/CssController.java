package com.example.demo.controller.cssPractice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/css")
public class CssController {

    /* css 연습 컨트롤러 */

    @GetMapping ("/aboutBox")
    public String aboutBox() {
        log.info("about Box css");

        return "/css/aboutBox";
    }

    @GetMapping("/imageInBox")
    public String imageInBox(){
        log.info("image in box");

        return  "/css/imageInBox";
    }

}

