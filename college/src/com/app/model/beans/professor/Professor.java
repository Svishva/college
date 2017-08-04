/**
 * 
 */
package com.app.model.beans.professor;

/**
 * @author system18
 *
 */
public class Professor implements java.io.Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5670199975247720022L;
	private Long ProfessorID;
	private String ProfessorName;
	private String ProfessorDepartment;
	
	public Professor(){
		
		
	}
	
	
	public Long getProfessorID() {
		return ProfessorID;
	}
	public void setProfessorID(Long professorID) {
		ProfessorID = professorID;
	}
	public String getProfessorName() {
		return ProfessorName;
	}
	public void setProfessorName(String professorName) {
		ProfessorName = professorName;
	}
	public String getProfessorDepartment() {
		return ProfessorDepartment;
	}
	public void setProfessorDepartment(String professorDepartment) {
		ProfessorDepartment = professorDepartment;
	}
	
}
