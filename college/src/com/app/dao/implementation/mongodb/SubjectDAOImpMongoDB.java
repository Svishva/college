/**
 * 
 */
package com.app.dao.implementation.mongodb;

import com.app.dao.SubjectDAO;
import com.app.model.beans.Subject;

/**
 * This class implements SubjectDAO interface and 
 * provide all functions that alter 
 * on Subject datas on  Mongo db
 * 
 * Target Database : Mongo DB
 * 
 * @author system18
 *
 */
public class SubjectDAOImpMongoDB implements SubjectDAO {

	
	
	/* (non-Javadoc)
	 * @see com.app.dao.SubjectDAO
	 * #createSubject(com.app.model.beans.Subject)
	 * 
	 * Create a new Subject in the 
	 * Mongo Database name  : College
	 * Mongo Collection name: Subject
	 */
	@Override
	public void createSubject(Subject subject) {

	}

	
	
	
	/* (non-Javadoc)
	 * @see com.app.dao.SubjectDAO#updateSubject(com.app.model.beans.Subject)
	 */
	@Override
	public void updateSubject(Subject subject) {

	}

	
	
	
	/* (non-Javadoc)
	 * @see com.app.dao.SubjectDAO#deleteSubject(com.app.model.beans.Subject)
	 */
	@Override
	public void deleteSubject(Subject subject) {

	}

}
