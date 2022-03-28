import java.util.Objects;

public class Maquina {
	private int depCafe;
	private int depLeche;
	private int depVasos;
	private double monedero;
	private final double CAFE = 1;
	private final double LECHE = 0.8;
	private final double CAFECONLECHE = 1.5;
	
	Maquina (double monedero){
		this.monedero = monedero;
		llenarDepositos();
	}
	
	public void llenarDepositos () {
		this.depCafe = 50;
		this.depLeche = 50;
		this.depVasos = 80;
	}
	public boolean vaciarMonedero (double pago, double BEBIDA) {
		double cambio = pago - BEBIDA;
		if (this.monedero > cambio) {
			System.out.println("Recoge tu cambio de " + cambio + " euros");
			this.monedero = this.monedero - cambio;
			return true;
		}else {
			System.out.println("No se puede servir, la máquina no tiene cambio");
			return false;
		}
		
	}
	public void consultarEstado () {
		System.out.println("El deposito de café tiene " + this.depCafe + " unidades");
		System.out.println("El deposito de leche tiene " + this.depLeche + " unidades");
		System.out.println("El deposito de vasos tiene " + this.depVasos + " unidades");
		System.out.println("El monedero " + this.monedero + " euros");
	}
	public void servirBebida (double BEBIDA) {
		if (this.depCafe > 0 && this.depLeche > 0 && this.depVasos > 0 ) {
			this.monedero += BEBIDA;
			this.depVasos -= 1;
			if (BEBIDA == 1) {
				this.depCafe -= 1;
			}else if (BEBIDA == 0.8) {
				this.depLeche -= 1;
			}else if (BEBIDA == 1.5) {
				this.depCafe -= 1;
				this.depLeche -= 1;
			}
			System.out.println("Producto servido");
		}else if (this.depCafe == 0){
			System.out.println("Error, el café se ha acabado");
		}else if (this.depLeche == 0){
			System.out.println("Error, la leche se ha acabado");
		}	
	}
	
	public int getDepCafe() {
		return depCafe;
	}

	public void setDepCafe(int depCafe) {
		this.depCafe = depCafe;
	}

	public int getDepLeche() {
		return depLeche;
	}

	public void setDepLeche(int depLeche) {
		this.depLeche = depLeche;
	}

	public int getDepVasos() {
		return depVasos;
	}

	public void setDepVasos(int depVasos) {
		this.depVasos = depVasos;
	}

	public double getMonedero() {
		return monedero;
	}

	public void setMonedero(double monedero) {
		this.monedero = monedero;
	}

	public double getCAFE() {
		return CAFE;
	}

	public double getLECHE() {
		return LECHE;
	}

	public double getCAFECONLECHE() {
		return CAFECONLECHE;
	}

	@Override
	public int hashCode() {
		return Objects.hash(CAFE, CAFECONLECHE, LECHE, depCafe, depLeche, depVasos, monedero);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Maquina other = (Maquina) obj;
		return Double.doubleToLongBits(CAFE) == Double.doubleToLongBits(other.CAFE)
				&& Double.doubleToLongBits(CAFECONLECHE) == Double.doubleToLongBits(other.CAFECONLECHE)
				&& Double.doubleToLongBits(LECHE) == Double.doubleToLongBits(other.LECHE) && depCafe == other.depCafe
				&& depLeche == other.depLeche && depVasos == other.depVasos
				&& Double.doubleToLongBits(monedero) == Double.doubleToLongBits(other.monedero);
	}

	@Override
	public String toString() {
		return "Maquina [depCafe=" + depCafe + ", depLeche=" + depLeche + ", depVasos=" + depVasos + ", monedero="
				+ monedero + ", CAFE=" + CAFE + ", LECHE=" + LECHE + ", CAFECONLECHE=" + CAFECONLECHE + "]";
	}
	

}
