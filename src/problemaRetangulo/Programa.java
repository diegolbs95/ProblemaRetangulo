package problemaRetangulo;

import java.util.Locale;
import java.util.Scanner;

import entidades.Retangulo;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		Retangulo R;
		R = new Retangulo();
		
		System.out.println("Digitar largura e altura retângulo:");
		R.largura = sc.nextDouble();
		R.altura = sc.nextDouble();
		
		System.out.printf("Area= %.2f%n", R.Area());
		System.out.printf("Perimetro= %.2f%n", R.Perimetro());
		System.out.printf("Diagonal= %.2f%n", R.Diagonal());
		
		sc.close();
		
		
		
		
	}

}
