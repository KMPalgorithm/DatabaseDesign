package DAO;

import java.util.List;
import domain.*;

public interface ReplyDAO {
	public void insertReply(Reply reply);
	public void updateReply(Reply reply);
	public void deleteReply(String rid);
	public Reply getReply(String rid);
	public List<Reply> getReplyByC(String sql);
}
