package utilidades;

import coches.Coche;
import ventas_autos.Ventas;

public class Utilidades {
	
	public void imprimirDatos(Coche c, Ventas v) {
		
		System.out.println("Marca del auto..."+c.getMarca());
		System.out.println("Modelo del auto..."+c.getModelo());
		System.out.println("Potencia..."+c.getPotencia());
		
		System.out.println("Nombre del vendedor..."+v.getNombreVendedor());
		System.out.println("Nombre del comprador..."+v.getNombreComprador());
		System.out.println("Fecha de Ventas...."+v.getFechaVenta());
		
		
	}

}
