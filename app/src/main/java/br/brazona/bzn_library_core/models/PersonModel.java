package br.brazona.bzn_library_core.models;

import java.util.List;

import org.springframework.stereotype.Component;

import br.brazona.bzn_library_core.enuns.GenderEnum;

/**
 * PersonModel
 * 
 * @author Brazona
 * @since 1.0
 */

@Component
public class PersonModel {

	/** Name of the person */
	private String name;
	/** Social name of the person */
	private String name_social;
	/** Document of the person */
	private String document;
	/** Gender of the person. */
	private GenderEnum gender;
	/** User associated with person. */
	private String username;
	/** Addresses associated with person. */
	private List<AddressModel> addresses;
	/** Contacts associated with person. */
	private ContactModel contacts;

	/**
	 * Default constructor
	 */
	public PersonModel() {
		super();

	}

	/**
	 * Constructor with parameters
	 * 
	 * @param name        name of the person
	 * @param name_social social name of the person
	 * @param document    document of the person
	 * @param gender      gender of the person.
	 * @param username    user associated with person.
	 * @param addresses   addresses associated with person.
	 * @param contacts    contacts associated with person.
	 */
	public PersonModel(String name, String name_social, String document, GenderEnum gender, String username,
			List<AddressModel> addresses, ContactModel contacts) {
		super();
		this.name = name;
		this.name_social = name_social;
		this.document = document;
		this.gender = gender;
		this.username = username;
		this.addresses = addresses;
		this.contacts = contacts;

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

	public String getDocument() {
		return document;
	}

	public void setDocument(String document) {
		this.document = document;
	}

	public GenderEnum getGender() {
		return gender;
	}

	public void setGender(GenderEnum gender) {
		this.gender = gender;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public List<AddressModel> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<AddressModel> addresses) {
		this.addresses = addresses;
	}

	public ContactModel getContacts() {
		return contacts;
	}

	public void setContacts(ContactModel contacts) {
		this.contacts = contacts;
	}

}
