package DAO;

import java.util.List;
import domain.*;

public interface FSDAO {
	public void insertFS(FS fs);
	public void updateFS(FS fs);
	public void deleteFS(String sid, String fid);
	public FS getFS(String sid, String fid);
	public List<FS> getFSByC(String sql);
}
