package DAO;

import java.util.List;
import domain.*;

public interface FUDAO {
	public void insertFU(FU fu);
	public void updateFU(FU fu);
	public void deleteFU(String uid, String fuid);
	public FU getFU(String uid, String fuid);
	public List<FU> getFUByC(String sql);
}
