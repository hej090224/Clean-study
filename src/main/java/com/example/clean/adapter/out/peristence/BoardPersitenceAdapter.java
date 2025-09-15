package com.example.clean.adapter.out.peristence;

import com.example.clean.domain.model.Board;
import com.example.clean.domain.port.out.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class BoardPersitenceAdapter implements BoardRepository {

    private final JpaBoardRepository jpaBoardRepository;

    @Override
    public Board save(Board board) {
        return jpaBoardRepository.save(board);
    }

    @Override
    public List<Board> findAll() {
        return jpaBoardRepository.findAll();
    }

    @Override
    public Optional<Board> findById(Long id) {
        return jpaBoardRepository.findById(id);
    }

    @Override
    public void deleteboard(Long id) {
        jpaBoardRepository.deleteById(id);
    }
}
