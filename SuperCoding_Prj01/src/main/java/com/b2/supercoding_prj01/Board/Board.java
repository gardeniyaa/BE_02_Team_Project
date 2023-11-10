package com.b2.supercoding_prj01.Board;

import com.b2.supercoding_prj01.entity.BoardEntity;
import com.b2.supercoding_prj01.entity.UserEntity;
import lombok.Builder;
import lombok.Getter;

import java.sql.Timestamp;

@Getter
public class Board {

    private final Long boardId;
    public Long getId;
    private UserEntity userEntity;

    private String email;
    private String title;
    private String author;
    private Timestamp createdAt;

    private String content;

    @Builder
    public Board(Long boardId, UserEntity userEntity, String email, String title, String author, Timestamp createdAt, String content) {
        this.boardId = boardId;
        this.userEntity = userEntity;
        this.email = email;
        this.title = title;
        this.author = author;
        this.createdAt = createdAt;
        this.content = content;
    }

    public static Board from(BoardEntity board){
        return Board.builder()
                .boardId(board.getBoardId())
                .userEntity(board.getUserEntity())
                .email(board.getEmail())
                .title(board.getTitle())
                .author(board.getAuthor())
                .createdAt(board.getAuthor())
                .content(board.getContent())
                .build();
    }

    public void updateBoard(String boardId, String userEntity, String email, String title, String author, String createdAt, String content){
        this.boardId = boardId;
        this.userEntity = userEntity;
        this.email = email;
        this.title = title;
        this.author = author;
        this.createdAt = createdAt;
        this.content = content;
    }

    public static Object builder() {
    }

    public Long getId() {
    }

    public UserEntity getuserEntity() {
    }

    public String getemail() {
    }

    public String gettitle() {
    }

    public String author() {
    }

    public Timestamp getcreateAt() {
    }

    public String getauthor() {
    }

    public String getcontent() {
    }
}
