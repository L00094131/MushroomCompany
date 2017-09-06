package mushroom.spring.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import mushroom.spring.model.Contact;

public class ContactDAOImpl implements ContactDAO {
	private JdbcTemplate jdbcTemplate;

	public ContactDAOImpl(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public void saveContact(Contact contact) {
		if (contact.getContact_id() > 0) {
			// update
			String sql = "UPDATE Contact SET contact_name=?, contact_email=?, contact_telephone=?, contact_message=? WHERE contact_id=?";
			jdbcTemplate.update(sql, contact.getContact_name(), contact.getContact_email(), contact.getContact_telephone(), contact.getContact_message(),
					contact.getContact_id());
		} else {
			// insert
			String sql = "INSERT INTO Contact (contact_name, contact_email, contact_telephone, contact_message) VALUES (?, ?, ?, ?)";
			jdbcTemplate.update(sql, contact.getContact_name(), contact.getContact_email(), contact.getContact_telephone(), contact.getContact_message());
		}

	}

	public void deleteContact(int contact_id) {
		String sql = "DELETE FROM Contact WHERE contact_id=?";
		jdbcTemplate.update(sql, contact_id);
	}

	public List<Contact> listContact() {
		String sql = "SELECT * FROM Contact";
		List<Contact> listContact = jdbcTemplate.query(sql, new RowMapper<Contact>() {

			@Override
			public Contact mapRow(ResultSet rs, int rowNum) throws SQLException {
				Contact myContact = new Contact();

				myContact.setContact_id(rs.getInt("contact_id"));
				myContact.setContact_name(rs.getString("contact_name"));
				myContact.setContact_email(rs.getString("contact_email"));
				myContact.setContact_telephone(rs.getString("contact_telephone"));
				myContact.setContact_message(rs.getString("contact_message"));

				return myContact;
			}

		});

		return listContact;
	}

	public Contact getContact(int contactId) {
		String sql = "SELECT * FROM Contact WHERE contact_id=" + contactId;
		return jdbcTemplate.query(sql, new ResultSetExtractor<Contact>() {

			@Override
			public Contact extractData(ResultSet rs) throws SQLException, DataAccessException {
				if (rs.next()) {
					Contact myContact = new Contact();
					myContact.setContact_id(rs.getInt("contact_id"));
					myContact.setContact_name(rs.getString("contact_name"));
					myContact.setContact_email(rs.getString("contact_email"));
					myContact.setContact_telephone(rs.getString("contact_telephone"));
					myContact.setContact_message(rs.getString("contact_message"));
					return myContact;
				}

				return null;
			}

		});
	}
}
