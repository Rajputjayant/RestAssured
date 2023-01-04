/**
 * 
 */
package genericUtility;

/**
 * @author DELL
 *
 */
public interface IPathConstant {
   
	String dbURL="jdbc:mysql://localhost:3306/projects";
	String dbUserName="root";
	String dbPassword="root";
	String createProject="/addProject";
	String getProject="/projects";
	String getSingleProject="/projects/";
	String updateProject="/projects";
	String deleteProject="/projects";
	String ExcelPath=".\\src\\test\\resources\\pqr.xlsx";
}
