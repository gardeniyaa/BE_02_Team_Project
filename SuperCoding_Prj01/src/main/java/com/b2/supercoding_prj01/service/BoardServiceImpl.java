package com.b2.supercoding_prj01.service;

import com.b2.supercoding_prj01.Board.Board;
import com.b2.supercoding_prj01.Board.CreateBoard;
import com.b2.supercoding_prj01.Board.UpdateBoard;
import com.b2.supercoding_prj01.repository.BoardRepository;
import org.springframework.transaction.annotation.Transactional;

public class BoardServiceImpl implements BoardService{

    private  final BoardRepository boardRepository;

    @Override
    @Transactional
    public Board creatBoard(CreateBoard board) {
        Board newBoard=Board.builder()
                .boardId(board.getBoardId())
                .userEntity(board.getBoardId())
                .email(board.getEmail())
                .title(board.getTitle())
                .author(board.getAuthor())
                .createdAt(board.getCreatedAt())
                .content(board.getContent())
                .build();

        return boardRepository.creatBoard(newBoard);
    }


}
