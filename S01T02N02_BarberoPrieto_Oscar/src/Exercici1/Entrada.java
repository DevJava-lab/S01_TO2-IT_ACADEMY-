package Exercici1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Entrada {

	public static void main(String[] args) {

		String missatge1 = "Introdueix un numero : ";
		String missatge2 = "Introdueix un caracter : ";
		String missatge3 = "Introdueix una paraula : ";
		String missatge4 = "Introdueix  una resposta (s / n) : ";

		/*
		 * int num1 = llegirInt(missatge1); 
		 * System.out.println("Numero escollit : " + num1);
		 * 
		 * char caracter = llegirChar(missatge2);
		 * System.out.println("Caracter escollit : " + caracter);
		 * 
		 * String paraula = llegirString(missatge3);
		 * System.out.println("Paraula escollida : " + paraula);
		 * 
		 */
		boolean valida = llegirSiNo(missatge4);
		System.out.println("La resposta es : " + valida);

	}

	public static byte llegirByte(String missatge) {

		Scanner sc = new Scanner(System.in);
		byte num = 0;
		boolean resposta;

		do {

			try {
				resposta = false;
				System.out.println(missatge);
				num = sc.nextByte();

			} catch (InputMismatchException e) {
				System.out.println("Error de format : ");
				sc.next();
				resposta = true;
			}
		} while (resposta);

		return num;

	}

	public static int llegirInt(String missatge) {

		Scanner sc = new Scanner(System.in);
		int num = 0;
		boolean resposta;

		do {

			try {
				resposta = false;
				System.out.println(missatge);
				num = sc.nextInt();

			} catch (InputMismatchException e) {
				System.out.println("Error de format");
				sc.next();
				resposta = true;
			}
		} while (resposta);

		return num;

	}

	public static float llegirFloat(String missatge) {

		Scanner sc = new Scanner(System.in);
		float num = 0;
		boolean resposta;

		do {

			try {
				resposta = false;
				System.out.println(missatge);
				num = sc.nextFloat();

			} catch (InputMismatchException e) {
				System.out.println("Error de format");
				sc.next();
				resposta = true;
			}
		} while (resposta);

		return num;
	}

	public static double llegirDouble(String missatge) {

		Scanner sc = new Scanner(System.in);
		double num = 0;
		boolean resposta;

		do {

			try {
				resposta = false;
				System.out.println(missatge);
				num = sc.nextDouble();

			} catch (InputMismatchException e) {
				System.out.println("Error de format");
				sc.next();
				resposta = true;
			}
		} while (resposta);

		return num;

	}

	public static char llegirChar(String missatge) {

		Scanner sc = new Scanner(System.in);
		char caracter = ' ';
		boolean resposta;

		do {

			try {
				resposta = false;
				System.out.println(missatge);
				caracter = sc.next().charAt(0);

			} catch (Exception e) {
				System.out.println("Error de format : ");
				sc.next();
				resposta = true;
			}
		} while (resposta);

		return caracter;

	}

	public static String llegirString(String missatge) {

		Scanner sc = new Scanner(System.in);
		String paraula = "null";
		boolean resposta;

		do {

			try {
				resposta = false;
				System.out.println(missatge);
				paraula = sc.next();

				if (!paraula.matches("[a-z,A-Z]*")) {

					throw new Exception();

				}

			} catch (Exception e) {
				System.out.println("Error de format. Solament s'admeten lletres.");

				resposta = true;

			}
		} while (resposta);

		return paraula;

	}

	public static boolean llegirSiNo(String missatge) {

		Scanner sc = new Scanner(System.in);
		String resposta = "";
		boolean esCorrecte;

		do {

			try {
				esCorrecte = false;
				System.out.println(missatge);
				resposta = sc.next().toLowerCase();

				if (!resposta.equals("s") && !resposta.equals("n")) {

					throw new Exception();

				}

			} catch (Exception e) {
				System.out.println("Error de format. Solament s'admet una opció valida.");

				esCorrecte = true;

			}
		} while (esCorrecte);

		return resposta.equals("s");

	}
}
