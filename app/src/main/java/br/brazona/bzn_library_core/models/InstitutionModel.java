package br.brazona.bzn_library_core.models;

import java.util.List;

import org.springframework.stereotype.Component;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * InstitutionModel
 * 
 * @author Brazona
 * @since 1.0
 */

@Getter
@Setter
@Builder
@Component
public class InstitutionModel {

	/** Name of the institution */
	private String name;
	/** Social name of the institution */
	private String name_social;
	/** CNPJ of the institution */
	private String cnpj;
	/** Institution Address */
	private AddressModel address;
	/** Institution Contacts */	
	private ContactModel contacts;
	/** Institution Owners */
	private List<PersonModel> owners;
	
	/**
	 * Default constructor
	 */
	public InstitutionModel() {
		super();
	}
	
	/**
	 * Constructor with parameters
	 * 
	 * @param name        name of the institution
	 * @param name_social social name of the institution
	 * @param cnpj        CNPJ of the institution
	 * @param address     address of the institution
	 * @param contacts    contacts of the institution
	 * @param owners      owners of the institution
	 */
	public InstitutionModel(String name, String name_social, String cnpj, AddressModel address, ContactModel contacts,
            List<PersonModel> owners) {
		super();
		this.name = name;
		this.name_social = name_social;
		this.cnpj = cnpj;
		this.address = address;
		this.contacts = contacts;
		this.owners = owners;
		
	}
}