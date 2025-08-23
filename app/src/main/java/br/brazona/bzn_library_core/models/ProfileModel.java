package br.brazona.bzn_library_core.models;

import java.util.List;

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

	/** Id of the profile */
	private String id;
	/** Name of the profile */
	private String name;
	/** Profile permissions. */
	private List<PermissionModel> permissions;
	/** Institution associated with profile. */
	private InstitutionModel institution;


	/**
	 * Default constructor
	 */
	public ProfileModel() {
		super();
		
	}
	
	/**
	 * Constructor with parameters
	 * 
	 * @param id          id of the profile
	 * @param name        name of the profile
	 * @param permissions profile permissions.
	 * @param institution institution associated with profile.
	 */
	public ProfileModel(String id, String name, List<PermissionModel> permissions, InstitutionModel institution) {
		super();
		this.id = id;
		this.name = name;
		this.permissions = permissions;
		this.institution = institution;
	}
}
