/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testejdbc;

import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Juliano
 */
public class TesteJDBC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    public static void insertPessoa() {
        com.mysql.jdbc.Connection conn = Conexao.getConnection();
        try {
            Statement st = conn.createStatement();
            String q = "";
            q += "INSERT INTO pessoa (nome, idade)";
            q += "VALUES('Juliano', 28)";
            System.out.println(q);
            st.executeUpdate(q);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        try {
            Statement st = conn.createStatement();
            String q = "";
            q += "UPDATE tab_veiculos SET ";
            q += "status = 1 ";
            q += "WHERE renavan = '" + v.getRenavan() + "'";
            System.out.println(q);
            st.executeUpdate(q);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }



    }
    
    
    
    
}
