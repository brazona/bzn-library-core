package br.brazona.bzn_library_core.models;


import org.springframework.stereotype.Component;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * FunctionalitiesModel
 * 
 * @author Brazona
 * @since 1.0
 */

@Getter
@Setter
@Builder
@Component
public class FunctionalitiesModel {

	/** Id of the functionality */
	private String id;
	/** Name of the functionality */
	private String name;
	/** Description of the functionality */
	private String description;
	/** Icon of the functionality */
	private String icon;
	/** Path of the functionality */
	private String path;
	/** Product code of the functionality */
	private String product_code;
	
	/**
	 * Default constructor
	 */
	public FunctionalitiesModel() {
		super();
		
	}
	
	/**
	 * Constructor with parameters
	 * 
	 * @param id           id of the functionality
	 * @param name         name of the functionality
	 * @param description  description of the functionality
	 * @param icon         icon of the functionality
	 * @param path         path of the functionality
	 * @param product_code product code of the functionality
	 */
	public FunctionalitiesModel(String id, String name, String description, String icon, String path,
            String product_code) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.icon = icon;
		this.path = path;
		this.product_code = product_code;
		
	}
}