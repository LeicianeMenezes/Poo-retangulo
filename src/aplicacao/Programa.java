package aplicacao;

import java.util.Locale;
import java.util.Scanner;
import entidade.Retangulo;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc=new Scanner(System.in);
		
		Retangulo r1=new Retangulo();
		
		System.out.println("Informe a altura: ");
		r1.altura=sc.nextDouble();
		
		System.out.println("Informe a largura: ");
		r1.largura=sc.nextDouble();
		
		System.out.printf("Area: %.2f\n",r1.areaRetangulo());
		System.out.printf("Perímetro:%.2f\n",r1.perimetroRetangulo());
		System.out.printf("Diagonal: %.2f\n",r1.diagonalRetangulo());
		
		sc.close();
	}

}
