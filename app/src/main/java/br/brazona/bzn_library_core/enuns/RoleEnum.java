package br.brazona.bzn_library_core.enuns;

/**
 * Enumeration representing different user roles within the system.
 * 
 * Roles include: - OWNER_SYS: System owner with full access and control over
 * the system. - ADM_SYS: System administrator with high-level permissions for
 * managing the system. - ADM_ORG: Organization administrator with permissions
 * to manage organizational settings and users. - USER_SYS: Regular system user
 * with standard access to system functionalities. - USER_ORG: Regular
 * organization user with access to organizational resources and
 * functionalities. - OWNER_ORG: Organization owner with full control over the
 * organization's settings and users.
 * 
 * This enum helps in defining and managing user roles consistently across the
 * application.
 * 
 *  * Enumeração que representa os diferentes papéis de usuário dentro do sistema.
 *
 * <p>Os papéis disponíveis são:
 * <ul>
 *   <li>OWNER_SYS - Proprietário do sistema, com acesso total e controle completo.</li>
 *   <li>ADM_SYS - Administrador do sistema, com permissões elevadas para gerenciamento.</li>
 *   <li>ADM_ORG - Administrador da organização, responsável pelas configurações e usuários da organização.</li>
 *   <li>USER_SYS - Usuário comum do sistema, com acesso padrão às funcionalidades.</li>
 *   <li>USER_ORG - Usuário comum da organização, com acesso aos recursos organizacionais.</li>
 *   <li>OWNER_ORG - Proprietário da organização, com controle total sobre configurações e usuários da organização.</li>
 * </ul>
 *
 * <p>Esta enum auxilia na definição e gerenciamento consistente dos papéis de usuário na aplicação.
 *
 * @author Brazona Team
 * 
 * 
 */
public enum RoleEnum {
	/** System Owner */
	OWNER_SYS, 
	/** System Administrator */
	ADM_SYS,
	/** Organization Administrator */
	ADM_ORG, 
	/** System User */
	USER_SYS,
	/** Organization User */
	USER_ORG,
	/** Organization Owner */
	OWNER_ORG;
}
