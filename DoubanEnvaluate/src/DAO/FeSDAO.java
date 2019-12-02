package DAO;

import java.util.List;
import domain.*;

public interface FeSDAO {
	public void insertFeS(FeS fu);
	public void updateFeS(FeS fu);
	public void deleteFeS(String uid, String sid);
	public FeS getFeS(String uid, String sid);
	public List<FeS> getFeSByC(String sql);
}
