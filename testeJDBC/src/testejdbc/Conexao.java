/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testeJDBC;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author jucabnu
 */
public class Conexao {

    static String status = "";

    public static Connection getConnection() {

        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            String url =
                    "jdbc:mysql://localhost/ccadastropessoas?user=root&password=";
            conn = (Connection) DriverManager.getConnection(url);
            status = "Conexão OK";
        } catch (SQLException e) {
            status = e.getMessage();
        } catch (ClassNotFoundException e) {
            status = e.getMessage();
        } catch (Exception e) {
            status = e.getMessage();
        }
        return conn;
    }
}
