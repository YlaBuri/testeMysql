package br.ucsal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	private static Connection conexao;

    

    static {
    	String driver = "com.mysql.cj.jdbc.Driver";
        String server = "jdbc:mysql://localhost:3306/teste?useTimezone=true&serverTimezone=UTC";
        String usuario = "root";
        String senha = "";
    	try {
			Class.forName(driver);
			conexao = DriverManager.getConnection(server, usuario, senha);
		} catch (ClassNotFoundException e1) {
			System.out.println("erro");
			e1.printStackTrace();
		} catch (SQLException e) {
			System.out.println("erro2");
			e.printStackTrace();
		}
    }
    
    public static Connection getConnection(){

		return conexao;
	}
}
