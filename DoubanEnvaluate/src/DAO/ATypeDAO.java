package DAO;

import java.util.List;
import domain.*;

public interface ATypeDAO {
	public void insertAType(AType aType);
	public void updateAType(AType aType);
	public void deleteAType(String atid);
	public AType getAType(String atid);
	public List<AType> getATypeByC(String sql);
}
