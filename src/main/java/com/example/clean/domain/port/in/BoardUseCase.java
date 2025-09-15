package com.example.clean.domain.port.in;

import com.example.clean.domain.model.Board;

import java.util.List;

public interface BoardUseCase {
    Board createBoard(String title, String content);
    List<Board> getBoards();
    Board getBoard(Long id);
    Board updateBoard(Long id, String title, String content);
    void deleteboard(Long id);
}
