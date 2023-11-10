package com.b2.supercoding_prj01.entity;

import com.b2.supercoding_prj01.Board.Board;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "board")
public class BoardEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "board_idx")
    private Long boardId;

    @ManyToOne
    @JoinColumn(name = "user_idx")
    private UserEntity userEntity;

    private String email;
    private String title;
    private String author;

    @Column(name = "created_at")
    private Timestamp createdAt;

    private String content;

    @Builder
    public BoardEntity(Long boardId, UserEntity userEntity, String email, String title, String author, Timestamp createdAt, String content) {
        this.boardId = boardId;
        this.userEntity = userEntity;
        this.email = email;
        this.title = title;
        this.author = author;
        this.createdAt = createdAt;
        this.content = content;
    }


    //DTO to Entity
    public static BoardEntity from(Board board) {
        return BoardEntity.builder()
                .boardId(board.getId())
                .userEntity(board.getuserEntity())
                .email(board.getemail())
                .title(board.gettitle())
                .author(board.author())
                .createdAt(board.getcreateAt())
                .build();

    }

    //Entity to DTO
    public Board toDTO() {
        return Board.builder()
                .boardId(this.boardId)
                .userEntity(this.userEntity)
                .eamil(this.email)
                .title(this.title)
                .author(this.author)
                .createdAt(this.createdAt)
                .content(this.content)
                .build();
    }
}

