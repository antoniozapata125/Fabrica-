package Implemts;

import Iconexion.iconexion;

public class ConexionVacia implements iconexion {

	@Override
	public void conectar() {
		System.out.println("No se especifico el proveedor");
	}

	@Override
	public void desconectar() {
		System.out.println("No se especifico el proveedor");
	}

}
