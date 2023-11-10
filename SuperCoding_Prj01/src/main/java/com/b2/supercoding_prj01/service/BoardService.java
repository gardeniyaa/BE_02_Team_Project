package com.b2.supercoding_prj01.service;

import com.b2.supercoding_prj01.Board.Board;
import com.b2.supercoding_prj01.Board.CreateBoard;
import com.b2.supercoding_prj01.Board.UpdateBoard;

public interface BoardService {

    Board creatPost(CreateBoard board);

    String updateBoard(Long id, UpdateBoard updateBoard);

    Object createBoard(CreateBoard board);
}
