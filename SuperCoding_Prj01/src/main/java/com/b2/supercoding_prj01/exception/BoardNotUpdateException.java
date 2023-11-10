package com.b2.supercoding_prj01.exception;

public class BoardNotUpdateException extends RuntimeException{
    public BoardNotUpdateException(){
        super("해당 게시물을 수정할 수 없습니다. 제목이나 내용은 빈칸이 될 수 없습니다.");
    }
}
