package my.com.board;

import org.springframework.data.jpa.repository.JpaRepository;

import my.com.entity.Board;



public interface BoardRepository extends JpaRepository<Board, Long>{

	
}
