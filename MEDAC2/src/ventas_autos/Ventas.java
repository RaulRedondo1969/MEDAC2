package ventas_autos;

import coches.Coche;

public class Ventas {
	
	
	private String fechaVenta; 
	private String nombreVendedor; 
	private String nombreComprador;
	private Coche auto;
	
	
	
	public Coche getAuto() {
		return auto;
	}
	public void setAuto(Coche auto) {
		this.auto = auto;
	}
	public String getFechaVenta() {
		return fechaVenta;
	}
	public void setFechaVenta(String fechaVenta) {
		this.fechaVenta = fechaVenta;
	}
	public String getNombreVendedor() {
		return nombreVendedor;
	}
	public void setNombreVendedor(String nombreVendedor) {
		this.nombreVendedor = nombreVendedor;
	}
	public String getNombreComprador() {
		return nombreComprador;
	}
	public void setNombreComprador(String nombreComprador) {
		this.nombreComprador = nombreComprador;
	} 
	
	
	public void imprimir() {
		System.out.println("Datos de la venta........");
		System.out.println("Fecha de Venta..."+this.fechaVenta);
		System.out.println("Nombre del vendedor..."+this.nombreVendedor);
		System.out.println("Nombre del comprador..."+this.nombreComprador);
	}
	public void imprimir2(Coche auto) {
		System.out.println("Datos de la venta........");
		System.out.println("Fecha de Venta..."+this.fechaVenta);
		System.out.println("Nombre del vendedor..."+this.nombreVendedor);
		System.out.println("Nombre del comprador..."+this.nombreComprador);
		System.out.println("Marca..."+auto.getMarca());
		System.out.println("Modelo..."+auto.getModelo());
		System.out.println("Marca..."+auto.getPotencia());
		
		
		
		
	}

}
