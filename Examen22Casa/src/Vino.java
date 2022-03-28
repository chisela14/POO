
public class Vino {
	private String nombre;
	private double graduacion;
	
	public Vino(String nombre, double graduacion) {
		super();
		this.nombre = nombre;
		this.graduacion = graduacion;
	}
	public Vino(String nombre) {
		super();
		this.nombre = nombre;
	}
	public String getNombreVino() {
		return nombre;
	}
	public double getGraduacion() {
		return graduacion;
	}
	
	

}
