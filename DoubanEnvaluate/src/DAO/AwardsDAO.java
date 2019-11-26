package DAO;

import java.util.List;
import domain.*;

public interface AwardsDAO {
	public void insertAwards(Awards awards);
	public void updateAwards(Awards awards);
	public void deleteAwards(String aid, String atid);
	public Awards getAwards(String aid, String atid);
	public List<Awards> getAwardsByC(String sql);
}
