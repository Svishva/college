/**
 * 
 */
package com.app.dao.implementation.mongodb;

import com.app.dao.InternalTestDAO;
import com.app.model.beans.student.TestDetails;

/**
 *  DAO implementation for InternalTestDAO
 *  Target Database : Mongo DB
 *  
 *  will get data from TestDetails object passed as parameter and store as
 *  
 *  {
 *    TestID:
 *    UserID:
 *    SubjectID1 : MarkID1
 *    SubjectID2 : MarkID2
 *    Grade: 
 *  
 *  
 *  }
 * 
 * @author system18
 *
 */
public class InternalTestDAOImpMongoDB implements InternalTestDAO {

	/* 
	 * @see com.app.dao.InternalTestDAO
	 * #insertInternalTest(com.app.model.beans.student.TestDetails)
	 */
	@Override
	public void insertInternalTest(TestDetails testdetails) {
		// TODO Auto-generated method stub

	}

	/* 
	 * @see com.app.dao.InternalTestDAO
	 * #updateInternalTest(com.app.model.beans.student.TestDetails)
	 */
	@Override
	public void updateInternalTest(TestDetails testdetails) {
		// TODO Auto-generated method stub

	}

	/* 
	 * @see com.app.dao.InternalTestDAO
	 * #deleteInternalTest(com.app.model.beans.student.TestDetails)
	 */
	@Override
	public void deleteInternalTest(TestDetails testdetails) {

	}

}
