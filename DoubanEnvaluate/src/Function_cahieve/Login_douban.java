package Function_cahieve;

import domain.*;
import DAO.*;
import java.util.*;

public class Login_douban 
{
	
	private UserDAOImpl UDI = new UserDAOImpl();
	
	public boolean Login(){
	    User user=new User();
		String sql = "select * from user where UN =";
		String name="",PWD="";
		Scanner sc= new Scanner(System.in);
		name=sc.next();
		PWD=sc.next();
		sql=sql+name;
		List <User> Users=UDI.getUserByC(sql);
		String PWd_sql=Users.get(0).getPWD();
		return PWd_sql.equals(PWD);
	}
	
	public void Registered() {
		User user=new User();
		Scanner sc= new Scanner(System.in);
		System.out.println("ע����棺");
		System.out.println("�������û���");
		String UN=sc.nextLine();
		System.out.println("����������");
		String PWD=sc.nextLine();
		user.setUN(UN);
		user.setPWD(PWD);
		String uuid = UUID.randomUUID().toString().replaceAll("-","");
		user.setUID(uuid);
		UDI.insertUser(user);
		
		
	}
	
	
}
