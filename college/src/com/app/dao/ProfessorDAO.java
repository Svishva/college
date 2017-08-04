/**
 * 
 */
package com.app.dao;


/**
 * This is DAO interface has  
 * Create, updae, delete operations 
 * on Professor data.
 * 
 * 
 * @author system18
 *
 */
public interface ProfessorDAO {

	
	public void updateProfessor(ProfessorDAO student);

	public void deleteProfessor(ProfessorDAO student);

	public void createProfessor(ProfessorDAO student);
}
