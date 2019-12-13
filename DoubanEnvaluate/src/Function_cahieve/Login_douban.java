package Function_cahieve;

import domain.*;
import DAO.*;
import java.util.*;

public class Login_douban 
{
	
	private UserDAOImpl UDI = new UserDAOImpl();
	
	public boolean Login(){
	    User user=new User();
		String sql = "select * from [user] where UN =";
		String name="",PWD="";
		System.out.println("User name:");
		Scanner sc= new Scanner(System.in);
		name=sc.next();
		System.out.println("User password:");
		PWD=sc.next();
		sql=sql + "'" + name + "'" ;
		List <User> Users=UDI.getUserByC(sql);
		if(Users.size()==0)
		{
			System.out.println("User not found!");
			return false;
		}
		String PWd_sql=Users.get(0).getPWD();
		return PWd_sql.equals(PWD);
	}
	
	public void Registered() {
		User user=new User();
		Scanner sc= new Scanner(System.in);
		System.out.println("注册界面：");
		System.out.println("请输入用户名");
		String UN=sc.nextLine();
		String sql = "select * from [user] where UN =" + "'" + UN + "'";
		List <User> Users=UDI.getUserByC(sql);
		if(Users.size() > 0)
		{
			System.out.println("用户名已被占用");
			return;
		}
		System.out.println("请输入密码");
		String PWD=sc.nextLine();
		user.setUN(UN);
		user.setPWD(PWD);
		String uuid = UUID.randomUUID().toString().replaceAll("-","");
		user.setUID(uuid);
		UDI.insertUser(user);
		
		
	}
	
	
}
