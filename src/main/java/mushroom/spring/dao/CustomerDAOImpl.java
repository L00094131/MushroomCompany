package mushroom.spring.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import mushroom.spring.model.Customer;

public class CustomerDAOImpl implements CustomerDAO {

	private JdbcTemplate jdbcTemplate;

	public CustomerDAOImpl(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public void saveOrUpdate(Customer customer) {
		if (customer.getCustomer_id() > 0) {
			// update
			String sql = "UPDATE Customer SET customer_first_name=?, customer_last_name=?, customer_email=?, customer_address=?, customer_phone_number=?, customer_password=?, customer_postcode=?,  customer_type=? WHERE customer_id=?";
			jdbcTemplate.update(sql, customer.getCustomer_first_name(), customer.getCustomer_last_name(),
					customer.getCustomer_email(), customer.getCustomer_address(), customer.getCustomer_phone_number(),
					customer.getCustomer_password(), customer.getCustomer_postcode(), customer.getCustomer_type(),
					customer.getCustomer_id());
		} else {
			// insert
			String sql = "INSERT INTO Customer (customer_first_name, customer_last_name, customer_email, customer_address, customer_phone_number, customer_password, customer_postcode, customer_type) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
			jdbcTemplate.update(sql, customer.getCustomer_first_name(), customer.getCustomer_last_name(),
					customer.getCustomer_email(), customer.getCustomer_address(), customer.getCustomer_phone_number(),
					customer.getCustomer_password(), customer.getCustomer_postcode(), customer.getCustomer_type());
		}

	}

	@Override
	public void delete(int customer_id) {
		String sql = "DELETE FROM Customer WHERE customer_id=?";
		jdbcTemplate.update(sql, customer_id);
	}

	@Override
	public List<Customer> list() {
		String sql = "SELECT * FROM Customer";
		List<Customer> listCustomer = jdbcTemplate.query(sql, new RowMapper<Customer>() {

			@Override
			public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
				Customer aCustomer = new Customer();

				aCustomer.setCustomer_id(rs.getInt("customer_id"));
				aCustomer.setCustomer_first_name(rs.getString("customer_first_name"));
				aCustomer.setCustomer_last_name(rs.getString("customer_last_name"));
				aCustomer.setCustomer_email(rs.getString("customer_email"));
				aCustomer.setCustomer_address(rs.getString("customer_address"));
				aCustomer.setCustomer_phone_number(rs.getString("customer_phone_number"));
				aCustomer.setCustomer_password(rs.getString("customer_password"));
				aCustomer.setCustomer_postcode(rs.getString("customer_postcode"));
				aCustomer.setCustomer_type(rs.getString("customer_type"));

				return aCustomer;
			}

		});

		return listCustomer;
	}

	@Override
	public Customer get(int customerId) {
		String sql = "SELECT * FROM Customer WHERE customer_id=" + customerId;
		return jdbcTemplate.query(sql, new ResultSetExtractor<Customer>() {

			@Override
			public Customer extractData(ResultSet rs) throws SQLException, DataAccessException {
				if (rs.next()) {
					Customer customer = new Customer();
					customer.setCustomer_id(rs.getInt("customer_id"));
					customer.setCustomer_first_name(rs.getString("customer_first_name"));
					customer.setCustomer_last_name(rs.getString("customer_last_name"));
					customer.setCustomer_email(rs.getString("customer_email"));
					customer.setCustomer_address(rs.getString("customer_address"));
					customer.setCustomer_phone_number(rs.getString("customer_phone_number"));
					customer.setCustomer_password(rs.getString("customer_password"));
					customer.setCustomer_postcode(rs.getString("customer_postcode"));
					customer.setCustomer_type(rs.getString("customer_type"));
					return customer;
				}

				return null;
			}

		});
	}

}
