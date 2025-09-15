package com.example.clean.adapter.in.web;

import com.example.clean.domain.model.Board;
import com.example.clean.domain.port.in.BoardUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/boards")
@RequiredArgsConstructor
public class BoardController {

    private final BoardUseCase boardUseCase;

    @PostMapping
    public Board create(@RequestBody Board request) {
        return boardUseCase.createBoard(request.getTitle(), request.getContent());
    }

    @GetMapping
    public List<Board> getBoards() {
        return boardUseCase.getBoards();
    }

    @GetMapping("load/{id}")
    public Board getBoard(@PathVariable Long id) {
        return boardUseCase.getBoard(id);
    }

    @PutMapping("edit/{id}")
    public Board updateBoard(@PathVariable Long id, @RequestBody Board request) {
        return boardUseCase.updateBoard(id, request.getTitle(), request.getContent());
    }

    @DeleteMapping("delete/{id}")
    public void deleteBoard(@PathVariable Long id) {
        boardUseCase.deleteboard(id);
    }
}
