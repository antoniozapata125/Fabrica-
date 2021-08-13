package Datos;

import Iconexion.iconexion;
import Implemts.ConexionPostgresql;
import Implemts.ConexionVacia;

public class conexionfabrica {

	public iconexion getConexion(String motor) {
	if (motor == null ) {
		return new ConexionVacia();
		
	}
	if (motor.equalsIgnoreCase("Postgresql")) {
		return new ConexionPostgresql();
	}
	return new ConexionVacia();
	}
}
