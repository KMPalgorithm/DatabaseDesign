package DAO;

import java.util.List;
import domain.*;

public interface FTDAO {
	public void insertFT(FT ft);
	public void updateFT(FT ft);
	public void deleteFT(String fid, String tid);
	public FT getFT(String fid, String tid);
	public List<FT> getFTByC(String sql);
}
