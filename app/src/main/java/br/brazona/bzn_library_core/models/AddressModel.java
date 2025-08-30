package br.brazona.bzn_library_core.models;

import org.springframework.stereotype.Component;



/**
 * AddressModel
 * 
 * @author Brazona
 * @since 1.0
 */

@Component
public class AddressModel {

	/** Name of the address */
	private String name;
	/** street of the address */
	private String street;
	/** number of the address */
	private String number;
	/** complement of the address */
	private String complement;
	/** neighborhood of the address */
	private String neighborhood;
	/** city of the address */
	private String city;
	/** state of the address */
	private String state;
	/** country of the address */
	private String country;
	/** zip code of the address */
	private String zipCode;
	/** username of the address */
	private String username;

	/**
	 * Default constructor
	 */
	public AddressModel() {
		super();
	}

	/**
	 * Constructor with parameters
	 * 
	 * @param name         name of the address
	 * @param street       name of the street address
	 * @param number       number of the address
	 * @param complement   complement of the address
	 * @param neighborhood neighborhood of the address
	 * @param city         city of the address
	 * @param state        state of the address
	 * @param country      country of the address
	 * @param zipCode      zip code of the address
	 * @param username     username of the address
	 */
	public AddressModel(String name, String street, String number, String complement, String neighborhood, String city,
			String state, String country, String zipCode, String username) {
		super();
		this.name = name;
		this.street = street;
		this.number = number;
		this.complement = complement;
		this.neighborhood = neighborhood;
		this.city = city;
		this.state = state;
		this.country = country;
		this.zipCode = zipCode;
		this.username = username;

	}
	
	// Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getComplement() {
		return complement;
	}

	public void setComplement(String complement) {
		this.complement = complement;
	}

	public String getNeighborhood() {
		return neighborhood;
	}

	public void setNeighborhood(String neighborhood) {
		this.neighborhood = neighborhood;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}


}
