package mushroom.spring.dao;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;


import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.RowMapper;

import mushroom.spring.model.AdminSummary;
import mushroom.spring.model.Customer;

public class AdminSummaryDAOImpl implements AdminSummaryDAO {
	
	private JdbcTemplate jdbcTemplate;
	private Statement stmt = null;

	
	public AdminSummaryDAOImpl(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	

	@Override
	public AdminSummary getSummary(int customerCount) {
		return null;
	}
	
	@Override
	public List<AdminSummary> listAdmin() {
		String sql = "Select count(customer_id) FROM Customer;";
		List<AdminSummary> listAdmin = jdbcTemplate.query(sql, new RowMapper<AdminSummary>() {
			
			@Override
			public AdminSummary mapRow(ResultSet rs, int rowNum) throws SQLException {
				AdminSummary admin = new AdminSummary();
				
				admin.setCustomerCount(rs.getInt("customer_count"));

				return admin;
			}
		});
		
		return listAdmin;
	
	}


	


	
}
