package model.exceptions;

// RuntimeException - compilador não obriga tratar.
// Exception - compilador obriga tratar. 

public class DomainException extends RuntimeException{
	private static final long serialVersionUID = 1L;

	public DomainException(String msg) { // Permite que eu possa instanciar minha Exceção personalizada enviando uma msg para ela. 
		super(msg);
	}
}
