# Java Servlet: Fundamentos da programação web Java

- Entenda o que é um Servlet
- Mapeie requisições HTTP e trabalhe com POST e GET
- Gere HTML dinamicamente com JSP e JSTL
- Crie uma CRUD completa e faço o deploy com Tomcat
- Saiba o que é inversão de controle


## Observação

Existem literalmente milhares de servidores web, cada linguagem e plataforma possui os seus. No mundo Java o Apache Tomcat talvez seja um dos mais famosos, mas existem outros.

O Tomcat faz parte da Apache Foundation que é uma organização que desenvolve vários projetos Open Source. Agora a Apache Foundation possui um outro servidor ainda mais famoso, o Apache HTTP (também é chamado apenas Apache). Ambos, Apache HTTP e Apache Tomcat são servidores web. Qual é a diferença então?

O Tomcat é puramente Java enquanto Apache HTTP é escrito em C. Além disso, o Apache HTTP é um servidor estático (por padrão pelo menos) e precisa de alguma integração com outra linguagem para se gerar HTML dinamicamente. O Tomcat já é dinâmico de cara, usando Java e JSP, claro!

## Para que serve o programa Tomcat?
O TomCat é usado para construir e executar aplicativos de forma a não comprometer a estabilidade do servidor, pois ele funciona independentemente da instalação do Apache. Essa independência permite que mesmo depois de uma falha no TomCat, a execução do servidor não seja comprometida.

## Qual é a diferença entre Apache e Tomcat?
Apache x Tomcat

O Tomcat é um servidor de internet também desenvolvido pela Apache Software Foundation. Não é a toa que ele também seja conhecido como Apache Tomcat. ... Basicamente, ele também é um servidor HTTP. A diferença é que ele executa aplicações em Java, em vez de sites estáticos em HTML.

## o que é um Servlet

Servlet nada mais é que uma classe java que recebe tais requisições processa as informações e produz
um conteudo dinamico. A resposta do servidor de aplicativos Java Será sempre um conteudo que o navegador do cliente possa interpretar, normalmente uma pagina html. Ou seja um servlet é uma classe java que gera um html. Já a pagina JSP é um documento html que permite a execução do código java através de scriptlet. Bem semelhante ao php. O JSP (JAVA SERVER pAGES) é automaticamente transformada em servlet pelo o servidor TomCat. 


## Servlet X JSP

É a mesma coisa usar Servlet ou JSP no final o servidor sempre irá transformar a pagina JSP em Servlet.

Uma sugestão é usar JSP para fazer a interface com o usuario, e usar Servlet para a lógica do Sistema.


## Sintaxe dos Elementos JSP
![image](https://user-images.githubusercontent.com/52088444/154868691-09f4300d-be22-4a49-9291-14b51d9a925d.png)


## O que aprendemos sobre Apache Tomcat?

- Sabe gerar HTML->Veremos ainda muito mais sobre esse assunto, mas aquela página de erro (404) do Tomcat já era uma página HTML.

- Entende o protocolo HTTP-> O protocolo HTTP é essencial para qualquer aplicação web ou serviço web. HTTP é o protocolo da web.

- Um servidor web->Um servidor web sabe trabalhar com o protocolo HTTP!

## Primeiro Servlet

No Eclipse, ao acionarmos a execução do Tomcat, estamos inicializando uma máquina virtual que requer uma classe com um método main. O Tomcat é um método main que sobe um servidor com várias classes e executa diferentes ações, algo muito sofisticado.

Nós usamos o navegador para realizar uma requisição para o Tomcat por meio do protocolo HTTP (no qual o navegador é especialista). O servidor recebeu a requisição e devolveu a resposta, que no princípio era apenas uma página de erro 404, afinal ainda não havíamos produzido um conteúdo a ser exibido.

Posteriormente, adicionamos uma página HTML dentro do projeto gerenciador. Feito isso, conseguimos acessar o caminho http://localhost:8080/gerenciador/bem-vindo.html, isto é, acessar o Tomcat inserindo a porta correta, o projeto gerenciador e o conteúdo da página bem-vindo.html.

O navegador envia as informações na requisição HTTP, e o Tomcat reconhece essa requisição e devolve o conteúdo solicitado na reposta HTTP. O protocolo HTTP funciona sempre na dinâmica de requisição e reposta.

Ao final, conseguimos exibir a mensagem "Bem-vindo no curso de Servlets da Alura" no navegador.

![image](https://user-images.githubusercontent.com/52088444/154591729-b84137bb-600a-4b1a-95b4-e15f70862af6.png)

O navegador envia as informações na requisição HTTP, e o Tomcat reconhece essa requisição e devolve o conteúdo solicitado na reposta HTTP. O protocolo HTTP funciona sempre na dinâmica de requisição(pedido) e reposta.

![image](https://user-images.githubusercontent.com/52088444/154591904-201268b2-2fb6-4801-82f9-71e5a7ec2f06.png)

## Servlet

Servlet é um objeto especial armazenado dentro do projeto, e sua particularidade consiste na possibilidade de o chamarmos via protocolo HTTP.

Quando o Tomcat recebe a requisição do navegador com relação aos dados do projeto gerenciador, ao abrirmos a página não estamos mais lidando com um arquivo, mas com um Servlet. Isto é, um objeto especial executado para gerar uma resposta HTTP dinâmica.

O termo let de Servlet é um sufixo diminutivo no inglês, e uma tradução livre seria algo como "Servidorzinho". A ideia é que o Tomcat é um servidor principal, e o Servlet opera de forma semelhante e auxiliar, afinal ele pode receber requisições e gerar respostas dinâmicas por meio do protocolo HTTP.

## Resumo

- Apache Tomcat ou apenas Tomcat é um servidor web em Java
- Tomcat entende o protocolo HTTP e roda por padrão no http://localhost:8080
- O projeto Java faz parte da URL, no nosso caso: http://localhost:8080/gerenciador
- Uma aplicação web Java pode ter páginas HTML
- Uma servlet é um objeto Java que podemos chamar a partir de uma requisição HTTP
- Para mapear a URL para uma servlet usamos a anotação @WebServlet
- Uma servlet deve estender a classe HttpServlet e sobrescrever um determinado método (por exemplo service)

## Metodos GET e POST

Deve ter ficado claro que o método "GET" é utilizado para enviar parâmetros na URL, e que ele é problemático quando estamos trabalhando com parâmetros muito longos. Além disso, nem sempre queremos mostrar esses parâmetros.

Já o método "POST" esconde os parâmetros no corpo da requisição, sem mostrá-los na URL. Confira os exercícios e até o próximo vídeo!

- Diferença entre GET e POST

Vimos que existem "métodos" diferentes para enviar uma requisição HTTP. Falamos sobre GET e POST, que são os métodos mais comuns, mas existem outros como PUT ou DELETE.
Correto!

1) GET foi pensado para acessar algum recurso

2) POST foi pensado para alterar ou criar algum recurso.

3) GET gera problemas quando precisamos enviar muitas informações.

