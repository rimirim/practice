package com.example.demo.service.order32;

import com.example.demo.entity.order32.Board;

import java.util.List;

public interface BoardService {

    // 게시판을 만들기 위해
    // 등록, 게시글 목록, 읽기, 수정, 제거의 동작이 필요하다

    public void register (Board board);
    public List<Board> list ();
    public Board read (Integer boardNo);
    public void modify (Board board);
    public void remove (Integer boardNo);


}
