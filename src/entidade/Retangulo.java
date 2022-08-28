package entidade;
import java.lang.Math;

public class Retangulo {
	public double altura;
	public double largura;
	
	public double areaRetangulo() {
		double area=largura*altura;
		return area;
	}

	public double perimetroRetangulo() {
		double perimetro=(2*altura)+(2*largura);
		return perimetro;

	}
	
	public double diagonalRetangulo() {
		double diagonal=Math.sqrt(altura*altura+largura*largura);
		return diagonal;
	}

	
}
