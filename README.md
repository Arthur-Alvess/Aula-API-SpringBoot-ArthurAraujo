# Estudo de API REST - Cadastro de Pessoas e Produtos

## 📌 **Descrição do Projeto**

Projeto de uma API RESTful desenvolvida em Spring Boot com conexão MySQL. Esta aplicação permite o cadastro, consulta, atualização e remoção de registros de **pessoas** e agora também de **produtos** em um banco de dados relacional.

---

## 🛠️ **Tecnologias Utilizadas**

* Java 17
* Spring Boot 3.x
* Spring Data JPA
* MySQL
* Lombok
* Maven

---

## 📂 **Estrutura de Pastas**

├── src
│ ├── main
│ │ ├── java
│ │ │ └── com.example.cadastro_pessoas
│ │ │ ├── controller
│ │ │ │ ├── PessoasController.java
│ │ │ │ └── ProducctController.java
│ │ │ ├── model
│ │ │ │ ├── PessoasModel.java
│ │ │ │ └── ProductModel.java
│ │ │ ├── repository
│ │ │ │ ├── PessoasRepository.java
│ │ │ │ └── ProductRepository.java
│ │ │ └── service
│ │ │ ├── PessoasService.java
│ │ │ └── ProductService.java
│ │ └── resources
│ │ ├── application.properties
│ │ └── data.sql
├── db
│ └── script.sql
├── pom.xml
└── README.md

yaml
Copiar
Editar

---

## ✅ **Pré-requisitos**

* Java 17
* MySQL Server
* Maven

---

## 🚀 **Como Executar o Projeto**

1️⃣ Clone o repositório:

```bash
  git clone https://github.com/Arthur-Alvess/cadastro_pessoas.git
```
2️⃣ Acesse o diretório do projeto:

```bash
Copiar
Editar
cd cadastro_pessoas
```
3️⃣ Execute o Maven para baixar as dependências:

bash
Copiar
Editar
mvn clean install
4️⃣ Configure o banco de dados MySQL:

Acesse o MySQL:

bash
Copiar
Editar
mysql -u seu_usuario -p
Crie o banco:

sql
Copiar
Editar
CREATE DATABASE estudo_pessoas;
USE estudo_pessoas;
Rode o script para criar as tabelas:

sql
Copiar
Editar
source db/script.sql;
5️⃣ Suba a aplicação Spring Boot:

bash
Copiar
Editar
mvn spring-boot:run
A aplicação estará rodando em: http://localhost:8080

🔎 Testes da API
Você pode utilizar o Hoppscotch para testar as rotas.

📁 Pessoas
GET → /api/pessoas

Lista todas as pessoas.

GET → /api/pessoas/{id}

Busca uma pessoa pelo ID.

POST → /api/pessoas

json
Copiar
Editar
{
  "name": "João Silva",
  "telefone": "(31) 91234-5678",
  "endereco": "Rua das Flores, 123",
  "imagemPerfil": "https://imagem.com/perfil.png"
}
PUT → /api/pessoas/{id}

json
Copiar
Editar
{
  "name": "Maria Oliveira",
  "telefone": "(31) 99887-1234",
  "endereco": "Avenida Central, 456",
  "imagemPerfil": "https://imagem.com/perfil2.png"
}
DELETE → /api/pessoas/{id}

Remove a pessoa pelo ID.

📦 Produtos
GET → /api/produtos

Lista todos os produtos.

GET → /api/produtos/{id}

Busca um produto pelo ID.

POST → /api/produtos

json
Copiar
Editar
{
  "product_name": "Martelo",
  "price": 10.20,
  "quantEstoque": 10,
  "description": "Para bater nas coisas"
}
PUT → /api/produtos/{id}

json
Copiar
Editar
{
  "product_name": "Martelo de Borracha",
  "price": 15.50,
  "quantEstoque": 5,
  "description": "Martelo com cabeça de borracha"
}
DELETE → /api/produtos/{id}

Remove o produto pelo ID.

📌 Dicas Importantes
Caso queira popular automaticamente o banco ao iniciar o projeto, coloque seus INSERTs no arquivo data.sql dentro de src/main/resources.

Para visualizar as queries SQL no console, adicione ao application.properties:

properties
Copiar
Editar
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
👨‍🎓 Autor do Fork
Arthur Araujo
GitHub: Arthur-Alvess
