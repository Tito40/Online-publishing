package examples.pubhub.dao;

import java.util.List;
import examples.pubhub.model.Book;
import examples.pubhub.model.Tag;

/**
 * Interface for our Data Access Object to handle database queries related to Books.
 */
public interface TAGDAO 
{

	public List<Tag> getTag(String tag);
	public void addTag(String book, String tag);
	public void removeTag(String tag, String isbn);
	
}
