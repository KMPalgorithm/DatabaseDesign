package DAO;

import java.util.List;
import domain.*;

public interface UserDAO { //user类的DAO接口，需要基本的增删改查功能
	public void insertUser(User user);
	public void updateUser(User user);
	public void deleteUser(String uid);
	public User getUser(String uid);
	public List<User> getUserByC(String sql);
}
