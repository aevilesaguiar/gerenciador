package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "NovaEmpresaServlet", urlPatterns = { "/novaEmpresa" })

public class NovaEmpresaServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
		protected void doPost(HttpServletRequest request, HttpServletResponse response) 
		throws ServletException, IOException {
			
		System.out.println("Cadastrando nova empresa");
		
		String nomeEmpresa = request.getParameter("nome");
		String email = request.getParameter("email");
		
		Empresa empresa = new Empresa();
		empresa.setNome(nomeEmpresa);
		empresa.setEmail(email);
		
		Banco banco = new Banco();
		banco.adiciona(empresa);
	
		
	}

}
