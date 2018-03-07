package examples.pubhub.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import examples.pubhub.dao.BookDAOImpl;
import examples.pubhub.dao.TAGDAOimpl;
import examples.pubhub.model.Book;
import java.util.ArrayList;
import java.util.List;

/**
 * Servlet implementation class servletandjsp
 */
@WebServlet(description = "testing passing of arguement from servlet to jsp", urlPatterns = { "/TagServlet" })
public class TagServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TagServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			
		TAGDAOimpl lst = new TAGDAOimpl();
		request.getSession().setAttribute("list", lst.getTag(request.getParameter("rad")));
		request.getRequestDispatcher("tagList.jsp").forward(request, response);
	}

}
