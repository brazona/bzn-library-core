package br.brazona.bzn_library_core.models;

import org.springframework.stereotype.Component;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * ErrorModel
 * 
 * @author Brazona
 * @since 1.0
 */

@Getter
@Setter
@Builder
@Component
public class ErrorModel {
	/** Error code. */
	private String code;
	/** Error message. */
	private String message;
	/** Date processed. */
	private String dateProcessed;
	/** Details about the error. */
	private String details;
	
	/**
	 * Default constructor
	 */	
	public ErrorModel() {
		super();
		
	}
	
	/**
	 * Constructor with parameters
	 * 
	 * @param code          Error code
	 * @param message       Error message
	 * @param dateProcessed Date processed
	 * @param details       Details about the error
	 */
	public ErrorModel(String code, String message, String dateProcessed, String details) {
		super();
		this.code = code;
		this.message = message;
		this.dateProcessed = dateProcessed;
		this.details = details;
	}
	
}
