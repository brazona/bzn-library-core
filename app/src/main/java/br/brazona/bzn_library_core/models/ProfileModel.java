package br.brazona.bzn_library_core.models;

import org.springframework.stereotype.Component;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * ProfileModel
 * 
 * @author Brazona
 * @since 1.0
 */

@Getter
@Setter
@Builder
@Component
public class ProfileModel {

	/** Name of the profile */
	private String name;
	/** Description of the profile */
	private String description;
	/** Code of the Person */
	private String profile_code;
	/** Profile permissions. */
	private PermissionModel permissions;
	/** Code of the Institution */
	private String institution_code;


	/**
	 * Default constructor
	 */
	public ProfileModel() {
		super();
		
	}
	
	/**
	 * Constructor with parameters
	 *
	 * @param name        name of the profile
	 * @param description description of the profile
	 * @param profile_code Code unique of the profile
	 * @param institution_code Code unique of the Institution
	 * @param permissions profile permissions.
	 */
	public ProfileModel(String name, String description, String profile_code, PermissionModel permissions, String institution_code) {
		super();
		this.name = name;
		this.description = description;
		this.profile_code = profile_code;
		this.permissions = permissions;
		this.institution_code = institution_code;
	}
}