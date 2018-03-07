package examples.pubhub.model;


public class Tag
{
	private String tag;
	private String isbn;
	private String title;

	public void setTag(String g) 
	{
		this.tag = g;		
	}
	
	public void setIsbn(String g) 
	{
		this.isbn = g;
	}
	
	public void setTitle(String g) 
	{
		this.title = g;
	}
	
	public String getTag() 
	{
		return this.tag;
	}
	
	public String getIsbn() 
	{
		return this.isbn;
	}
	
	public String getTitle() 
	{
		return this.title;
	}
	
}