<h1>api-gerenciamento-usuarios-spring-boot</h1>

<p>Este é um projeto criado com o intuito do estudo da ferramenta spring boot e seu ecossistema. O projeto consiste na criação de uma API de CRUD para o cadastro de usuários e seus respectivos números de telefone.</p>

<h2>Tecnologias utilizadas</h2>

<ul>
  <li>Spring Web</li>
  <li>Spring Data JPA</li>
  <li>Lombok</li>
  <li>Spring Boot Actuator</li>
  <li>H2 Database</li>
  <li>Hibernate Validator</li>
  <li>Junit</li>
</ul>

<h2>Como testar</h2>
<p>Importar o projeto, abrir em um servidor local e utilizar o Postman ou Insomnia para acessar os seguintes end-points.</p>
<ol>
  <li>POST localhost:8080/api/v1/people : Para cadastrar usuários.</li>
  <li>GET localhost:8080/api/v1/people : Listar usuários cadastrado.</li>
  <li>GET localhost:8080/api/v1/people/{id} : Exibir um determinado usuário cadastrado.</li>
  <li>PUT localhost:8080/api/v1/people/{id} : Para atualizar um usuário.</li>
  <li>DELETE localhost:8080/api/v1/people/{id} : Para deletar um usuário.</li>
</ol>


