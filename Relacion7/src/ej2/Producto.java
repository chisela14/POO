package ej2;

import java.util.Objects;

public class Producto {
	private int codigo;
	private String nombre;
	private String descripcion;
	private double precio;
	private final static double IVA = 0.20;
	
	public Producto(String nombre) {
		super();
		this.codigo = generarCodigo();
		this.nombre = nombre;
		this.descripcion = "";
		this.precio = 0;
	}

	public int generarCodigo() {
		int resultado = (int) Math.random()*10;
		return resultado;
		
	}
	
	public double getPrecioVenta() {
		double precioVenta = precio + (precio * IVA);
		return precioVenta;
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


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Producto other = (Producto) obj;
		return codigo == other.codigo;
	}


	@Override
	public String toString() {
		return "Producto [codigo=" + codigo + ", nombre=" + nombre + ", descripcion=" + descripcion + ", precio="
				+ precio + "]";
	}
	
	
	

}
