package principal;

import coches.Coche;
import utilidades.Utilidades;
import ventas_autos.Ventas;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ventas v1 = new Ventas(); 
		v1.setFechaVenta("21-09-2022");
		v1.setNombreComprador("Raul");
		v1.setNombreVendedor("Alberto");
		v1.imprimir();
		Coche c1  = new Coche();
		c1.setMarca("Audi");
		c1.setModelo("A3");
		c1.setPotencia(2500);
		
		/*Utilidades u1 = new Utilidades();
		u1.imprimirDatos(c1, v1);*/
		
	    // ahora utilizando el metodo imprimir 2 
		
		v1.imprimir2(c1);
	
	}
	}


