package DAO;

import java.util.List;
import domain.*;

public interface UserDAO {
	public void insertUser(User user);
	public void updateUser(User user);
	public void deleteUser(String uid);
	public User getUser(String uid);
	public List<User> getUserByC(String sql);
}
