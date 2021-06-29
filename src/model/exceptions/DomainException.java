package model.exceptions;

// RuntimeException - compilador n�o obriga tratar.
// Exception - compilador obriga tratar. 

public class DomainException extends RuntimeException{
	private static final long serialVersionUID = 1L;

	public DomainException(String msg) { // Permite que eu possa instanciar minha Exce��o personalizada enviando uma msg para ela. 
		super(msg);
	}
}
