package DAO;

import java.util.List;
import domain.*;

public interface LtoFDAO {
	public void insertLtoF(LtoF ltof);
	public void updateLtoF(LtoF ltof);
	public void deleteLtoF(String lid, String fid);
	public LtoF getLtoF(String lid, String fid);
	public List<LtoF> getLtoFByC(String sql);
}
