package DAO;

import java.util.List;
import domain.*;

public interface FFDAO {
	public void insertFF(FF ff);
	public void updateFF(FF ff);
	public void deleteFF(String fid, String ffid);
	public FF getFF(String fid, String ffid);
	public List<FF> getFFByC(String sql);
}
