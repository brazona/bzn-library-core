package br.brazona.bzn_library_core.models;

import org.springframework.stereotype.Component;

import lombok.Builder;



/**
 * ResponseModel
 * 
 * @author Brazona
 * @since 1.0
 */

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

	// Getters and Setters
	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDateProcessed() {
		return dateProcessed;
	}

	public void setDateProcessed(String dateProcessed) {
		this.dateProcessed = dateProcessed;
	}
	
	
}
