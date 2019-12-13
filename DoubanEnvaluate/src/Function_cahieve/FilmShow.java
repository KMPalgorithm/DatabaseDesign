package Function_cahieve;
import domain.*;
import DAO.*;
import java.util.*;

public class FilmShow {
 
	public double[] avgScore(String FID) {
		double[] fb=new double[7];
		fb[0]=0;
		fb[1]=0;
		fb[2]=0;
		fb[3]=0;
		fb[4]=0;
		fb[5]=0;
		fb[6]=0;//count
		String sql="select  * from Evaluate where FID= "+FID;
		EvaluateDAOImpl EDI=new EvaluateDAOImpl();
		List<Evaluate> evaluates=EDI.getEvaluateByC(sql);
		Iterator<Evaluate> listNextes=evaluates.iterator();
		while(listNextes.hasNext())
		{
			Evaluate curr=listNextes.next();
			if(curr.getStatus().equals("����"))
			{
				fb[0]+=curr.getScore();
				fb[curr.getScore()]+=1;
				fb[6]+=1;
			}
		}
		if(fb[6] < 3)
		{
			fb[0] = -1;
			return fb;
		}
		fb[0]=(fb[0]*2)/fb[6];
		return fb;
	}

	public void EvaluateShow(String FID) {
		EvaluateDAOImpl EDI=new EvaluateDAOImpl();
		UserDAOImpl UDI=new UserDAOImpl();
		String sql="select  * from Evaluate where FID='" + FID +"'";
		List<Evaluate> evaluates=EDI.getEvaluateByC(sql);
		Iterator<Evaluate> listNextes=evaluates.iterator();
		while(listNextes.hasNext())
		{
			Evaluate curr=listNextes.next();
			String Uname=UDI.getUser(curr.getUID()).getUN();
			System.out.println(Uname+" "+curr.getStatus()+" "+curr.getScore()+" "+curr.getEDate());
			System.out.println(curr.getCMT());
		}
		
		
	}
	
	public void AwardShow(String FID) {
		System.out.println("�������");
		AwardsDAOImpl ASDI=new AwardsDAOImpl();
		ATypeDAOImpl ATDI=new ATypeDAOImpl();
		AwardDAOImpl ADI=new AwardDAOImpl();
		StuffDAOImpl SDI=new StuffDAOImpl();
		String sql="select  * from Awards where FID=";
		List<Awards> aws=ASDI.getAwardsByC(sql);
		Iterator<Awards> listNextas=aws.iterator();
		while(listNextas.hasNext())
		{
			Awards curr=listNextas.next();
			System.out.print(ADI.getAward(curr.getAID()).getAName()+" ");
			System.out.print(ATDI.getAType(curr.getATID()).getTName()+" ");
			System.out.print(SDI.getStuff(curr.getSID()).getSN());
		}
	}
	
