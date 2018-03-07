package examples.pubhub.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import examples.pubhub.dao.BookDAOImpl;
import examples.pubhub.dao.TAGDAOimpl;

/**
 * Servlet implementation class Remove
 */
@WebServlet(description = "To Remove from listed isbn", urlPatterns = { "/Remove" })
public class Remove extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Remove() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		System.out.println("Message sent");
		TAGDAOimpl rmove = new TAGDAOimpl();
		rmove.removeTag(request.getParameter("rad"), request.getParameter("ISBN"));
	}

}
