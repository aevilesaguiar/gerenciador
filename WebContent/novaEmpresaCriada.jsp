<!-- transformando nomeEmpresa em um scriptlet por meio da marcação .Utilizaremos ainda a 
variável automáticaout, referência para o getWriter() como vimos em NovaEmpresaServlet. 
Sem seguida, usaremos o println() para imprimir a informação. -->

<%
String nomeEmpresa = "Joana";
System.out.println(nomeEmpresa);

String emailEmpresa = "joana@joana.com.br";
System.out.println(emailEmpresa);
%>
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>Insert title here</title>

</head>
<body>

<p>Empresa: <%= nomeEmpresa %>     - Email: <%= emailEmpresa %> </p>
<p>cadastrada com Sucesso!</p>

</body>
</html>


<!--Java server Page -> JSP (substitui a expensao html para jsp)-->