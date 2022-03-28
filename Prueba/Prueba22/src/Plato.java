import java.util.Objects;

public class Plato {
	//Atributos de la clase plato
	private String nombre;
	private double precio, precioVentaPublico = precio*IVA/100;
	private static final double IVA = 21;
	//Tipos de vino para recomendar a un plato
	private Vino v1 = new Vino ("blanco", 8.6);
	private Vino v2 = new Vino ("tinto", 6.9);
	private String vinoRecomendado;
	
	//Constructores de la clase plato
	/**
	 * Constructor para la clase Plato solo con una cadena
	 * @param nombre nombre del plato
	 */
	Plato (String nombre){
		super();
		this.nombre = nombre;
	}
	/**
	 * Constructor para la clase Plato con una cadena y una cantidad
	 * @param nombre nombre del plato
	 * @param precio precio base del plato
	 */
	Plato (String nombre, double precio){
		super();
		this.nombre = nombre;
		this.precio = precio;
	}
	
	//Metodos de la clase plato
	/**
	 * Metodo para incrementar el precio base del plato segun desee el usuario (no devuelve nada)
	 * @param incremento cantidad a incrementar
	 */
	public void incrementaPrecio (double incremento) {
		precio = precio + incremento;
	}
	//Serie de getter y setter de los atributos
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecioBase() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public double getPrecioVentaPublico() {
		return precioVentaPublico;
	}
	public void setPrecioVentaPublico(double precioVentaPublico) {
		this.precioVentaPublico = precioVentaPublico;
	}
	public static double getIVA() {
		return IVA;
	}
	
	//Serie de getter y setter requeridos
	/**
	 * He establecido que se recomendara el vino en función de la longitud del nombre
	 * para ello he creado dos tipos de vino y se asignara uno de los dos
	 * @return nombre del vino recomendado (blanco o tinto)
	 */
	public String getVinoRecomendado() {
		if (nombre.length() > 10) {
			vinoRecomendado = v1.getNombre();
		}else {
			vinoRecomendado = v2.getNombre();
		}
		return vinoRecomendado;
		
	}
	public void setVinoRecomendado(Vino vino) {
		
	}
	public void setVinoRecomendado(String vino, double graduacion) {
			
	}
	/**
	 * He establecido que se recomendara el vino en función de la longitud del nombre
	 * para ello he creado dos tipos de vino y se asignara uno de los dos
	 * @return graduacion del vino recomendado (8.6 o 6.9)
	 */
	public double getGradosVinoRecomendado() {
		if (nombre.length() > 10) {
			vinoRecomendado = String.valueOf(v1.getGraduacion());
		}else {
			vinoRecomendado = String.valueOf(v2.getGraduacion());
		}
		return Double.parseDouble(vinoRecomendado);
	}
	
	//hashcode
	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Plato other = (Plato) obj;
		return Objects.equals(nombre, other.nombre);
	}
	@Override
	public String toString() {
		return "Plato [nombre=" + nombre + ", precio=" + precio + ", precioVentaPublico=" + precioVentaPublico
				+ ", getVinoRecomendado()=" + getVinoRecomendado() + ", getGradosVinoRecomendado()="
				+ getGradosVinoRecomendado() + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
