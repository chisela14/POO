import java.util.Objects;

public class Rectangulo {
	
	private double longitud;
	private double ancho;
	

	//constructor
	Rectangulo (){
		this.longitud = 1;
		this.ancho = 1;
		//te pide que el constructor cree por defecto así que no hace falta pasarle nada
	}
	
	//calcular perimetro y area con los datos por defecto, no se pasa nada
	public double calcularPerimetro () {
		double resultado;
		resultado = 2*this.longitud + 2*this.ancho;
		return resultado;
	}
	
	public double calcularArea () {
		double resultado;
		resultado = this.longitud*this.ancho;
		return resultado;
	}
	
	//get set
	
	public double getLongitud() {
		return longitud;
	}
	//hacerlo boolean
	public boolean setLongitud(double longitud) {
		boolean posible;
		if (longitud > 0 && longitud < 20) {
			posible = true;
		} else {
			posible = false;
		}
		if (posible == true) {
			this.longitud = longitud;
		}
		return posible;
	}//no entiendo por que un boolean en vez de un double
	
	public double getAncho() {
		return ancho;
	}
	//hacerlo boolean
	public boolean setAncho(double ancho) {
		boolean posible;
		if (ancho > 0 && ancho < 20) {
			posible = true;
		} else {
			posible = false;
		}
		if (posible == true) {
			this.ancho = ancho;
		}
		return posible;
	}

	//hashcode
	//identifica de forma única al rectángulo
	@Override
	public int hashCode() {
		return Objects.hash(ancho, longitud);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rectangulo other = (Rectangulo) obj;
		return Double.doubleToLongBits(ancho) == Double.doubleToLongBits(other.ancho)
				&& Double.doubleToLongBits(longitud) == Double.doubleToLongBits(other.longitud);
	}

	@Override
	public String toString() {
		return "Rectangulo [longitud=" + longitud + ", ancho=" + ancho + "]";
	}
	
	
	
	
}
