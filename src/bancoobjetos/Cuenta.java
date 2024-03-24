package bancoobjetos;

public class Cuenta {
	private int numeroCuenta;
	private int dni;
	private double saldo;
	
	public Cuenta() {
	}

	public Cuenta(int numeroCuenta, int dni, double saldo) {
		this.numeroCuenta = numeroCuenta;
		this.dni = dni;
		this.saldo = saldo;
	}

	public int getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void ingresar(double ingreso) {
		saldo = saldo + ingreso;
	}
	
	public void retirar(double retiro) {
		if(saldo > retiro) {
			saldo = saldo - retiro;
		}else {
			saldo = 0;
		}
	}
	
	public void extraccionRapida() {
		double extraccion;
		extraccion = saldo * 0.2;
		saldo = saldo - extraccion;
		System.out.println("Extrajiste: " + extraccion);
	}
	
	public void mostrarSaldo() {
		System.out.println("El saldo actual es: " + saldo);
	}
	
	
}
