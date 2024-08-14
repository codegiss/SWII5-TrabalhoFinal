// Giselle Souza CB3020339
// Lucas Gomes   CB3021777

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ViewSalesmenServlet")
public class ViewSalesmenServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<a href='index.html'>Add New Salesman</a>");
		out.println("<h1>Salesmen List</h1>");
		
		List<Salesman> list=StoreDao.getAllSalesmen();
		
		out.print("<table border='1' width='100%'");
		out.print("<tr><th>Id</th><th>Name</th><th>City</th><th>Commission</th><th>Edit</th><th>Delete</th></tr>");
		
		for(Salesman s:list){
			out.print("<tr><td>"+s.getId()+"</td><td>"+s.getName()+"</td><td>"+s.getCity()+"</td><td>"+s.getCommission()+"</td><td><a href='EditSalesmanServlet?id="+s.getId()+"'>edit</a></td><td><a href='DeleteSalesmanServlet?id="+s.getId()+"'>delete</a></td></tr>");
			
		}
		out.print("</table>");
		
		out.close();
	}
}
