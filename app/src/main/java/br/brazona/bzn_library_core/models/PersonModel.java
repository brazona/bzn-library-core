package br.brazona.bzn_library_core.models;



import java.util.List;

import org.springframework.stereotype.Component;

import br.brazona.bzn_library_core.enuns.GenderEnum;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Builder
@Component
public class PersonModel {

	private String name;
	private String name_social;
	private String document;
	private GenderEnum gender;
	private String username;
	private List<AddressModel> addresses;
	private ContactModel contacts;
	

}
