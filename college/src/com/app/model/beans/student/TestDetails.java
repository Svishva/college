/**
 * 
 */
package com.app.model.beans.student;

/**
 * For each test a student takes test 
 * students details are send to database by this bean.
 * 
 * @author system18
 *
 */
public class TestDetails {
	
	
	private Long TestID;
	private Long UserID;
	private String Sub1;
	private String Sub2;
	private String Mark1;
	private String Mark2;
	private String Grade;
	
	
	
	/**
	 * Constructor with arguments for creating a object
	 * 
	 * @param testID
	 * @param userID
	 * @param sub1
	 * @param sub2
	 * @param mark1
	 * @param mark2
	 * @param grade
	 */
	public TestDetails(Long testID, Long userID, String sub1, String sub2,
			String mark1, String mark2, String grade) {
		TestID = testID;
		UserID = userID;
		Sub1 = sub1;
		Sub2 = sub2;
		Mark1 = mark1;
		Mark2 = mark2;
		Grade = generateGrade(mark1,mark2);
	}
	
	/*
	 * Calculate grade from the details stored in variables
	 * 
	 * 
	 */
	private String generateGrade(String mark1, String mark2) {
		
		String tempGrade = " ";
		
		if(mark1 != null && mark2 != null){
			
			if(mark1.length()!= 0 && mark2.length() != 0){
				
				tempGrade= String.valueOf(((Integer.parseInt(Mark1)+Integer.parseInt(Mark2))/2));

			}else {
				
				return tempGrade;
			}
		
		}
		return tempGrade;

		 
	}

	public Long getTestID() {
		return TestID;
	}
	public void setTestID(Long testID) {
		TestID = testID;
	}
	public Long getUserID() {
		return UserID;
	}
	public void setUserID(Long userID) {
		UserID = userID;
	}
	public String getSub1() {
		return Sub1;
	}
	public void setSub1(String sub1) {
		Sub1 = sub1;
	}
	public String getSub2() {
		return Sub2;
	}
	public void setSub2(String sub2) {
		Sub2 = sub2;
	}
	public String getMark1() {
		return Mark1;
	}
	public void setMark1(String mark1) {
		Mark1 = mark1;
	}
	public String getMark2() {
		return Mark2;
	}
	public void setMark2(String mark2) {
		Mark2 = mark2;
	}
	public String getGrade() {
		return Grade;
	}
	public void setGrade(String grade) {
		Grade = grade;
	}

}
