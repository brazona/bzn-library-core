package br.brazona.bzn_library_core.models;

import java.util.List;

import org.springframework.stereotype.Component;

import br.brazona.bzn_library_core.enuns.FunctionalityActionsEnum;


/**
 * PermissionModel
 * 
 * @author Brazona
 * @since 1.0
 */


@Component
public class PermissionModel {

	/** id of the permission */
	private String id;
	/** functionality of the permission */
	private FunctionalitiesModel functionality;
	/** actions of the functionality */
	private List<FunctionalityActionsEnum> functionality_actions;
	
	/**
	 * Default constructor
	 */
	public PermissionModel() {
		super();
		
	}
	
	/**
	 * Constructor with parameters
	 * 
	 * @param id                    id of the permission
	 * @param functionality         functionality of the permission
	 * @param functionality_actions actions of the functionality
	 */
	public PermissionModel(String id, FunctionalitiesModel functionality,
            List<FunctionalityActionsEnum> functionality_actions) {
		super();
		this.id = id;
		this.functionality = functionality;
		this.functionality_actions = functionality_actions;
		
	}

	// Getters and Setters
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public FunctionalitiesModel getFunctionality() {
		return functionality;
	}

	public void setFunctionality(FunctionalitiesModel functionality) {
		this.functionality = functionality;
	}

	public List<FunctionalityActionsEnum> getFunctionality_actions() {
		return functionality_actions;
	}

	public void setFunctionality_actions(List<FunctionalityActionsEnum> functionality_actions) {
		this.functionality_actions = functionality_actions;
	}
	
	
}
