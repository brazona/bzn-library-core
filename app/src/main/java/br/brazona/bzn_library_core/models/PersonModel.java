package br.brazona.bzn_library_core.models;



import java.util.List;

import org.springframework.stereotype.Component;

import br.brazona.bzn_library_core.enuns.GenderEnum;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * PersonModel
 * 
 * @author Brazona
 * @since 1.0
 */

@Getter
@Setter
@Builder
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
     * @param name name of the person
     * @param name_social social name of the person
     * @param document document of the person
     * @param gender gender of the person.
     * @param username user associated with person.
     * @param addresses addresses associated with person.
     * @param contacts contacts associated with person.
     */
         public PersonModel(String name, String name_social, String document, GenderEnum gender, String username, List<AddressModel> addresses, ContactModel contacts) {
             super();
             this.name = name;
             this.name_social = name_social;
             this.document = document;
             this.gender = gender;
             this.username = username;
             this.addresses = addresses;
             this.contacts = contacts;
             
            	 
         } 		 
	

}