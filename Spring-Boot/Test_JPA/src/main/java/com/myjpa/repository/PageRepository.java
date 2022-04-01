package com.myjpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myjpa.domain.Book;

// 사용자 조건코드를 추가하고 싶으면 class implements로 Repository 재정의
// jpa가 주는 메소드를 그냥 가져다 쓰고 싶으면 interface extends로 -> 추천
@Repository("pageRepository")
public interface PageRepository extends JpaRepository<Book, Long>{
	
	
	
}
