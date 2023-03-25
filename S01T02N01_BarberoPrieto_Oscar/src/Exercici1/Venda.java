package Exercici1;

import java.util.ArrayList;

public class Venda {

	private static ArrayList<Producte> listaProductes = new ArrayList<Producte>();
	private static double preuTotal = 0;
	Producte article;

	public Venda(Producte article) {

		addProducte(article);

	}

	public void addProducte(Producte article) {

		listaProductes.add(article);
	}

	public static double calcularTotal() {

		try {

			if (listaProductes.isEmpty()) {

				throw new VendaBuidaException("Per fer una venda primer has d’afegir productes");

			} else {

				/*
				 * Codi per a generar i capturar una excepció de tipus
				 * ArrayIndexOutOfBoundsException
				 * 
				 * int[] arraySencers = {1, 2, 3}; int valorPosicio3 = arraySencers[3];
				 * 
				 */

				for (int i = 0; i < listaProductes.size(); i++) {

					preuTotal += listaProductes.get(i).getPreu();
				}

			}
		} catch (ArrayIndexOutOfBoundsException e) {

			System.out.println("Error : " + e.getMessage());

		} catch (VendaBuidaException e) {

			System.out.println("Error : " + e.getMessage());

		}

		return preuTotal;
	}
}
