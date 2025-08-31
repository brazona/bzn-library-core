package br.brazona.bzn_library_core.models;

import org.springframework.stereotype.Component;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * CredentialModel
 * 
 * @author Brazona
 * @since 1.0
 */

@Getter
@Setter
@Builder
@Component
public class CredentialModel {

	/** The username associated with the credential. */
	private String username;
	/** The password associated with the credential. */
	private String password;
	
	/**
	 * Default constructor
	 */
	public CredentialModel() {
		super();
		
	}

	/**
	 * Constructor with parameters
	 * 
	 * @param username The username associated with the credential.
	 * @param password The password associated with the credential.
	 */
	public CredentialModel(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
}