package com.myjpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myjpa.domain.Book;

/*
 * 커스텀 dao를 만들고 싶다.
 * 1. JpaRepository extends -> CRUD / page 메소드 추가
 * 2. JpaRepository implements를 한 후 class로 만들어 메소드 추가.
 * 3. 여러개의 다중 테이블을 가지고 다중 매핑(매핑과 조인), 동적쿼리 = 4.8.1 Query Extension
 * https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#core.extensions.querydsl
 * 1차: 스프링 부트, jdbc + mapper(mybatis) + f, jpa
 * 2차: 스트링부트, jpa[querydsl extension, f, 기능추가]

 * */

@Repository
public interface MyRepository extends JpaRepository<Book, Long> {
	
}
