package br.brazona.bzn_library_core.models;

import org.springframework.stereotype.Component;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Builder
@Component
public class ErrorModel {

	private String code;
	private String message;
	private String dateProcessed;
	private String details;
	
}
