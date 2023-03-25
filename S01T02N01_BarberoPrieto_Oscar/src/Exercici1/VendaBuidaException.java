package Exercici1;

public class VendaBuidaException extends Exception {
	
	private String message = "Per fer una venda primer has d’afegir productes";

	public VendaBuidaException() {
		super();

	}

	public VendaBuidaException(String message) {
		super(message);
		System.out.println(message);
	}

	public String getMessage() {
		return message;
	}


}
