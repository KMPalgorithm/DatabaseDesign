package DAO;

import java.util.List;
import domain.*;

public interface ChatDAO {
	public void insertChat(Chat chat);
	public void updateChat(Chat chat);
	public void deleteChat(String cid);
	public Chat getChat(String cid);
	public List<Chat> getChatByC(String sql);
}
