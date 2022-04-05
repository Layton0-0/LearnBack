package my.com.member;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import my.com.entity.Member;


@Repository
public interface MemberRepository extends JpaRepository<Member, String>{
	
}
