
---

# 🛡️ bysafe

**bysafe** é uma API REST desenvolvida em Java com Spring Boot, focada em cadastro e autenticação de usuários, utilizando boas práticas de segurança e persistência de dados com MySQL.

---

## 📁 Estrutura do Projeto

```
bysafe/
 └── src/
     └── main/
         └── java/
             └── com/
                 └── bicript/
                     └── bysafe/
                         ├── config/         # Configurações de segurança e beans
                         ├── controllers/    # Endpoints REST
                         ├── dto/            # Objetos de transferência de dados
                         ├── entities/       # Entidades JPA (modelos do banco)
                         ├── repositories/   # Interfaces de acesso ao banco
                         └── services/       # Lógica de negócio
```

---

## 🔒 Pasta `/config`

Esta pasta centraliza as configurações da aplicação, especialmente relacionadas à segurança.

### Arquivo principal: `SecurityConfig.java`

- **PasswordEncoder:**  
  Define o uso do BCrypt para criptografia de senhas, aumentando a segurança dos dados dos usuários.

- **SecurityFilterChain:**  
  - Desabilita CSRF (Cross-Site Request Forgery), ideal para APIs REST.
  - Libera todas as rotas para acesso sem autenticação (útil para desenvolvimento e testes iniciais).

> **Atenção:**  
> Para ambientes de produção, recomenda-se ajustar as permissões e exigir autenticação conforme a necessidade do sistema.

---

## 🚀 Funcionalidades do Projeto

- **Cadastro de Usuário:**  
  Permite criar novos usuários com e-mail e senha criptografada.

- **Login de Usuário:**  
  Autentica usuários verificando e-mail e senha, retornando sucesso ou erro de autenticação.

- **Persistência com MySQL:**  
  Utiliza Spring Data JPA para salvar e consultar dados no banco MySQL.

- **Boas práticas de segurança:**  
  Senhas nunca são armazenadas em texto puro, sempre criptografadas com BCrypt.

---

## ⚙️ Tecnologias Utilizadas

- Java 21
- Spring Boot 3.x
- Spring Data JPA
- Spring Security
- MySQL
- Maven

---

## 📄 Como rodar o projeto

1. **Clone o repositório**
2. Configure o banco de dados MySQL conforme o arquivo `application.properties`
3. Execute o projeto com o comando:
   ```bash
   ./mvnw spring-boot:run
   ```
4. Acesse os endpoints via Postman, Insomnia ou outra ferramenta REST.

---

## 💡 Observações

- O projeto está pronto para ser expandido com novas regras de autenticação, autorização e funcionalidades.
- O uso de BCrypt garante maior proteção das senhas dos usuários.
- O código está organizado em camadas, facilitando manutenção e evolução.

---
