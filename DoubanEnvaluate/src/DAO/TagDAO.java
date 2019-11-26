package DAO;

import java.util.List;
import domain.*;

public interface TagDAO {
	public void insertTag(Tag tag);
	public void updateTag(Tag tag);
	public void deleteTag(String tid);
	public Tag getTag(String tid);
	public List<Tag> getTagByC(String sql);
}
