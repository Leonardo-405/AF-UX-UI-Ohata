package login;  // 1. Define o pacote do projeto

// 2. Importa as classes necessárias para manipulação de banco de dados
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class User {  // 3. Classe que representa um usuário no sistema

    // 4. Método para estabelecer a conexão com o banco de dados
    public Connection conectarBD() {
        Connection conn = null;  // 5. Inicializa a variável para conexão
        try {
            // 6. Carrega o driver do MySQL
            Class.forName("com.mysql.Driver.Manager").newInstance();
            // 7. Configura a URL para estabelecer a conexão com credenciais
            String url = "jdbc:mysql://127.0.0.1/test?user=lopes&password=123";
            // 8. Abre a conexão com o banco de dados
            conn = DriverManager.getConnection(url);
        } catch (Exception e) { 
            // 9. Captura exceções sem tratamento (recomenda-se implementar um tratamento de erro)
        }
        return conn;  // 10. Retorna a conexão estabelecida
    }

    // 11. Declara variáveis para o nome do usuário e o resultado da validação
    public String nome = "";
    public boolean result = false;

    // 12. Método para validar o login e a senha do usuário
    public boolean verificarUsuario(String login, String senha) {
        String sql = "";  // 13. Variável para armazenar a instrução SQL
        Connection conn = conectarBD();  // 14. Obtém uma conexão ativa com o banco de dados
        // 15. Monta a consulta SQL com os dados fornecidos
        sql += "select nome from usuarios ";
        sql += "where login = '" + login + "'";
        sql += " and senha = '" + senha + "';";

        try {
            // 16. Cria um Statement para executar a consulta SQL
            Statement st = conn.createStatement();
            // 17. Executa a consulta e armazena o resultado
            ResultSet rs = st.executeQuery(sql);
            // 18. Verifica se a consulta retornou resultados
            if (rs.next()) {
                result = true;  // 19. Define o resultado como verdadeiro se o login for válido
                nome = rs.getString("nome");  // 20. Armazena o nome do usuário encontrado
            }
        } catch (Exception e) {  
            // 21. Captura exceções sem tratamento (recomenda-se implementar um tratamento de erro)
        }
        return result;  // 22. Retorna o resultado da validação do usuário
    }
}  // 23. Fim da classe User


