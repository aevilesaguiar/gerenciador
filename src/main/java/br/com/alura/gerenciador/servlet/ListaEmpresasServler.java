package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ListaEmpresasServler
 */
@WebServlet("/listaEmpresas")
public class ListaEmpresasServler extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListaEmpresasServler() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Banco banco = new Banco();
		List<Empresa> lista = banco.getEmpresas();
		
		//Escrever html para navegador PrintWriter
		
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("<ul>");
		for (Empresa empresa : lista) {
			out.println("<li>"+empresa.getNome()+" Email: "+empresa.getEmail()+"</li>");
		}
		out.println("<ul>");
		out.println("</body></html>");
		
	}

}