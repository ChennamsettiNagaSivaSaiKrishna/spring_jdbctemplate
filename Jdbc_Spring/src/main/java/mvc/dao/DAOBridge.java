package mvc.dao;

import java.util.List;

import mvc.model.Student;

public interface DAOBridge {
	public void insertStudent(int roll,String name,float Marks,String section,String Dept);
//	public List<Student> getAllStudents();
	public List<Student> getAllStudents(boolean b);
}
