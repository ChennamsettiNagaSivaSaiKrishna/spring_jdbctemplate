package mvc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import mvc.dao.mappers.StudentMapper;
import mvc.model.Student;

@Repository
public class DAOImpl implements DAOBridge {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    
    public void insertStudent(int roll, String name, float marks, String section, String dept) {
        String sql = "INSERT INTO Students118 (roll, sname, marks, ssection, department) VALUES (?, ?, ?, ?, ?)";
        jdbcTemplate.update(sql, roll, name, marks, section, dept);
    }
    
//    public List<Student> getAllStudents()
//    {
//    	String sql="SELECT * from Students118";
//		return jdbcTemplate.query(sql,new StudentMapper()); 	
//    }


    public List<Student> getAllStudUsingOrm()
    {
    	return null;
    }
    
    public List<Student> getAllStudUsingJdbc()
    {
    	String sql="SELECT * from Students118";
		return jdbcTemplate.query(sql,new StudentMapper()); 
    }    
	@Override
	public List<Student> getAllStudents(boolean b) {
		if(b)
		{
			return getAllStudUsingOrm();
		}
		return getAllStudUsingJdbc();
	}
    
}
