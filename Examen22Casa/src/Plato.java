
public class Plato {
	private String nombre;
	private double precio;
	private Vino vinoRecomendado;
	private static final double IVA = 21;
	
	Plato(String nombre){
		this.nombre = nombre;
	}

	public Plato(String nombre, double precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}
	

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setVinoRecomendado (Vino vino) {
		this.vinoRecomendado = vino;
	}
	public static double getIVA() {
		return IVA;
	}

	@Override
	public String toString() {
		String string = "Plato [nombre=" + nombre + ", precio=" + precio ;
		if (this.vinoRecomendado != null) {
			String vino = "vinoRecomendado=" + vinoRecomendado.getNombreVino() + ", " + vinoRecomendado.getGraduacion();
			string += ", "+ vino;
		}
		string += "]";
		return string;
	}

	
	

}
