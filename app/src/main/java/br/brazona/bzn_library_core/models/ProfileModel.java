package br.brazona.bzn_library_core.models;

import java.util.List;

import org.springframework.stereotype.Component;




/**
 * ProfileModel
 * 
 * @author Brazona
 * @since 1.0
 */


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

	// Getters and Setters
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<PermissionModel> getPermissions() {
		return permissions;
	}

	public void setPermissions(List<PermissionModel> permissions) {
		this.permissions = permissions;
	}

	public InstitutionModel getInstitution() {
		return institution;
	}

	public void setInstitution(InstitutionModel institution) {
		this.institution = institution;
	}
	
	
}
