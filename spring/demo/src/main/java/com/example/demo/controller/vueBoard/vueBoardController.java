package com.example.demo.controller.vueBoard;

import com.example.demo.entity.order32.Board;
import com.example.demo.service.order32.BoardService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@Controller
@RequestMapping("/vueBoard")
@CrossOrigin(origins = "http://localhost:8081", allowedHeaders = "*")
public class vueBoardController {

    @Autowired
    private BoardService service;

    @GetMapping("/list")
    public ResponseEntity<List<Board>> getVueBoardList (){
        log.info("getVueBoardList()");

        return new ResponseEntity<>(service.list(), HttpStatus.OK);
    }
}