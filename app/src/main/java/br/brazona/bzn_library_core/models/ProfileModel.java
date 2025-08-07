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
public class ProfileModel {

	private String id;
	private String name;
	private List<PermissionModel> permissions;
	private InstitutionModel institution;


}
