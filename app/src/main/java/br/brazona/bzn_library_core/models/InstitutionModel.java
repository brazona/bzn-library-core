package br.brazona.bzn_library_core.models;

import java.util.List;

import org.springframework.stereotype.Component;




/**
 * InstitutionModel
 * 
 * @author Brazona
 * @since 1.0
 */


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
    // Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName_social() {
		return name_social;
	}

	public void setName_social(String name_social) {
		this.name_social = name_social;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public AddressModel getAddress() {
		return address;
	}

	public void setAddress(AddressModel address) {
		this.address = address;
	}

	public ContactModel getContacts() {
		return contacts;
	}

	public void setContacts(ContactModel contacts) {
		this.contacts = contacts;
	}

	public List<PersonModel> getOwners() {
		return owners;
	}

	public void setOwners(List<PersonModel> owners) {
		this.owners = owners;
	}
	
	
}
