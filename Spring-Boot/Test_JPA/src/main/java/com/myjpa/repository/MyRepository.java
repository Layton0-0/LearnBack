package com.myjpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myjpa.domain.Book;

@Repository
public interface MyRepository extends JpaRepository<Book, Long> {
	
}
