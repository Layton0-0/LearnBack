package sample11;


import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

@Configuration
public class MemberFactory {
	
	@Bean
	public DataSource getDataSource() {
		SimpleDriverDataSource dataSource = new SimpleDriverDataSource();
		dataSource.setDriverClass(com.mysql.cj.jdbc.Driver.class);
		dataSource.setUrl("jdbc:mysql://localhost:3306/yoondb");
		dataSource.setPassword("1121");
		dataSource.setUsername("root");
		return dataSource;
	}
	
	@Bean
	public MemberDAO getMemberDAO() {
		MemberDAO dao = new MemberDAO();
		dao.setDataSource(getDataSource());
		return dao;
	}
}
