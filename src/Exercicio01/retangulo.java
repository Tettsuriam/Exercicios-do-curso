package Exercicio01;

public class retangulo {

	public double lat;
	public double bas;
	public double diag;
	public double are;
	public double peri;

	public void calculaArea() {
		are = lat * bas;
	}

	public void calculaPerimetro() {
		peri = (bas + lat) * 2;
	}

	public void calculaDiagonal() {
		diag = Math.sqrt((bas * bas) + (lat * lat));
	}

}