	public void TagShow(String FID){
		String sql="select top 10 * from FT where FID= '"+FID+"' order by tc desc" ;
		FTDAOImpl FTDI=new FTDAOImpl();
		TagDAOImpl TDI=new TagDAOImpl();
		List<FT>tags=FTDI.getFTByC(sql);
		/*Collections.sort(tags,new Comparator<FT>() {
			@Override
			public int compare(FT a,FT b) {
				return b.getTC()-a.getTC();
			}
		});*/
		Iterator<FT> listNext=tags.iterator();
		int cnt=0;
		while(listNext.hasNext()) {
			FT curr=listNext.next();
			System.out.print(TDI.getTag(curr.getTID()).getTN()+" ");
			cnt++;
			if(cnt==10)
				break;
			if(cnt==5)
				System.out.println("");
		}
	}
	
	
	public void FindNameShowFilm(){
		
		String sql = "select  * from Film where FN like ";
		String sqlfs="select  * from FS where FID= ";
		Scanner sc=new Scanner(System.in);
		System.out.println("������Ҫ��ѯ�ĵ�Ӱ����");
		String Fname=sc.next();
		FilmDAOImpl FDI=new FilmDAOImpl();
		FSDAOImpl FSDI=new FSDAOImpl();
		StuffDAOImpl SDI=new StuffDAOImpl();
		sql=sql+"'%"+Fname+"%'";
		List<Film> Films=FDI.getFilmByC(sql);
		Film film=new Film();
		String sname="";
		Iterator<Film> listNextfilms=Films.iterator();
		while(listNextfilms.hasNext())
		{
			film=listNextfilms.next();
			ArrayList<String> Dname=new ArrayList<String> ();
			ArrayList<String> Bname=new ArrayList<String> ();
			ArrayList<String> Aname=new ArrayList<String> ();
			sqlfs=sqlfs+"'"+film.getFID()+"'";
			List<FS> fss=FSDI.getFSByC(sqlfs);
			Iterator<FS> listNextfs=fss.iterator();
			while(listNextfs.hasNext())
			{
				FS currfs=listNextfs.next();
				if(currfs.getVoca().equals("����"))
				{
					sname=SDI.getStuff(currfs.getSID()).getSN();
					Dname.add(sname);
				}
				if(currfs.getVoca().equals("���"))
				{
					sname=SDI.getStuff(currfs.getSID()).getSN();
					Bname.add(sname);
				}
				if(currfs.getVoca().equals("����"))
				{
					sname=SDI.getStuff(currfs.getSID()).getSN();
					Aname.add(sname);
				}
				
			}
			
			System.out.println("��Ӱ���֣�");
			System.out.println(film.getFN());
			System.out.println("��Ӱ�������ӣ�");
			System.out.println(film.getPOS());
			System.out.println("����");
			Iterator<String> listNextd=Dname.iterator();
			while(listNextfs.hasNext())
			{
			System.out.print(listNextd.next()+" ");
			}
			System.out.println("���");
			Iterator<String> listNextb=Bname.iterator();
			while(listNextfs.hasNext())
			{
			System.out.print(listNextb.next()+" ");
			}
			System.out.println("����");
			Iterator<String> listNexta=Aname.iterator();
			while(listNextfs.hasNext())
			{
			System.out.print(listNexta.next()+" ");
			}
			System.out.println("��Ӱ����");
			System.out.println(film.getTYPE());
			System.out.println("��Ƭ����/������");
			System.out.println(film.getAREA());
			System.out.println("����");
			System.out.println(film.getLNG());
			System.out.println("Ƭ����");
			System.out.println(film.getFT());
			System.out.println("��Ӱ����");
			System.out.println(film.getTYPE());
			System.out.println("����");
			System.out.println(film.getAN());
			System.out.println("���ñ�ǩ");
			this.TagShow(film.getFID());
			System.out.println("");
			System.out.println("�����飺");
			System.out.println(film.getINTRO());
			System.out.println("�������֣�");
			double[] infScore=avgScore(film.getFID());
			if(infScore[0] == -1)
			{
				System.out.printf("���۹��٣���ͳ�����֡�");
			}
			else
			{
				System.out.printf("%.2f\n", infScore[0]);
				System.out.println("����"+infScore[6]+"����");
				System.out.printf("5��%.2f%\n",infScore[5]/infScore[6]*100);
				System.out.printf("4��%.2f%\n",infScore[4]/infScore[6]*100);
				System.out.printf("3��%.2f%\n",infScore[3]/infScore[6]*100);
				System.out.printf("2��%.2f%\n",infScore[2]/infScore[6]*100);
				System.out.printf("1��%.2f%\n",infScore[1]/infScore[6]*100);
			}
			System.out.println("�������ۣ�");
			this.EvaluateShow(film.getFID());
		}
		
	}
	
public void FindIdShowFilm(String FID){
		

		String sqlfs="select  * from FS where FID= ";
		FilmDAOImpl FDI=new FilmDAOImpl();
		FSDAOImpl FSDI=new FSDAOImpl();
		StuffDAOImpl SDI=new StuffDAOImpl();
		Film film=FDI.getFilm(FID);
		String sname="";
			
			ArrayList<String> Dname=new ArrayList<String> ();
			ArrayList<String> Bname=new ArrayList<String> ();
			ArrayList<String> Aname=new ArrayList<String> ();
			sqlfs=sqlfs+film.getFID();
			List<FS> fss=FSDI.getFSByC(sqlfs);
			Iterator<FS> listNextfs=fss.iterator();
			while(listNextfs.hasNext())
			{
				FS currfs=listNextfs.next();
				if(currfs.getVoca().equals("����"))
				{
					sname=SDI.getStuff(currfs.getSID()).getSN();
					Dname.add(sname);
				}
				if(currfs.getVoca().equals("���"))
				{
					sname=SDI.getStuff(currfs.getSID()).getSN();
					Bname.add(sname);
				}
				if(currfs.getVoca().equals("����"))
				{
					sname=SDI.getStuff(currfs.getSID()).getSN();
					Aname.add(sname);
				}
				
			}
			
			System.out.println("��Ӱ���֣�");
			System.out.println(film.getFN());
			System.out.println("��Ӱ�������ӣ�");
			System.out.println(film.getPOS());
			System.out.println("����");
			Iterator<String> listNextd=Dname.iterator();
			while(listNextfs.hasNext())
			{
			System.out.print(listNextd.next()+" ");
			}
			System.out.println("���");
			Iterator<String> listNextb=Bname.iterator();
			while(listNextfs.hasNext())
			{
			System.out.print(listNextb.next()+" ");
			}
			System.out.println("����");
			Iterator<String> listNexta=Aname.iterator();
			while(listNextfs.hasNext())
			{
			System.out.print(listNexta.next()+" ");
			}
			System.out.println("��Ӱ����");
			System.out.println(film.getTYPE());
			System.out.println("��Ƭ����/������");
			System.out.println(film.getAREA());
			System.out.println("����");
			System.out.println(film.getLNG());
			System.out.println("Ƭ����");
			System.out.println(film.getFT());
			System.out.println("��Ӱ����");
			System.out.println(film.getTYPE());
			System.out.println("����");
			System.out.println(film.getAN());
			System.out.println("�����飺");
			System.out.println(film.getINTRO());
			System.out.println("�������֣�");
			double[] infScore=avgScore(film.getFID());
			System.out.printf("%.2f\n", infScore[0]);
			System.out.println("����"+infScore[6]+"����");
			System.out.printf("5��%.2f%\n",infScore[5]/infScore[6]*100);
			System.out.printf("4��%.2f%\n",infScore[4]/infScore[6]*100);
			System.out.printf("3��%.2f%\n",infScore[3]/infScore[6]*100);
			System.out.printf("2��%.2f%\n",infScore[2]/infScore[6]*100);
			System.out.printf("1��%.2f%\n",infScore[1]/infScore[6]*100);
		}
		
	
	
	
	public void ShowFilm(){
	String sql = "select top 3 * from Film";
	String sqlfs="select  * from FS where FID= ";
	FilmDAOImpl FDI=new FilmDAOImpl();
	FSDAOImpl FSDI=new FSDAOImpl();
	StuffDAOImpl SDI=new StuffDAOImpl();
	List<Film> Films=FDI.getFilmByC(sql);
	Film film=new Film();
	String sname="";
	Iterator<Film> listNextfilms=Films.iterator();
	while(listNextfilms.hasNext())
	{
		film=listNextfilms.next();
		ArrayList<String> Dname=new ArrayList<String> ();
		ArrayList<String> Bname=new ArrayList<String> ();
		ArrayList<String> Aname=new ArrayList<String> ();
		sqlfs=sqlfs+film.getFID();
		List<FS> fss=FSDI.getFSByC(sqlfs);
		Iterator<FS> listNextfs=fss.iterator();
		while(listNextfs.hasNext())
		{
			FS currfs=listNextfs.next();
			if(currfs.getVoca().equals("����"))
			{
				sname=SDI.getStuff(currfs.getSID()).getSN();
				Dname.add(sname);
			}
			if(currfs.getVoca().equals("���"))
			{
				sname=SDI.getStuff(currfs.getSID()).getSN();
				Bname.add(sname);
			}
			if(currfs.getVoca().equals("����"))
			{
				sname=SDI.getStuff(currfs.getSID()).getSN();
				Aname.add(sname);
			}
			
		}
		
		System.out.println("��Ӱ���֣�");
		System.out.println(film.getFN());
		System.out.println("��Ӱ�������ӣ�");
		System.out.println(film.getPOS());
		System.out.println("����");
		Iterator<String> listNextd=Dname.iterator();
		while(listNextfs.hasNext())
		{
		System.out.print(listNextd.next()+" ");
		}
		System.out.println("���");
		Iterator<String> listNextb=Bname.iterator();
		while(listNextfs.hasNext())
		{
		System.out.print(listNextb.next()+" ");
		}
		System.out.println("����");
		Iterator<String> listNexta=Aname.iterator();
		while(listNextfs.hasNext())
		{
		System.out.print(listNexta.next()+" ");
		}
		System.out.println("��Ӱ����");
		System.out.println(film.getTYPE());
		System.out.println("��Ƭ����/������");
		System.out.println(film.getAREA());
		System.out.println("����");
		System.out.println(film.getLNG());
		System.out.println("Ƭ����");
		System.out.println(film.getFT());
		System.out.println("��Ӱ����");
		System.out.println(film.getTYPE());
		System.out.println("����");
		System.out.println(film.getAN());
		System.out.println("�����飺");
		System.out.println(film.getINTRO());
		System.out.println("�������֣�");
		double[] infScore=avgScore(film.getFID());
		System.out.printf("%.2f\n", infScore[0]);
		System.out.println("����"+infScore[6]+"����");
		System.out.printf("5��%.2f%\n",infScore[5]/infScore[6]*100);
		System.out.printf("4��%.2f%\n",infScore[4]/infScore[6]*100);
		System.out.printf("3��%.2f%\n",infScore[3]/infScore[6]*100);
		System.out.printf("2��%.2f%\n",infScore[2]/infScore[6]*100);
		System.out.printf("1��%.2f%\n",infScore[1]/infScore[6]*100);
	}
	
	}
	
}
