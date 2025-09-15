package com.example.clean.adapter.out.peristence;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.clean.domain.model.Board;

public interface JpaBoardRepository extends JpaRepository<Board, Long> {
}
