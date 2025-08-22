package br.brazona.bzn_library_core.models;

import org.springframework.stereotype.Component;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * Modelo de resposta padrão utilizado para retornar informações sobre o status,
 * mensagem e data de processamento das operações da aplicação.
 *
 * <p>Inclui os campos:
 * <ul>
 *   <li>code - código de status da resposta</li>
 *   <li>message - mensagem associada à resposta</li>
 *   <li>dateProcessed - data em que a resposta foi processada</li>
 * </ul>
 *
 * @author Brazona Team
 */


@Getter
@Setter
@Builder
@Component
public class ResponseModel {

	private Integer code;
	private String message;
	private String dateProcessed;
	
}
