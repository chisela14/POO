
import java.util.Objects;

/**
 * 
 * @author Chisela
 * @version 1.0
 */

public class Punto {
	
	//Atributos de la clase punto
	private double x,y;
	
	/**
	 * Constructor principal de la clase Punto
	 * @param x valor x de un punto
	 * @param y valor y de un punto
	 */
	Punto (double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	// Serie de get y set, hay que comentarlos TODOS
	/**
	 * 
	 * @return atributo x
	 */
	public double getX() {
		return x;
	}
	
	/**
	 * 
	 * @param x atributo x
	 */
	public void setX(double x) {
		this.x = x;
	}
	
	/**
	 * 
	 * @return atributo y
	 */
	public double getY() {
		return y;
	}
	
	/**
	 * 
	 * @param y atributo y
	 */
	public void setY(double y) {
		this.y = y;
	}
	
	//hashcode
	@Override
	public int hashCode() {
		return Objects.hash(x, y);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Punto other = (Punto) obj;
		return Double.doubleToLongBits(x) == Double.doubleToLongBits(other.x)
				&& Double.doubleToLongBits(y) == Double.doubleToLongBits(other.y);
	}

	@Override
	public String toString() {
		return "Punto [x=" + x + ", y=" + y + "]";
	}
	
	
}
