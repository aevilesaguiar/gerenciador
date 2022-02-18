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
