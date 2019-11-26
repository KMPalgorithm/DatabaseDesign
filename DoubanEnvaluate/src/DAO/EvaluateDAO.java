package DAO;

import java.util.List;
import domain.*;

public interface EvaluateDAO {
	public void insertEvaluate(Evaluate evaluate);
	public void updateEvaluate(Evaluate evaluate);
	public void deleteEvaluate(String uid, String fid);
	public Evaluate getEvaluate(String uid, String fid);
	public List<Evaluate> getEvaluateByC(String sql);
}
