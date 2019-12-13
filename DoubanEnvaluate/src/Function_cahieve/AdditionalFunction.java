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
	
	public void creatLikeList(String lid, String uid, String ln, String lintro, String lpic) {
		
		LikeListDAOImpl LLDI=new LikeListDAOImpl();
		LikeList llist=new LikeList(lid,uid,ln,lintro,lpic);
		LLDI.insertLikeList(llist);
		
	}
	
	public void showPersonInterest(String Uid)
	{
		UserDAOImpl UDI=new UserDAOImpl();
		FeSDAOImpl fesDI=new FeSDAOImpl();
		FFDAOImpl ffDI=new FFDAOImpl();
		FilmDAOImpl FDI = new FilmDAOImpl();
		StuffDAOImpl SDI = new StuffDAOImpl();
		FUDAOImpl fuDI = new FUDAOImpl();
		User user=UDI.getUser(Uid);
		System.out.println("关注的演员：");
		//System.out.println("select * from [FeS] where UID = '" + user.getUID() +"'");
		String sql = "select * from [FeS] where UID = '" + user.getUID() +"'";
		//System.out.println(sql);
		List<FeS>fes = fesDI.getFeSByC(sql);
		for(FeS i : fes)
		{
			Stuff stuff = SDI.getStuff(i.getSID());
			System.out.println(stuff.getSN() + " " + stuff.getSex()+ " " + stuff.getSex()+ " " + stuff.getBDate()+ " " + stuff.getBP()+ " " + stuff.getVoca()+ " " + stuff.getMN());
			System.out.println(stuff.getSIntro());
			
		}
		
		
		System.out.println("关注的电影:");
		sql = "select * from [FF] where UID = '" + user.getUID() +"'";
		//System.out.println(sql);
		List<FF>ff = ffDI.getFFByC(sql);
		for(FF i : ff)
		{
			//System.out.println(i.getFFID());
			Film film = FDI.getFilm(i.getFFID());
			System.out.println(film.getFN());
		}
		System.out.println("关注的用户：");
		sql = "select * from [FU] where UID = '" + user.getUID() +"'";
		//System.out.println(sql);
		List<FU>fu = fuDI.getFUByC(sql);
		for(FU i : fu)
		{
			//System.out.println(i.getFFID());
			User user2 = UDI.getUser(i.getFUID());
			System.out.println(user2.getUN());
		}
	}
}

