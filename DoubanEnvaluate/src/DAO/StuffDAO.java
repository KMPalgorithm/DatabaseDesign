package DAO;

import java.util.List;
import domain.*;

public interface StuffDAO {
	public void insertStuff(Stuff stuff);
	public void updateStuff(Stuff stuff);
	public void deleteStuff(String sid);
	public Stuff getStuff(String sid);
	public List<Stuff> getStuffByC(String sql);
}
