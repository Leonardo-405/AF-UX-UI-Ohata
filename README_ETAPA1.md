# TESTE CAIXA BRANCA

## Descrição 

Abaixo estão listados os erros encontrados no código original, que comprometem sua funcionalidade, segurança e boas práticas de programação.

---

## Erros Encontrados

### 1. **Driver JDBC Inválido**

- O driver informado no código está incorreto: 
`"com.mysql.Driver.Manager"`.
- O driver correto para utilização com o MySQL é
 `"com.mysql.cj.jdbc.Driver"`.

---

### 2. **Armazenamento de Credenciais no Código**

- As informações de acesso ao banco de dados estão codificadas diretamente no programa:
    "String url = "jdbc:mysql://127.0.0.1/test?user=lopes&password=123";"
    Essa prática apresenta riscos de segurança, podendo expor informações previstas caso o código seja compartilhado.

---

### 3. **Ausência de Tratamento de Exceções**

- As abordagens capturadas são ignoradas:
    "} catch (Exception e) { }"
    Essa abordagem envolve a identificação de erros e contraria as boas práticas de depuração.

---

### 4. **Vulnerabilidade à injeção de SQL**

- Consultas SQL são construídas por meio de concatenação de strings:
  sql += "select nome from usuarios ";
  sql += "where login = '" + login + "'";
  sql += " and senha = '" + senha + "';";

---

### 5. **Recursos Não São Encerrados**

- Objetos como (`Connection`), `Statement` e `ResultSet` não são fechados após o uso.
- Isso pode resultar em **vazamento de recursos**, especialmente em aplicações com uso do banco de dados.

---

### 6. **Falta de verificação de conexão**

- O código não valida se a conexão foi estabelecida antes de executar comandos SQL.
- Caso connseja nulo, pode ocorrer uma NullPointerException .

---

### 7. **Manutenção Complexa de Consultas SQL**
- A construção direta de comandos SQL no código torna a manutenção mais trabalhada em sistemas maiores.
- É perturbado o uso de consultas parametrizadas com PreparedStatement para maior segurança e facilidade de manutenção.
