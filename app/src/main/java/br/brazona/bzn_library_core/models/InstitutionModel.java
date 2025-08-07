package br.brazona.bzn_library_core.models;

import java.util.List;

import org.springframework.stereotype.Component;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@Component
public class InstitutionModel {

	private String name;
	private String name_social;
	private String cnpj;
	private AddressModel address;
	private ContactModel contacts;
	private List<PersonModel> owners;
}
