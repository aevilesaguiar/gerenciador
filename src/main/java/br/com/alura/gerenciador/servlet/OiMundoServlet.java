package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//mapeamento chamado: oi
@WebServlet(urlPatterns = "/oi")
public class OiMundoServlet extends HttpServlet{

	  @Override
	    protected void service(HttpServletRequest req, HttpServletResponse resp)  {

	        PrintWriter out;
			try {
				out = resp.getWriter();
				  out.println("<html>");
			        out.println("<body>");
			        out.println("oi mundo, parabens vc escreveu o primeiro servlets.");
			        out.println("</body>");
			        out.println("</html>");

			        System.out.println("o servlet OiMundoServlet foi chamado");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	      
	    }
	}    