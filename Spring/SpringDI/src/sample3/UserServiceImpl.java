package sample3;

public class UserServiceImpl implements UserService{
	public UserServiceImpl() {
		super();
		System.out.println("UserService ������ ȣ��");	
	}

	@Override
	public void addUser(UserVo vo) {
		System.out.println("UserService : addUser()�޼��� ȣ��");
		System.out.println("�̸� : " + vo.getUserName());
	}

}
