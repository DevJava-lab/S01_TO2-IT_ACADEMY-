package Exercici1;

public class Main {

	public static void main(String[] args) {

		/*
		 * Codi per a generar i capturar una excepció de tipus VendaBuidaException
		 * 
		 * Venda.calcularTotal();
		 * 
		 */

		Producte p1 = new Producte("Pera", 0.4);
		Producte p2 = new Producte("Pastanga", 1.2);
		Producte p3 = new Producte("Tomaquet", 3.0);
		Producte p4 = new Producte("Brou", 4.5);

		Venda v1 = new Venda(p1);
		Venda v2 = new Venda(p2);
		Venda v3 = new Venda(p3);
		Venda v4 = new Venda(p3);
		Venda v5 = new Venda(p4);

		double total = Venda.calcularTotal();
		System.out.println(total);

	}

}
