<!-- transformando nomeEmpresa em um scriptlet por meio da marca��o .Utilizaremos ainda a 
vari�vel autom�ticaout, refer�ncia para o getWriter() como vimos em NovaEmpresaServlet. 
Sem seguida, usaremos o println() para imprimir a informa��o. -->

<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>Insert title here</title>

</head>
 <body>
        <c:if test= "${not empty empresa}">
            Empresa ${ empresa } cadastrada com sucesso!
        </c:if>

        <c:if test= "${empty empresa}">
            Nenhuma empresa cadastrada!
        </c:if>


    </body>
</html>


<!--Java server Page -> JSP (substitui a expensao html para jsp)-->