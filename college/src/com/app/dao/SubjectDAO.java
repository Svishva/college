/**
 * 
 */
package com.app.dao;

import com.app.model.beans.Subject;

/**
 * This DAO has needed method to operate on 
 * Subject data on Mongo Database
 * 
 *  
 * @author system18
 *
 */
public interface SubjectDAO {

	public void createSubject(Subject subject);
	public void updateSubject(Subject subject);
	public void deleteSubject(Subject subject);

	

}
