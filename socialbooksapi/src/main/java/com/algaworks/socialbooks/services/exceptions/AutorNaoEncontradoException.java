package com.algaworks.socialbooks.services.exceptions;

public class AutorNaoEncontradoException extends RuntimeException {
	
		
	/**
	 * 
	 */
	
	private static final long serialVersionUID = 7671938171219397635L;

	public AutorNaoEncontradoException(String mensagem) {
		super(mensagem);		
	}
	
	public AutorNaoEncontradoException(String mensagem, Throwable causa) {
		super(mensagem, causa);		
	}

}
