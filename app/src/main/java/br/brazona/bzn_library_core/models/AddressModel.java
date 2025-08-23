package br.brazona.bzn_library_core.models;



import org.springframework.stereotype.Component;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Builder
@Component
public class AddressModel {

	private String name;
	private String street;
	private String number;
	private String complement;
	private String neighborhood;
	private String city;
	private String state;
	private String country;
	private String zipCode;
	private String username;

}
