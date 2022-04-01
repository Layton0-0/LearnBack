package com.myjpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.myjpa.domain.Book;
import com.myjpa.repository.MyRepository;
import com.myjpa.repository.PageRepository;

@Service
public class MyService {
	@Autowired
	private MyRepository repository; // = DAO
	
	@Autowired
	@Qualifier("pageRepository") // 오토와이어 구분화
	private PageRepository pageRepository;
	
	public void save(String title) {
		Book book = new Book();
		book.setTitle(title);
		this.repository.save(book);
	}
	
	public List<Book> findAll(){
		return this.repository.findAll();
	}
	
	// 만들어진 DAO를 호출하는 사용자 메소드
	public Page<Book> findAll02(){
		Page<Book> book = pageRepository.findAll(PageRequest.of(0, 20));
		return book;
	}
	
	// PageRequest(표시되는 페이지와 sort, 대상)
	public Page<Book> findAll03(PageRequest pre){
		Page<Book> book = pageRepository.findAll(pre);
		return book;
	}
}
