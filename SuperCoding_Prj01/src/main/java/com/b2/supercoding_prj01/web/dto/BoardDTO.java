package com.b2.supercoding_prj01.web.dto;

import com.b2.supercoding_prj01.entity.BoardEntity;
import com.b2.supercoding_prj01.entity.UserEntity;
import lombok.Builder;

import java.sql.Timestamp;

public class BoardDTO {
    private static Long boardId;
    private UserEntity userEntity;
    private String email;
    private String title;
    private String author;
    private Timestamp createdAt;
    private String content;

    @Builder

    public BoardDTO(Long boardId, UserEntity userEntity, String email, String title, String author, Timestamp createdAt, String content) {
        this.boardId = boardId;
        this.userEntity = userEntity;
        this.email = email;
        this.title = title;
        this.author = author;
        this.createdAt = createdAt;
        this.content = content;
    }

    //Entity to DTO
    public static BoardDTO from(BoardEntity board){
        .boardId(board.getBoardId())
        .userEntity(board.getUserEntity())
                .emil(board.getEmail())
                .title(board.getEmail())
                .author(board.getAuthor())
                .createdAt(board.getCreatedAt())
                .content(board.getContent())

    }

    public void redisBoard(String email, String title, String author, String content){
        this.email=email;
        this.title=title;
        this.author=author;
        this.content=content;

    }

}
