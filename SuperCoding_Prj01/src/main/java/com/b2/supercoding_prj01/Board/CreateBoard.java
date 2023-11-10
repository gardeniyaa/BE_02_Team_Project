package com.b2.supercoding_prj01.Board;

import com.b2.supercoding_prj01.entity.UserEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.sql.Timestamp;

@Builder
@RequiredArgsConstructor
@Getter


public class CreateBoard {

    private final Long boardId;
    private final UserEntity userEntity;
    private final String email;
    private final String title;
    private final String author;
    private final Timestamp createdAt;
    private final String content;


}
