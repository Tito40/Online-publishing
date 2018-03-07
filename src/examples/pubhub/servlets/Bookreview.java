package examples.pubhub.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.jms.Connection;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import examples.pubhub.dao.BookDAOImpl;
import examples.pubhub.dao.TAGDAOimpl;
import examples.pubhub.utilities.DAOUtilities;

/**
 * Servlet implementation class Bookreview
 */
@WebServlet(description = "Foor book reviews", urlPatterns = { "/Bookreview" })
public class Bookreview extends HttpServlet {
	
	PreparedStatement stmt = null;
	private static final long serialVersionUID = 1L;
       
    /**																																																																																																																																																											
     * @see HttpServlet#HttpServlet()
     */
    public Bookreview() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		PrintWriter wrt = response.getWriter();
				
		
		// TODO Auto-generated method stub
				
		String bookISBN = request.getParameter("ISBN");
		String coment = request.getParameter("rad");
		TAGDAOimpl bk = new TAGDAOimpl();
		bk.addTag(bookISBN, coment);
		wrt.print("<html><head></head><body><h1>Thank you</h1></body></html>");
		
		
	}
}
