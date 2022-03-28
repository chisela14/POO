package ej2;

public class Producto {
	private int codigo;
	private String nombre;
	private String descripcion;
	private double precio;
	private final double IVA = 0.20;
	
	public Producto(String nombre) {
		super();
		this.codigo = generarCodigo();
		this.nombre = nombre;
		this.descripcion = "";
		this.precio = 0;
	}


	public int generarCodigo() {
		int resultado;
		
		return resultado;
		
	}
	
	public void getPrecioVenta() {
		double precioVenta = precio + (precio * IVA);
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public double getIVA() {
		return IVA;
	}
	
	
	

}