4) GET é o padrão de action

5) Servidor só deveria aceitar um POST


No método service não tem importancia se enviamos uma requisição  do tipo post ou get. Tanto faz.

protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {}

Mas podemos ser mais especifico substituindo service por do Post:
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

**HTTP STATUS 405 - METHOD NOT ALLOWED significa que o esse método/requisição o servidor não aceita.**


 **sobre o método doPost:**
- O método doPost recebe os mesmos parâmetro do método service e doPost tem a mesma assinatura (mesmo retorno, mesmos parâmetros, mesmas exceções).
- O método doPost só é capaz de lidar com requisições do tipo post
- O método doGet só é capaz de lidar com requisições do tipo get
**a respeito do método service de uma HttpServlet:**
- Lida com requisições do tipo get e do tipo post


O retorno de getParameter é sempre uma string.

Criar classes de Negócio ajudam na manutenção e legibilidade do nosso código.

O modelo ou domínio são as classes que representam o mundo real, aquilo que o cliente ou usuário da aplicação define.

Para descobrir quais são as classes e funcionalidades do modelo o analista de requisitos conversa com o cliente e documenta cada funcionalidade.

HTTP Status 500 – Internal Server Error - erro do lado do servidor

**JSP é uma tecnologia que renderiza as páginas no servidor antes de enviá-la.Todo o código (scriptlet) é executado no servidor antes de enviar a resposta para o navegador.**

opção que corretamente exibe "Bem-vindo" através de scriptlet:
<%
        String msg = "Bem-vindo";
        System.out.println(msg);
%>

opção verdadeira que renderiza corretamente a variável nome através de scriptlet:
<%
     String nome = "Nico";
%>
<p><%= nome %></p>

Alternativa correta, a sintaxe <%= nome %> é um atalho para não usar out.println(nome);

## Para que serve o RequestDispatcher?

Define um objeto que recebe solicitações do cliente e as envia para qualquer recurso (como um servlet, arquivo HTML ou arquivo JSP) no servidor. O contêiner servlet cria o objeto RequestDispatcher, que é usado como um wrapper em torno de um recurso do servidor localizado em um caminho específico ou fornecido por um nome específico;

- Permite, a partir de uma servlet, chamar um JSP.
- É obtido de um HttpServletRequest através do método getRequestDispatcher().

JSP significa Java Server Pages
JSP é uma página automaticamente processada pelo Tomcat
Para gerar HTML dinamicamente no JSP usamos Scriptlets
Um scriptlet <% %> é um código Java dentro do HTML
Um scriptlet só funciona em uma página JSP
Usamos o RequestDispatcher para chamar um JSP a partir da servlet
Obtemos o RequestDispatcher a partir do HttpServletRequest
Usamos o Dispatcher para chamar o JSP
Usamos a requisição para colocar ou pegar um atributo (setAttribute(.., ..) ou getAttribute(..))


##  Expression Language- Linguagem de Expressão ${}

## JSTL:

JSTL significa Java Standard Tag Library. É a biblioteca padrão de tags do Java, mas existem outras bibliotecas. Por exemplo, o Spring MVC possui a sua própria.

Precisamos adicionar uma lib específica para que possamos utilizá-la. JSTL não vem embutido com o Tomcat.

**JSTL significa Java Standard Tag Library.**

core: controle de fluxo
fmt -formatação /i18n(internacionalização)
sql - executar SQL
xml -gerar xml

![image](https://user-images.githubusercontent.com/52088444/154866898-2c9ec72f-9043-4f2b-9adf-73b434cc7482.png)

