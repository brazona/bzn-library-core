package br.brazona.bzn_library_core.enuns;

/**
 * Enumeration representing various actions that can be performed on
 * functionalities within the system. This enum is used to standardize action
 * names across the application.
 * 
 * Actions include: - INSERT: Adding new records or data. - READ: Viewing or
 * retrieving existing records or data. - EDIT: Modifying existing records or
 * data. - DELETE: Removing records or data. - APPROVE: Authorizing or
 * validating records or actions. - REJECT: Denying or invalidating records or
 * actions. - EXPORT: Extracting data for external use. - IMPORT: Bringing in
 * data from external sources. - PRINT: Generating a physical copy of data. -
 * SHARE: Distributing data to other users or systems. - CANCEL: Aborting an
 * ongoing action or process. - REVIEW: Evaluating or assessing records or
 * actions. - DELEGATE: Assigning tasks or responsibilities to others. -
 * GENERATE_REPORT: Creating structured reports based on data. - GENERATE_GRAPH:
 * Producing visual representations of data.
 * 
 * This enum enhances code readability and maintainability by providing a clear
 * set of action identifiers.
 */
public enum FunctionalityActionsEnum {
	/** Action that inserts a record into the system. */
	INSERT, 
	/** Action that queries a record in the system.. */  
    READ, 
    /** Action that edits a record in the system. */
    EDIT, 
    /** Action that deletes a record in the system. */
    DELETE,
    /** Action that approves a record in the system. */
    APPROVE,
    /** Action that rejects a record in the system. */
    REJECT,
    /** Action that exports data from the system. */
    EXPORT, 
    /** Action that imports data into the system. */
    IMPORT,
    /** Action that prints a record in the system. */
    PRINT,
    /** Action that shares a record in the system. */
    SHARE, 
    /** Action that cancels a record in the system. */
    CANCEL,
    /** Action to review records or actions */
    REVIEW,
    /** Action that delegates to another user. */
    DELEGATE,
    /** Action that generates a report or record in the system. */
    GENERATE_REPORT,
    /** Action that generates a graph or chart in the system. */
    GENERATE_GRAPH;

	/**	 Private constructor to prevent instantiation. */
	private FunctionalityActionsEnum() {
	}
    
    
}
