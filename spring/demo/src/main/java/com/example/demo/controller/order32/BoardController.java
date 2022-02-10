package com.example.demo.controller.order32;


import com.example.demo.entity.order32.Board;
import com.example.demo.service.BoardService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/32th/board")
public class BoardController {

    // Autowired --- @Service와 연결
    //           --- @Repository와 연결
    @Autowired
    private BoardService boardService;

    // 게시판 등록
    @GetMapping("/register")
    public String registerForm (Board board) {

        log.info("register Form");

        return "/32th/board/register";

    }

}
