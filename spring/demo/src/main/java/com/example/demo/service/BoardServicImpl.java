package com.example.demo.service;

import com.example.demo.entity.order32.Board;
import com.example.demo.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardServicImpl {

    @Autowired
    BoardRepository repository;

    @Override
    public void register(Board board) {
        repository.create(board);
    }

    @Override
    public List<Board> list() {
        return repository.list();
    }

    @Override
    public Board read(Integer boardNo) {
        return repository.read(boardNo);
    }

    @Override
    public void modify(Board board) {
        repository.update(board);
    }

    @Override
    public void remove(Integer boardNo) {
        repository.delete(boardNo);
    }



}
