package sample3;

public class UserServiceImpl implements UserService{
	public UserServiceImpl() {
		super();
		System.out.println("UserService 생성자 호출");	
	}

	@Override
	public void addUser(UserVo vo) {
		System.out.println("UserService : addUser()메서드 호출");
		System.out.println("이름 : " + vo.getUserName());
	}

}
