# 🚧 EM CONSTRUÇÃO

# API FórumHub - Projeto de Estudo

Este repositório contém o desenvolvimento de uma API backend para um sistema de fórum. O projeto é parte de meus estudos e visa consolidar conhecimentos em **Java**, **Spring Boot** e outras tecnologias relacionadas.

---

## 🚀 Funcionalidades Implementadas

- **Cadastro, listagem, atualização e exclusão de tópicos.**
- **Cadastro, listagem e exclusão de respostas.**
- **Gerenciamento de usuários e perfis.**
- **Gerenciamento de cursos.**

---

## 🛠️ Tecnologias Utilizadas

- **Java 17**
- **Maven**: Gerenciamento de dependências.
- **Spring Boot**: Desenvolvimento rápido de aplicações Java.
    - **Spring Web**: Para criação de endpoints RESTful.
    - **Spring Security**: Para implementação de segurança.
- **Lombok**: Redução de boilerplate no código.
- **MySQL**: Banco de dados relacional.
- **Flyway**: Gerenciamento de versões do banco de dados.
- **JWT (auth0)**: Para autenticação e validação de tokens.

---

## 📂 Estrutura do Projeto

A estrutura do projeto foi organizada para seguir boas práticas de desenvolvimento em Java. Abaixo, uma visão geral dos pacotes principais:

- **configs**: Configurações gerais da aplicação.
- **controller**: Controladores responsáveis pelos endpoints da API (tópico, resposta, curso, usuário).
- **domain**: Contém as entidades principais, como `Topico`, `Resposta`, `Curso`, `Usuario`, e suas respectivas validações.
- **infra**: Configurações de infraestrutura, como segurança e tratamento de erros.
- **repository**: Interfaces para comunicação com o banco de dados.
- **service**: Lógica de negócio da aplicação.

---

## 🔒 Autenticação

A API utiliza autenticação baseada em **JWT (JSON Web Tokens)**. Apenas usuários autenticados conseguem acessar os endpoints protegidos. Para validar os tokens, foi utilizada a biblioteca **auth0** integrada ao Spring Security.

---

## 🎯 Próximos Passos

- Finalizar a implementação de validações e regras de negócio.
- Implementar testes automatizados para os endpoints.
- Melhorar a documentação da API (com ferramentas como Swagger).
- Adicionar logs para rastreabilidade.

---

## ⚙️ Como Executar o Projeto Localmente

### Pré-requisitos

- **Java 17** ou superior.
- **Maven** instalado.
- Um banco de dados **MySQL** configurado.

### Passos

1. Clone este repositório:
   ```bash
   git clone https://github.com/seu-usuario/forumhub.git
   ```

2. Acesse a pasta do projeto:
   ```bash
   cd forumhub
   ```

3. Configure o banco de dados no arquivo application.properties (src/main/resources):
   ```properties
   spring.datasource.url=jdbc:mysql://localhost/forumhub
   spring.datasource.username=seu_usuario
   spring.datasource.password=sua_senha
   ```

4. Execute as migrações do banco de dados com o Flyway.

5. Compile e execute o projeto:
   ```bash
   mvn spring-boot:run
   ```

6. Testando a API: Utilize um programa de sua preferência, como Postman ou Insomnia, para realizar os testes nos endpoints.

---

## 📜 Licença

Este projeto é apenas para fins educacionais e não possui uma licença específica.
