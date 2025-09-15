package com.example.clean.domain.port.out;

import com.example.clean.domain.model.Board;

import java.util.List;
import java.util.Optional;

public interface BoardRepository {
    Board save(Board board);
    List<Board> findAll();
    Optional<Board> findById(Long id);
    void deleteboard(Long id);
}
