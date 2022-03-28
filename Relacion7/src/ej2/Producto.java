package ej2;

public class Producto {
	private int codigo;
	private String descripcion;
	private double precio;
	private final double IVA = 0.20;
	
	
	public Producto(int codigo) {
		super();
		this.codigo = codigo;
		//crear codigo
	}
	
	public void getPrecioVenta() {
		double precioVenta = precio + (precio * IVA);
	}
	
	

}
