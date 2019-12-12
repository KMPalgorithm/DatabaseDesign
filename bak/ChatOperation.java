package Function_cahieve;

import java.sql.Date;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import domain.*;
import DAO.*;

public class ChatOperation {

	public void showFilmChat(String FID) {
		ChatDAOImpl CDI=new ChatDAOImpl();
		UserDAOImpl UDI=new UserDAOImpl();
		ReplyDAOImpl RDI=new ReplyDAOImpl();
		String sql="select  * from Chat where FID= ";
		String sqlnum="select  * from Reply where ChatID= ";
		List<Chat> Chats=CDI.getChatByC(sql);
		Iterator<Chat> listNextfilms=Chats.iterator();
		Chat chat=new Chat();
		while(listNextfilms.hasNext())
		{
			chat=listNextfilms.next();
			User user=UDI.getUser(chat.getUID());
			sqlnum=sqlnum+chat.getCID();
			List<Reply>replys=RDI.getReplyByC(sqlnum);
			System.out.print(chat.getTitle()+"     À´×Ô"+user.getUN()+"   "+replys.size()+"»Ø¸´         "+chat.getDate());
	    }
		
		
	public void CreatFilmChat()
	{
		
	}
	
}
