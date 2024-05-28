package mvc.dao;

import org.springframework.stereotype.Repository;

@Repository
public class DAOImpl implements DAOBridge {
	private JdbcTemplate jdbctemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbctemplate)
	{
		this.jdbctemplate=jdbctemplate;
	}

	@Override
	public void insertStudent(int roll, String name, float Marks, String section, String Dept) {
		// TODO Auto-generated method stub
		
	}
}
