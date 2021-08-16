package Datos;

import Iconexion.iconexion;

public class Fabrica {

	public static void main(String[] args) {
		conexionfabrica Fabrica = new conexionfabrica();
		
		iconexion cx1 = Fabrica.getConexion("Postgresql");
		System.out.println();
		System.out.println("1.  Conexion base de datos a postgresql");
		System.out.println();
		System.out.println("--------------------------------");
		cx1.conectar();
		System.out.println("--------------------------------");
		cx1.desconectar();
		System.out.println("--------------------------------");
	
		
		iconexion cx2 = Fabrica.getConexion("Vacia");
		System.out.println();
		System.out.println("2.  Conexion vacia no hay ninguna base de datos");
		System.out.println();
		System.out.println("--------------------------------");
		cx2.conectar();
		System.out.println("--------------------------------");
		cx2.desconectar();
		System.out.println("--------------------------------");
		
		iconexion cx3 = Fabrica.getConexion("SQL");
		System.out.println();
		System.out.println("3.  Conexion a la base de datos de SQL Server");
		System.out.println();
		System.out.println("--------------------------------");
		cx3.conectar();
		System.out.println("--------------------------------");
		cx3.desconectar();
		System.out.println("--------------------------------");

		iconexion cx4 = Fabrica.getConexion("MysQL");
		System.out.println();
		System.out.println("4.	Conexion a la base de datos de MysQL Server");
		System.out.println();
		System.out.println("--------------------------------");
		cx4.conectar();
		System.out.println("--------------------------------");
		cx4.desconectar();
		System.out.println("--------------------------------");
	}

}
