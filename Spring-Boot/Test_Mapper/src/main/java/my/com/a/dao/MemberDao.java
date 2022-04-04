package my.com.a.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import my.com.a.dto.MemberDto;

@Mapper
@Repository
public interface MemberDao {

	public List<MemberDto> allMember();
	
	public List<MemberDto> insertMember();
}







