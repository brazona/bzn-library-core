package br.brazona.bzn_library_core.models;

import org.springframework.stereotype.Component;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


/**
 * ContactModel
 * 
 * @author Brazona
 * @since 1.0
 */

@Getter
@Setter
@Builder
@Component
public class ContactModel {
	
	/**Contact phone number. */
	private String phone;
	/**Contact email address. */
	private String email;
	
	/**
	 * Default constructor
	 */
	public ContactModel() {
		super();
	}
	
	/**
	 * Constructor with parameters
	 * 
	 * @param phone Contact phone number
	 * @param email Contact email address
	 */
	public ContactModel(String phone, String email) {
		super();
		this.phone = phone;
		this.email = email;
		
	}
}
