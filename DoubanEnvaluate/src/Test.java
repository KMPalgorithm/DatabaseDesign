import domain.*;
import DAO.*;
import Function_cahieve.*;
import java.sql.*;
import java.util.*;

public class Test {

	public static void main(String[] args) {
		/*Login_douban ldb = new Login_douban ();
		while(!ldb.Login())
		{
			System.out.println("Wrong!");
		}
		ldb.Registered();*/
		FilmShow fms = new FilmShow();
		fms.FindNameShowFilm();
		/*String name;
		Scanner sc= new Scanner(System.in);
		AdditionalFunction adf=new AdditionalFunction();
		name=sc.next();
		UserDAOImpl UDI = new UserDAOImpl();
		List<User> users = UDI.getUserByC("select * from [user] where UN ='" + name +"'");
		for(User i: users)
		adf.showPersonInterest(i.getUID());*/
		// TODO Auto-generated method stub
		/*User user1 = new User("111","Luochen","ISUCKDICK","138123456789","WOSI@SUOZAI.com");
		UserDAOImpl UDI = new UserDAOImpl();
		UDI.insertUser(user1);
		user1 = new User("112","asdf","ISUCKDICK","138123456789","WOxI@SUOZAI.com");
		UDI.insertUser(user1);
		user1 = new User("113","LYZ","ISUCKDICK","138123456789","WOaI@SUOZAI.com");UDI.insertUser(user1);
		user1 = new User("114","LCX","ISUCKDICK","138123456789","WOdIo@SUOZAI.com");UDI.insertUser(user1);
		user1 = new User("115","LX","IHAVENODICK","1333333333","WOShI@SUOZAI.com");UDI.insertUser(user1);
		user1 = UDI.getUser("114");
		System.out.println(user1.getEmail());*/
		/*Film film1=new Film("11011","PornFIlm","erotic","Euro","Dontknow", 1, "aa","bbb","cccc");
		FilmDAOImpl FDI = new FilmDAOImpl();
		FDI.insertFilm(film1);*/
		//TagDAOImpl TDI = new TagDAOImpl();
		/*Tag tag = new Tag("001","Nonsense");
		TDI.insertTag(tag);
		tag = new Tag("002","Nonsense");
		TDI.insertTag(tag);
		tag = new Tag("003","SB");
		TDI.insertTag(tag);*/
		//Tag tag = TDI.getTag("002");
		//System.out.println(tag.getTID() + " " + tag.getTN());
		/*AwardDAOImpl ADI = new AwardDAOImpl();
		Award award = new Award("111","123","asd");
		ADI.insertAward(award);
		award = new Award("121","123","absd");
		ADI.insertAward(award);
		award = ADI.getAward("111");*/
		/*StuffDAOImpl SDI = new StuffDAOImpl();
		java.util.Date datee = new java.util.Date();
		java.sql.Date date = new java.sql.Date(datee.getTime());
		Stuff stuff = new Stuff("1","1","1",date,"1","1","1","1","1");
		SDI.insertStuff(stuff);*/
		/*LikeListDAOImpl LLDI = new LikeListDAOImpl();
		LikeList ll = new LikeList("1","123","11011","f","f","f");
		LLDI.insertLikeList(ll);*/
		/*ChatDAOImpl CDI = new ChatDAOImpl();
		java.util.Date dd = new java.util.Date();
		java.sql.Date date = new java.sql.Date(dd.getTime());
		Chat ct = new Chat("11011","101","123",date,"sb","hehe",10086);
		CDI.insertChat(ct);*/
		/*EvaluateDAOImpl EDI = new EvaluateDAOImpl();
		java.util.Date dd = new java.util.Date();
		java.sql.Date date = new java.sql.Date(dd.getTime());
		Evaluate eva;
		try{
		eva = new Evaluate("123","11011",5,"123","¿´¹ý","123123123",date);EDI.insertEvaluate(eva);}
		catch(Exception ee){ee.printStackTrace();}*/
		/*ReplyDAOImpl RDI = new ReplyDAOImpl();
		java.util.Date dd = new java.util.Date();
		java.sql.Date date = new java.sql.Date(dd.getTime());
		Reply reply = new Reply("101","123",date,"sb",10);
		RDI.insertReply(reply);*/
		/*ATypeDAOImpl ATDI = new ATypeDAOImpl();
		AType atype = new AType("0123","1234");
		ATDI.insertAType(atype);*/
		/*AwardsDAOImpl ASDI = new AwardsDAOImpl();
		Awards awards = new Awards("111","0123","11011","1");
		
		ASDI.insertAwards(awards);*/
		/*LtoFDAOImpl tmpDI = new LtoFDAOImpl();
		LtoF fes = tmpDI.getLtoF("2","27119724");
		System.out.println(fes.getLID() + " " + fes.getFID());*/
		/*LikeListDAOImpl LLDI = new LikeListDAOImpl();
		LikeList ll = LLDI.getLikeList("2");
		System.out.println(ll.getLID()+" "+ll.getUID()+ll.getLN()+ll.getLIntro()+ll.getLPic());*/
		
	}

}
