package ejerciciosad;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// Inicializamos scanner y leemos 2 enteros
		Scanner sc=new Scanner(System.in);
		int dia=sc.nextInt();
		int mes=sc.nextInt();
				
		// Comprobamos si alguno es mayor y mostramos el mensaje que proceda
		if(dia==25 && mes==12){
			System.out.println("SI");
		} else{
			System.out.println("NO");
		}
	}
}


