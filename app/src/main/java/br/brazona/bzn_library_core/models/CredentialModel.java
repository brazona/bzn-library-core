package br.brazona.bzn_library_core.models;

import org.springframework.stereotype.Component;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * Represents a credential model in the BZN library core. This class is used to
 * define the structure and behavior of credentials within the application.
 */

@Getter
@Setter
@Builder
@Component
public class CredentialModel {

	/**
	 * The unique identifier for the credential.
	 */
	private String username;
	/**
	 * The password associated with the credential.
	 */
	private String password;
}
