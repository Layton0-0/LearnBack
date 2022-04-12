package com.my.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.my.domain.Board;

@Repository
public interface BoardRepository extends JpaRepository<Board, String> {

}
