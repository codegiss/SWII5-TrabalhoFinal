// Giselle Souza CB3020339
// Lucas Gomes   CB3021777

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DeleteSalesmanServlet")
public class DeleteSalesmanServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String sid=request.getParameter("id");
		int id=Integer.parseInt(sid);
		StoreDao.deleteSalesman(id);
		response.sendRedirect("ViewSalesmenServlet");
	}
}