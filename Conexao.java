
package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Tiago F. Santos
 */
public class Conexao {
    
     private String urldeconexao = "jdbc:mysql://localhost:3306/sge";
    private String usuario = "root";
    private String senha = "";
    
    public Connection Lerconexao(){
        try {
            Connection con = DriverManager.getConnection(urldeconexao,usuario,senha);
            System.out.println("Conectado");
        return con;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
  
    }
    
    
}


