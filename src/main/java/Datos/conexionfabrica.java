package Datos;

import Iconexion.iconexion;
import Implemts.ConexionPostgresql;
import Implemts.ConexionVacia;
import Implemts.ConexionSQLServer;
import Implemts.ConexionMysQl;

public class conexionfabrica {

	public iconexion getConexion(String motor) {
	if (motor == null ) {
		return new ConexionVacia();
		
	}
	if (motor.equalsIgnoreCase("Postgresql")) {
		return new ConexionPostgresql();
	}if (motor.equalsIgnoreCase("SQL SERVER")) {
		return new ConexionSQLServer();
	}if (motor.equalsIgnoreCase("MySQL")) {
		return new ConexionMysQl();
	}
	return new ConexionVacia(); 
	}
}
