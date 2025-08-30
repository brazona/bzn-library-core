package br.brazona.bzn_library_core.models;

import org.springframework.stereotype.Component;



/**
 * ContactModel
 * 
 * @author Brazona
 * @since 1.0
 */


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

	// Getters and Setters
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
