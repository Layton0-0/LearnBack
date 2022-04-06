package com.web;

import org.junit.Test;

import com.web.domain.Board;
import com.web.domain.User;
import com.web.domain.enums.BoardType;
import com.web.repository.BoardRepository;
import com.web.repository.UserRepository;

import org.junit.Before;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
@RunWith(SpringRunner.class)
@DataJpaTest
class JPATest{
	 private final String boardTestTitle = "테스트";
	    private final String email = "samsumg@gmail.com";

	    @Autowired
	    UserRepository userRepository;

	    @Autowired
	    BoardRepository boardRepository;


	    @Before
	    public void init() {
	        User user = userRepository.save(User.builder()
	                .name("samsung")
	                .password("test")
	                .email(email)
	                .createdDate(LocalDateTime.now())
	                .build());

	        boardRepository.save(Board.builder()
	                .title(boardTestTitle)
	                .subTitle("서브 타이틀")
	                .content("컨텐츠")
	                .boardType(BoardType.free)
	                .createdDate(LocalDateTime.now())
	                .updatedDate(LocalDateTime.now())
	                .user(user).build());
	    }

	    @Test
	    public void dbTest() {
	        User user = userRepository.findByEmail(email);
	        assertThat(user.getName(), is("havi"));
	        assertThat(user.getPassword(), is("test"));
	        assertThat(user.getEmail(), is(email));

	        Board board = boardRepository.findByUser(user);
	        assertThat(board.getTitle(), is(boardTestTitle));
	        assertThat(board.getSubTitle(), is("서브 타이틀"));
	        assertThat(board.getContent(), is("컨텐츠"));
	        assertThat(board.getBoardType(), is(BoardType.free));
	    }

}
