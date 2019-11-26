package DAO;

import java.util.List;
import domain.*;

public interface AwardDAO {
	public void insertAward(Award award);
	public void updateAward(Award award);
	public void deleteAward(String aid);
	public Award getAward(String aid);
	public List<Award> getAwardByC(String sql);
}
