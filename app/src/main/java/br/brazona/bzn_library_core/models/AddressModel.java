package br.brazona.bzn_library_core.models;



import org.springframework.stereotype.Component;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


/**
 * AddressModel
 * 
 * @author Brazona
 * @since 1.0
 */
@Getter
@Setter
@Builder
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
	 * @param name name of the address
	 * @param street name of the street address
	 * @param number number of the address
	 * @param complement complement of the address
	 * @param neighborhood neighborhood of the address
	 * @param city city of the address
	 * @param state state of the address
	 * @param country country of the address
	 * @param zipCode zip code of the address
	 * @param username username of the address
	 */
	public AddressModel(String name, String street, String number, String complement, String neighborhood,
            String city, String state, String country, String zipCode, String username) {	
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
	

}
