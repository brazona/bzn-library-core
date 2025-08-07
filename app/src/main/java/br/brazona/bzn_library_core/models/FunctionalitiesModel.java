package br.brazona.bzn_library_core.models;


import org.springframework.stereotype.Component;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@Component
public class FunctionalitiesModel {

	private String id;
	private String name;
	private String description;
	private String icon;
	private String path;
	private String product_code;
}
