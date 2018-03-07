package examples.pubhub.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import examples.pubhub.model.Book;
import examples.pubhub.model.Tag;
import examples.pubhub.utilities.DAOUtilities;

/**
 * Implementation for the BookDAO, responsible for querying the database for Book objects.
 */
public class TAGDAOimpl implements TAGDAO {

	Connection connection = null;	// Our connection to the database
	PreparedStatement stmt = null;	// We use prepared statements to help protect against SQL injection
	
	/*------------------------------------------------------------------------------------------------*/
	
	
	@Override
	public List<Tag> getTag(String tag) 
	{
		List<Tag> Tgs = new ArrayList<>();

		try {
			connection = DAOUtilities.getConnection();
			String sql = "SELECT DISTINCT b.title, b.isbn_13, t.tags FROM books AS b JOIN book_tags AS t ON t.isbn_13=b.isbn_13 Where t.tags=?"; 
			System.out.println(tag+" is result");
			stmt = connection.prepareStatement(sql);
			stmt.setString(1, tag); 
			ResultSet rs = stmt.executeQuery();
			
			while (rs.next()) {
				
				Tag tags = new Tag();
								
				tags.setTag(rs.getString("tags"));
				tags.setIsbn(rs.getString("isbn_13"));
				tags.setTitle(rs.getString("title"));
												
				Tgs.add(tags);
			}
			
			rs.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// We need to make sure our statements and connections are closed, 
			// or else we could wind up with a memory leak
			closeResources();
		}
		
		// return the list of Book objects populated by the DB.
		return Tgs;
	}

	
	/*------------------------------------------------------------------------------------------------*/
	
	public void addTag(String book, String tag) 
	{
		try 
		{
			connection = DAOUtilities.getConnection();
			String sql = "INSERT INTO book_tags (isbn_13, tags) VALUES (?,?)"; 
			stmt = connection.prepareStatement(sql);
			stmt.setString(1, book);
			stmt.setString(2, tag); 
			System.out.println(stmt.executeUpdate());
		} catch (SQLException e) 
		{
			e.printStackTrace();
		} finally 
		{
			closeResources();
		}
	}
	
	/*------------------------------------------------------------------------------------------------*/
	
	public void removeTag(String tag, String isbn)
	{
		try 
		{
			connection = DAOUtilities.getConnection();
			String sql = "DELETE FROM book_tags WHERE isbn_13=? AND tags=?"; 
			stmt = connection.prepareStatement(sql);
			stmt.setString(1, isbn);
			stmt.setString(2, tag);
			stmt.executeUpdate();
		} catch (SQLException e) 
		{
			e.printStackTrace();
		} finally 
		{
			closeResources();
		}
	}
	
	/*------------------------------------------------------------------------------------------------*/

	// Closing all resources is important, to prevent memory leaks. 
	// Ideally, you really want to close them in the reverse-order you open them
	private void closeResources() {
		try {
			if (stmt != null)
				stmt.close();
		} catch (SQLException e) {
			System.out.println("Could not close statement!");
			e.printStackTrace();
		}
		
		try {
			if (connection != null)
				connection.close();
		} catch (SQLException e) {
			System.out.println("Could not close connection!");
			e.printStackTrace();
		}
	}

}
