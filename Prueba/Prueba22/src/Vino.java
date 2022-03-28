import java.util.Objects;

public class Vino {
	//Atributos de la clase vino
	private String nombre;
	private double graduacion;
	
	//Constructores de la clase vino
	/**
	 * Constructor de la clase Vino solo con una cadena
	 * @param nombre nombre del vino
	 */
	public Vino(String nombre) {
		super();
		this.nombre = nombre;
	}
	/**
	 * Constructor de la clase Vino con una cadena y una cantidad
	 * @param nombre nombre del vino
	 * @param graduacion grado de alcohol del vino
	 */
	public Vino(String nombre, double graduacion) {
		super();
		this.nombre = nombre;
		this.graduacion = graduacion;
	}
	
	//Getter y setter de los atributos
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getGraduacion() {
		return graduacion;
	}
	public void setGraduacion(double graduacion) {
		this.graduacion = graduacion;
	}
	
	//hashcode
	@Override
	public String toString() {
		return "Vino [nombre=" + nombre + "]";
	}

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
		Vino other = (Vino) obj;
		return Objects.equals(nombre, other.nombre);
	}
	

}
