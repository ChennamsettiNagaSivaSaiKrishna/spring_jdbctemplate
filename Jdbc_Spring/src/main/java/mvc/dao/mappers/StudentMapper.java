package mvc.dao.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import mvc.model.Student;

public class StudentMapper implements RowMapper<Student> {

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student s=new Student();
		s.setSroll(rs.getInt(1));
		s.setSname(rs.getString(2));
		s.setSmarks(rs.getFloat(3));
		s.setSsection(rs.getString(4));
		s.setSdept(rs.getString(5));
		return s;
	}

}
