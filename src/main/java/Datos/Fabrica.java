package Datos;

import Iconexion.iconexion;

public class Fabrica {

	public static void main(String[] args) {
		conexionfabrica Fabrica = new conexionfabrica();
		
		iconexion cx1 = Fabrica.getConexion("Postgresql");
		System.out.println();
		System.out.println("--------------------------------");
		cx1.conectar();
		System.out.println("--------------------------------");
		cx1.desconectar();
		System.out.println("--------------------------------");
	
		
		iconexion cx2 = Fabrica.getConexion("Vacia");
		System.out.println();
		System.out.println("--------------------------------");
		cx2.conectar();
		System.out.println("--------------------------------");
		cx2.desconectar();
		System.out.println("--------------------------------");
		

	}

}
