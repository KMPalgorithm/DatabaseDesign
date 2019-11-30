package Function_cahieve;

import java.sql.Date;
import java.util.List;
import java.util.UUID;

import domain.*;
import DAO.*;

public class InsertThings {
	public void insertEvaluate(String uid, String fid, int score, String cmt, String status, String ut, Date edate)
	{
		Evaluate evaluate=new Evaluate();
		evaluate.setUID(uid);
		evaluate.setFID(fid);
		evaluate.setScore(score);
		evaluate.setCMT(cmt);
		evaluate.setStatus(status);
		evaluate.setUT(ut);
		evaluate.setEDate(edate);	
		EvaluateDAOImpl EDI=new EvaluateDAOImpl();
		EDI.insertEvaluate(evaluate);
		insertTag(ut,fid);
	}
	
	
	public void insertTag(String tags,String FID)
	{
		TagDAOImpl TDI=new TagDAOImpl();
		FTDAOImpl FTDI=new FTDAOImpl();
		String sql="select  * from Tag where TN= ";
		String[] tagnames=tags.split(" ");
		for(int x=0;x<tagnames.length;x++)
		{
			Tag tag=new Tag();
			sql=sql+tagnames[x];
			List<Tag> Tags=TDI.getTagByC(sql);
			if(Tags.size()==0)
			{
				String TID= UUID.randomUUID().toString().replaceAll("-","");
				Tag ntag=new Tag(TID,tagnames[x]);
				TDI.insertTag(ntag);
			}
			else
			{
				tag=Tags.get(0);
				FT ft=FTDI.getFT(FID, tag.getTID());
				if(ft==null)
				{
					ft.setFID(FID);
					ft.setTID(tag.getTID());
					ft.setTC(1);
					FTDI.insertFT(ft);
				}
				else {
					int tc=ft.getTC();
					tc++;
					ft.setTC(tc);
					FTDI.updateFT(ft);
				}
			}
		}
		
	}
	
}
