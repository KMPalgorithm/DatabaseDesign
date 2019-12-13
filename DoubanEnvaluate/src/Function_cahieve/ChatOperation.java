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
		String sql="select  * from Chat where FID= '"+FID+"'";
		String sqlnum="select  * from Reply where ChatID= ";
		List<Chat> Chats=CDI.getChatByC(sql);
		Iterator<Chat> listNextfilms=Chats.iterator();
		Chat chat=new Chat();
		while(listNextfilms.hasNext())
		{
			chat=listNextfilms.next();
			User user=UDI.getUser(chat.getUID());
			sqlnum=sqlnum+"'"+chat.getCID()+"'";
			List<Reply>replys=RDI.getReplyByC(sqlnum);
			System.out.println("\n\n主题："+chat.getTitle()+"     来自"+user.getUN()+"   "+replys.size()+"回复         "+chat.getDate());
			System.out.println("正文："+chat.getCont());
			for(Reply i : replys)
			{
				User user2=UDI.getUser(i.getUID());
				System.out.println("|------"+i.getCont()+"     来自"+user2.getUN()+"   "+chat.getDate());
			}
	    }
	}
		
	public void CreatFilmChat(String Fid, String Cid, String Uid, Date dat, String titl, String ct, int lnum)
	{
		ChatDAOImpl CDI=new ChatDAOImpl();
	
		Chat chat= new Chat(Fid,Cid,Uid,dat,titl,ct,lnum);
		CDI.insertChat(chat);
		
	}
	
	
	
	
}
