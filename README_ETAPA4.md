# Sistema de Login de Usuários - Etapa 4

Este projeto implementa um sistema básico de autenticação de usuários utilizando Java e MySQL. A principal funcionalidade é gerenciada pela classe `User`, que estabelece a conexão com o banco e valida as credenciais fornecidas.

---

## Estrutura do Projeto

O projeto contém uma única classe central:

- **User**: Responsável por conectar-se ao banco de dados e validar as credenciais de login e senha dos usuários.

---

## Funcionalidades da Classe `User`

### Descrição
A classe `User` autentica usuários através de consultas SQL no banco de dados MySQL, utilizando a API JDBC para gerenciar a comunicação.

### Principais Componentes

1. **Variáveis**:
   - `nome`: Armazena o nome do usuário após a autenticação com sucesso.
   - `result`: Indica, com um valor booleano, se a autenticação foi concluída com sucesso.

2. **Métodos**:
   - `conectarBD`: Cria uma conexão com o banco de dados.
   - `verificarUsuario`: Consulta o banco de dados para validar o login e a senha fornecidos.

---

## Informações Técnicas

### Dependências
- **Java**: Requer JDK 8 ou superior.
- **Driver JDBC MySQL**: Necessário para a conexão com o banco.

### Configurações
No método `conectarBD`, as credenciais e informações de conexão ao banco são configuradas da seguinte forma:
- **Host**: `127.0.0.1`
- **Usuário**: `lopes`
- **Senha**: `123`
- **Banco de Dados**: `test`

Certifique-se de atualizar essas informações conforme o seu ambiente de desenvolvimento.

---

## Como Executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/Leonardo-405/AF-UX-UI-Ohata

