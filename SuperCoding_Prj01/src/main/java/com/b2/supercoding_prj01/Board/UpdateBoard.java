package com.b2.supercoding_prj01.Board;

import lombok.Builder;
import lombok.Getter;

@Getter
public class UpdateBoard {

    private final String email;
    private final String title;
    private final String author;
    private final String content;

    @Builder
    public  UpdateBoard(String email, String title, String author, String content, String email1, String title1, String author1, String content1)
    this.email=email;
    this.title=title;
    this.author=author;
    this.content=content;

}
