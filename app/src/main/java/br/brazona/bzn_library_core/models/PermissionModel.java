package br.brazona.bzn_library_core.models;

import java.util.List;

import org.springframework.stereotype.Component;

import br.brazona.bzn_library_core.enuns.FunctionalityActionsEnum;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * PermissionModel
 * 
 * @author Brazona
 * @since 1.0
 */

@Getter
@Setter
@Builder
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
}
