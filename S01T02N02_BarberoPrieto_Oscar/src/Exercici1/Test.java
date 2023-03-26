package Exercici1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {

	private static String missatge="Error de format";
	
	
	public static byte llegirByte(String missatge) {
	
		byte i=0;
		try {
			
			Scanner sc = new Scanner(System.in);
			System.out.println(missatge);
			i = sc.nextByte();
			System.out.println("Numero escogit : " + i);
			
		} catch (InputMismatchException e) {
			System.out.println("Error de format");
			
		}
	
		return i;
	}
	
}
