package br.brazona.bzn_library_core.models;

import org.springframework.stereotype.Component;

import br.brazona.bzn_library_core.enuns.RoleEnum;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * RoleModel
 * 
 * @author Brazona
 * @since 1.0
 */

@Getter
@Setter
@Builder
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
}
