package ejerciciosad;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		//Variables
		Scanner sc = new Scanner(System.in);
		int n1, n2, n3;
		
		//Mensaje para intoducir el primer número del usuario
		System.out.print("Introduce el primer número: ");
		//Scan de la variable del primer número
		n1 = sc.nextInt();
		//Mensaje para intoducir el segundo número del usuario
		System.out.print("Introduce el segundo número: ");
		//Scan de la variable del segundo número
		n2 = sc.nextInt();
		//Mensaje para intoducir el tercer número del usuario
		System.out.print("Introduce el tercer número: ");
		//Scan de la variable del tercer número
		n3 = sc.nextInt();
		
		//Instrucciones
		if(n1 > 10 || n2 > 10 || n3 > 10){ //Si alguno es mayor a 10 se manda este mensaje
			System.out.println("Alguno es mayor a 10");
		}else { //Si ninguno es mayor a 10 se manda este mensaje
			System.out.println("Ninguno es mayor a 10");
		}
		
		//Cierre del Scanner
		sc.close();
	}
}
