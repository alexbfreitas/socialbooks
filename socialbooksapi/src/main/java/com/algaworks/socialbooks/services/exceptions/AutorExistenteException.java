package com.algaworks.socialbooks.services.exceptions;

public class AutorExistenteException extends RuntimeException {
	
		
	/**
	 * 
	 */
	
	private static final long serialVersionUID = 7671938171219397635L;

	public AutorExistenteException(String mensagem) {
		super(mensagem);		
	}
	
	public AutorExistenteException(String mensagem, Throwable causa) {
		super(mensagem, causa);		
	}

}
