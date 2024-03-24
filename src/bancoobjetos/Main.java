package bancoobjetos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		Cuenta cuenta1 = new Cuenta();
		
		int numeroCuenta;
		int dni;
		double saldo;
		int opcion;
		double ingreso;
		double retiro;
		
		System.out.println("Ingrese su numero de cuenta");
		numeroCuenta = scan.nextInt();
		
		System.out.println("Ingrese su dni");
		dni = scan.nextInt();
		
		System.out.println("Ingrese su saldo");
		saldo = scan.nextDouble();
		
		llenarObjeto(cuenta1, numeroCuenta, dni, saldo);
		
		do {
			System.out.println("Que acción quiere realizar");
			System.out.println("1- Ingresar dinero");
			System.out.println("2- Retirar dinero");
			System.out.println("3- Extracción rápida");
			System.out.println("4- Mostrar saldo");
			System.out.println("5- Ver todos los datos");
			System.out.println("0- Salir");
			opcion = scan.nextInt();
			
			switch (opcion) {
			case 1:
				System.out.println("¿Cuánto dinero quiere ingresar?");
				ingreso = scan.nextDouble();
				cuenta1.ingresar(ingreso);
				break;
			case 2:
				System.out.println("¿Cuánto dinero quiere retirar?");
				retiro = scan.nextDouble();
				cuenta1.retirar(retiro);			
				break;
			case 3:
				cuenta1.extraccionRapida();			
				break;
			case 4:
				cuenta1.mostrarSaldo();			
				break;
			case 5:
				mostrarObjeto(cuenta1);			
				break;
			case 0:
				System.out.println("Gracias por operar");			
				break;

			default:
				System.out.println("Ingrese una opción valida");
				break;
			}
		}while(opcion != 0);

	}
	
	public static void llenarObjeto(Cuenta cuenta, int numeroCuenta, int dni, double saldo) {
		
		cuenta.setNumeroCuenta(numeroCuenta);
		cuenta.setDni(dni);
		cuenta.setSaldo(saldo);
		
	}
	
	public static void mostrarObjeto(Cuenta cuenta) {
		
		 System.out.println("El numero de cuenta es: " + cuenta.getNumeroCuenta() + ", el dni es: " + 
		 cuenta.getDni() + ", el saldo es de: " + cuenta.getSaldo());
	}
}
