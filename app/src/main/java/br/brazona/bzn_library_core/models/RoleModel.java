package br.brazona.bzn_library_core.models;

import org.springframework.stereotype.Component;

import br.brazona.bzn_library_core.enuns.RoleEnum;


/**
 * RoleModel
 * 
 * @author Brazona
 * @since 1.0
 */


@Component
public class RoleModel {

	/** Name of the role */
	private RoleEnum name;
	/** Description of the role */
	private String description;
	
	/**
	 * Default constructor
	 */
	public RoleModel() {
		super();
		
	}
	
	/**
	 * Constructor with parameters
	 * 
	 * @param name        name of the role
	 * @param description description of the role
	 */
	public RoleModel(RoleEnum name, String description) {
		super();
		this.name = name;
		this.description = description;
		
	}

	// Getters and Setters
	public RoleEnum getName() {
		return name;
	}

	public void setName(RoleEnum name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
