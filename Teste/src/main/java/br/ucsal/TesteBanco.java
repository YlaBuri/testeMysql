package br.ucsal;

import java.sql.Connection;

public class TesteBanco {

	public static void main(String[] args) {
		
		Connection c= Conexao.getConnection();
		
		if(c!= null) {
			System.out.println("funciona");
		}else {
			System.out.println("erro");
		}
	}

}
