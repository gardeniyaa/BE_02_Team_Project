package com.b2.supercoding_prj01.web.controller;

import com.b2.supercoding_prj01.Board.Board;
import com.b2.supercoding_prj01.Board.CreateBoard;
import com.b2.supercoding_prj01.Board.ResponseBoard;
import com.b2.supercoding_prj01.Board.UpdateBoard;
import com.b2.supercoding_prj01.exception.BoardNotFoundException;
import com.b2.supercoding_prj01.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.expression.Operation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class BoardController {
    private final BoardService boardService;

    @GetMapping("/")


    public ResponseEntity<?> getAllBoard(@PathVariable long id){

        // Service return
        return ResponseEntity.ok()
                .body("Service return");
    }

    @PostMapping("/")

    public ResponseEntity<?> save(@RequestBody CreateBoard board,
                                  BindingResult result) {
        try {
            if (result.hasErrors()) {
                log.info("BindingResult error : " + result.hasErrors());
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(result.getClass().getSimpleName());

            }
            return ResponseEntity.status(HttpStatus.CREATED).body(boardService.createBoard(board));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }

    // 게시글 수정
    @PutMapping("/{id}")


    public ResponseEntity<?> updateBoard(@PathVariable Long id, @RequestBody UpdateBoard updateBoard, BindingResult result) {
        if (result.hasErrors()) {
            log.info("BindingResult error: " + result.getAllErrors());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(result.getAllErrors());
        }

        try {
            Board updatedMember = boardService.updateBoard(id, updateBoard);

            return ResponseEntity.ok().body(ResponseBoard.of(updatedMember));
        } catch (BoardNotFoundException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }
}
