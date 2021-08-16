package Implemts;

import Iconexion.iconexion;

public class ConexionMysQl implements iconexion {
	private String host;
	private String puerto;
	private String usuario;
	private String contraseña;
	
	public void ConexionMysQL() {
		this.host = "localhost";
		this.puerto = "3306";
		this.usuario = "MysQl";
		this.contraseña = "50288840";
		
	}

	@Override
	public void conectar() {
		System.out.println("Se conecto en MysQl");
		
	}

	@Override
	public void desconectar() {
		System.out.println("Se desconecto en MysQl");
		
	}
	
}
