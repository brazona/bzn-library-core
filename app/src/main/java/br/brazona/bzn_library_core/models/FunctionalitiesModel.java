package br.brazona.bzn_library_core.models;


import org.springframework.stereotype.Component;




/**
 * FunctionalitiesModel
 * 
 * @author Brazona
 * @since 1.0
 */


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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getProduct_code() {
		return product_code;
	}

	public void setProduct_code(String product_code) {
		this.product_code = product_code;
	}
	
	
}
