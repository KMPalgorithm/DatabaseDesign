package DAO;

import java.util.List;
import domain.*;

public interface LikeListDAO {
	public void insertLikeList(LikeList likeList);
	public void updateLikeList(LikeList likeList);
	public void deleteLikeList(String lid);
	public LikeList getLikeList(String lid);
	public List<LikeList> getLikeListByC(String sql);
}
