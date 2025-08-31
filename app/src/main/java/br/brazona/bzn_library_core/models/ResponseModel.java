package br.brazona.bzn_library_core.models;

import org.springframework.stereotype.Component;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * ResponseModel
 * 
 * @author Brazona
 * @since 1.0
 */

@Getter
@Setter
@Builder
@Component
public class ResponseModel {

	/** Response code */
	private Integer code;
	/** Response message */
	private String message;
	/** Date processed */
	private String dateProcessed;
	
	/**
	 * Default constructor
	 */	
	public ResponseModel() {
		super();
		
	}
	
	/**
	 * Constructor with parameters
	 * 
	 * @param code          response code
	 * @param message       response message
	 * @param dateProcessed date processed
	 */
	public ResponseModel(Integer code, String message, String dateProcessed) {
		super();
		this.code = code;
		this.message = message;
		this.dateProcessed = dateProcessed;
		
	}
	
}