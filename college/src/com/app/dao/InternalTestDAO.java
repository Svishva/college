/**
 * 
 */
package com.app.dao;

import com.app.model.beans.student.TestDetails;

/**
 * @author system18
 *
 */
public interface InternalTestDAO {
	
	
	public void insertInternalTest(TestDetails testdetails);
	public void updateInternalTest(TestDetails testdetails);
	public void deleteInternalTest(TestDetails testdetails);



}
