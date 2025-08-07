package br.brazona.bzn_library_core.models;

import java.util.List;

import org.springframework.stereotype.Component;

import br.brazona.bzn_library_core.enuns.FunctionalityActionsEnum;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@Component
public class PermissionModel {

	private String id;
	private FunctionalitiesModel functionality;
	private List<FunctionalityActionsEnum> functionality_actions;
}
