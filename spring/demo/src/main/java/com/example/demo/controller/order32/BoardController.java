package com.example.demo.controller.order32;


import com.example.demo.entity.order32.Board;
import com.example.demo.service.order32.BoardService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/32th/board")
public class BoardController {

    // Autowired --- @Service와 연결
    //           --- @Repository와 연결
    @Autowired
    private BoardService boardService;

    // 게시판 등록폼
    @GetMapping("/register")
    public String registerForm (Board board) {

        log.info("register Form");

        return "/32th/board/register";
    }

    // 게시판 등록을 하게되면 post를 통해 db쪽에 저장
   @PostMapping("/register")
    public String register (Board board, Model model){
        log.info("DB register - board 정보: " + board);

        // 이동경로 (Autowired에 의해) boardServiceImlp -> BoardRepository create
       // created에서 쿼리에 의해 register html 폼에서 수정된 내용이 db에 update된다.
        boardService.register(board);

        // 글쓰기가 성공했음을 보여줌
        return "/32th/board/success";
   }

   // 글 목록. 사실상 처음으로 보여질 페이지
   @GetMapping("/list")
    public String list (Model model){
        log.info("list");

       // DB에 저장된 데이터(글 목록)를 읽어서 list 속성에 설정
        model.addAttribute("list", boardService.list());

        return "/32th/board/list";

   }

   // 글 제목을 누르면 글을 확인할 수 있도록
   // 여기에는 수정과 삭제 버튼이 있어야함
   @GetMapping("/read")
    public String read (int boardNo, Model model){
        log.info("read");

        model.addAttribute(boardService.read(boardNo));

        return "/32th/board/read";
   }

   @GetMapping("modify")
    public String modifyForm (int boardNo, Model model){
        log.info("modifyForm");

        model.addAttribute(boardService.read(boardNo));

        return "/32th/board/modify";
   }

    @PostMapping("/modify")
    public String modify (Board board, Model model) {
        log.info("modify");

        // DB에 내용 갱신
        boardService.modify(board);

        // 성공 메시지 출력
        return "/32th/board/success";
    }

    @PostMapping("/remove")
    public String remove (int boardNo, Model model) {
        log.info("remove");

        // DB에서 내용 삭제
        boardService.remove(boardNo);

        // 성공 메시지 출력
        return "/32th/board/success";
    }
}
