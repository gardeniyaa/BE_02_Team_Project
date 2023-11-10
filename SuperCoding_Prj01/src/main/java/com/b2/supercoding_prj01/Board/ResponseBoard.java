package com.b2.supercoding_prj01.Board;

import com.b2.supercoding_prj01.entity.UserEntity;
import lombok.Builder;
import lombok.Getter;

import java.sql.Timestamp;

@Builder
@Getter
public class ResponseBoard {

    private final Long boardId;
    private final UserEntity userEntity;
    private final String email;
    private final String title;
    private final String author;
    private final Timestamp createdAt;
    private final String content;


    public ResponseBoard(Long boardId, UserEntity userEntity, String email, String title, String author, Timestamp createdAt, String content) {
        this.boardId = boardId;
        this.userEntity = userEntity;
        this.email = email;
        this.title = title;
        this.author = author;
        this.createdAt = createdAt;
        this.content = content;
    }

    public static ResponseBoard of(Board board){
        return ResponseBoard.builder()
                .boardId(board.getId())
                .userEntity(board.getuserEntity())
                .email(board.getemail())
                .title(board.gettitle())
                .author(board.getauthor())
                .createdAt(board.getcreateAt())
                .content(board.getcontent())
                .build();
    }
}
