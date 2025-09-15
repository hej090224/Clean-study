package com.example.clean.application;

import com.example.clean.domain.model.Board;
import com.example.clean.domain.port.in.BoardUseCase;
import com.example.clean.domain.port.out.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardService implements BoardUseCase {

    private final BoardRepository boardRepository;

    @Override
    public Board createBoard(String title, String content) {
        Board board = Board.builder()
                .title(title)
                .content(content)
                .build();
        return boardRepository.save(board);
    }

    @Override
    public List<Board> getBoards() {
        return boardRepository.findAll();
    }

    @Override
    public Board getBoard(Long id) {
        return boardRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("게시글을 찾을 수 없습니다."));
    }

    @Override
    public Board updateBoard(Long id, String title, String content) {
        Board board = getBoard(id);
        board.update(title, content);
        return boardRepository.save(board);
    }

    @Override
    public void deleteboard(Long id) {
        boardRepository.deleteboard(id);
    }
}
