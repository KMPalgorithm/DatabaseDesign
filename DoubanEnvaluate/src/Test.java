import domain.*;
import DAO.*;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user1 = new User("111","Luochen","ISUCKDICK","138123456789","WOSI@SUOZAI.com");
		UserDAOImpl UDI = new UserDAOImpl();
		UDI.updateUser(user1);
		/*user1 = new User("112","asdf","ISUCKDICK","138123456789","WOxI@SUOZAI.com");
		UDI.insertUser(user1);
		user1 = new User("113","LYZ","ISUCKDICK","138123456789","WOaI@SUOZAI.com");UDI.insertUser(user1);
		user1 = new User("114","LCX","ISUCKDICK","138123456789","WOdIo@SUOZAI.com");UDI.insertUser(user1);
		user1 = new User("115","LX","IHAVENODICK","1333333333","WOShI@SUOZAI.com");UDI.insertUser(user1);*/
		user1 = UDI.getUser("114");
		System.out.println(user1.getEmail());
	}

}
