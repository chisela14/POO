import java.util.Objects;

public class Cuenta {
	//atributos
	int saldo;
	//constructores
	Cuenta (int saldo) {
		this.saldo = saldo;
	}
	//get set
	public int getSaldo() {
		return saldo;
	}
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	//metodos
	public void hacerReintegro (int dinero) {
		saldo = saldo - dinero;
	}
	public void hacerIngreso (int dinero) {
		saldo = saldo + dinero;
	}
	
	//hashcode
	@Override
	public int hashCode() {
		return Objects.hash(saldo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cuenta other = (Cuenta) obj;
		return saldo == other.saldo;
	}
	@Override
	public String toString() {
		return "Cuenta [saldo=" + saldo + "]";
	}
	

}
