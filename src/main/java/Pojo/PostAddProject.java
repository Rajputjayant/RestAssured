package Pojo;

public class PostAddProject {
   
	// Declare the variable 
	String createdBy;
	String projectName;
	String status;
	String teamSize;
	
	//Create Constructor For Pojo class to intialization
	public PostAddProject(String createdBy, String projectName, String status, String teamSize) {
		//super();
		this.createdBy = createdBy;
		this.projectName = projectName;
		this.status = status;
		this.teamSize = teamSize;
	}
	public PostAddProject()
	{
		
	}
	
	//Provide Getter and Setter Method 
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getTeamSize() {
		return teamSize;
	}
	public void setTeamSize(String teamSize) {
		this.teamSize = teamSize;
	}
	
	
}
