// Giselle Souza CB3020339
// Lucas Gomes   CB3021777

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SaveSalesmanServlet")
public class SaveSalesmanServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String name=request.getParameter("name");
		String city=request.getParameter("city");
		String commission=request.getParameter("commission");
		
		Salesman s=new Salesman();
		s.setName(name);
		s.setCity(city);
		s.setCommission(new BigDecimal(commission));
		
		int status=StoreDao.saveSalesman(s);
		if(status>0){
			out.print("<p>Salesman' data recorded successfully!</p>");
			request.getRequestDispatcher("index.html").include(request, response);
	
		} else {
		out.println("Sorry! unable to save record");
		}
		
		out.close();
	}
}
