package Function_cahieve;


import java.sql.Date;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import domain.*;
import DAO.*;

public class AdditionalFunction {

	public void showLikeList(String Lid)
	{
		LikeListDAOImpl LLDI=new LikeListDAOImpl();
		UserDAOImpl UDI=new UserDAOImpl();
		LikeList llist=LLDI.getLikeList(Lid);
		User user=UDI.getUser(llist.getUID());
		System.out.println(llist.getLN()+" "+user.getUN()+"  "+llist.getLIntro()+" "+llist.getLPic());		
	}
	
	public void creatLikeList(String lid, String uid, String fid, String ln, String lintro, String lpic) {
		
		LikeListDAOImpl LLDI=new LikeListDAOImpl();
		LikeList llist=new LikeList(lid,uid,fid,ln,lintro,lpic);
		LLDI.insertLikeList(llist);
		
	}
	
	
	
}
