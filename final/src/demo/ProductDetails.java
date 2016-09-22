package demo;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ProductDetails
 */

@WebServlet("/ProductDetails")
public class ProductDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ProductDetails() {
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		HttpSession session=request.getSession();
		ArrayList<Product> products=new ArrayList<Product> ();
		Product p=new Product();
		Product p1=new Product();
		
		p.setPID(111);
		p.setPName("Lakme Kajal"); 
		p.setPPice(555);
		
		p1.setPID(112); 
		p1.setPName("Lakme Foundation"); 
		p1.setPPice(555);
		
		products.add(p);
		products.add(p1);
		
		session.setAttribute("Product_List", products);
		
		response.sendRedirect("ProductDisplay.jsp");  
		  
		
		//RequestDispatcher rd = getServletContext().getRequestDispatcher("/ProductDisplay.jsp");
		//rd.forward(request, response);
		
	}

}
