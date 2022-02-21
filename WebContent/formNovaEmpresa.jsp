<c: url value="/novaEmpresa" var="linkServletNovaEmpresa">
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>



<form action="/gerenciador/novaEmpresa" method="post">
    <p>
        <label for="nome">Nome:</label>
        <input type="text" name="nome" />
    </p>
    <p>
        <label for="email">E-mail:</label>
        <input type="email" name="email" />
    </p>
    <p class="button"><button type="submit">Enviar sua mensagem</button>
    </p>
</form>
</body>
</html>