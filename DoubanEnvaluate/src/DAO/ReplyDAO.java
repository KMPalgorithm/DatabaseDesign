package DAO;

import java.util.List;
import domain.*;

public interface ReplyDAO {
	public void insertReply(Reply reply);
	public void updateReply(Reply reply);
	public void deleteReply(String cid, String uid);
	public Reply getReply(String cid, String uid);
	public List<Reply> getReplyByC(String sql);
}
