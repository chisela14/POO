package ej3;

public class Jarra {
	private double capacidad;
	private double cantidad;
	
	public Jarra(double capacidad) {
		super();
		this.capacidad = capacidad;
		this.cantidad = 0;
	}
	
	public void llenarJarra() {
		this.cantidad = this.capacidad;
	}
	public void vaciarJarra() {
		this.cantidad = 0;
	}
	
	

}
