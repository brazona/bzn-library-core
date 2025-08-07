package br.brazona.bzn_library_core.models;

import org.springframework.stereotype.Component;

import br.brazona.bzn_library_core.enuns.RoleEnum;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * Represents a role model in the BZN library core. This class is used to define
 * the structure and behavior of roles within the application.
 */
@Getter
@Setter
@Builder
@Component
public class RoleModel {

	/**
	 * The unique identifier for the role.
	 */
	private RoleEnum name;
	
	private String description;
}
