package entidades;

public class Retangulo {
	
	public double largura;
	public double altura;
	
	public double Area() {
		  double a = largura * altura;
		 return a ;
	}
	public double Perimetro() {
		double p = 2 * (largura + altura);
		return p;
	}
	public double Diagonal() {
		double d = Math.sqrt(altura * altura + largura * largura  );
		return d;
	}
	
}
