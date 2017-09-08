package mushroom.spring.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import mushroom.spring.model.Order;

public class OrderDAOImpl implements OrderDAO {

	private JdbcTemplate jdbcTemplate;

	public OrderDAOImpl(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public void saveOrUpdateOrder(Order order) {
		if (order.getOrder_id() > 0) {
			// update
			String sql = "UPDATE Orders SET mushroom_type=?, jar_size=?, quantity=?, name=?, address=? WHERE order_id=?";
			jdbcTemplate.update(sql, order.getMushroom_type(), order.getJar_size(), order.getQuantity(),
					order.getName(), order.getAddress(), order.getOrder_id());
		} else {
			// insert
			String sql = "INSERT INTO Orders (mushroom_type, jar_size, quantity, name, address) VALUES (?, ?, ?, ?, ?)";
			jdbcTemplate.update(sql, order.getMushroom_type(), order.getJar_size(), order.getQuantity(),
					order.getName(), order.getAddress());
		}
	}

	@Override
	public void deleteOrder(int order_id) {
		String sql = "DELETE FROM Orders WHERE order_id=?";
		jdbcTemplate.update(sql, order_id);
	}

	@Override
	public Order getOrder(int order_id) {
		String sql = "SELECT * FROM Orders WHERE order_id=" + order_id;
		return jdbcTemplate.query(sql, new ResultSetExtractor<Order>() {

			@Override
			public Order extractData(ResultSet rs) throws SQLException, DataAccessException {
				if (rs.next()) {
					Order order = new Order();
					order.setOrder_id(rs.getInt("order_id"));
					order.setQuantity(rs.getString("quantity"));
					order.setJar_size(rs.getString("jar_size"));
					order.setMushroom_type(rs.getString("mushroom_type"));
					order.setName(rs.getString("name"));
					order.setAddress(rs.getString("address"));
					return order;
				}

				return null;
			}

		});
	}

	@Override
	public List<Order> listOrder() {
		String sql = "SELECT * FROM Orders";
		List<Order> listOrder = jdbcTemplate.query(sql, new RowMapper<Order>() {

			@Override
			public Order mapRow(ResultSet rs, int rowNum) throws SQLException {
				Order aOrder = new Order();

				aOrder.setOrder_id(rs.getInt("order_id"));
				aOrder.setQuantity(rs.getString("quantity"));
				aOrder.setJar_size(rs.getString("jar_size"));
				aOrder.setMushroom_type(rs.getString("mushroom_type"));
				aOrder.setName(rs.getString("name"));
				aOrder.setAddress(rs.getString("address"));

				return aOrder;
			}

		});

		return listOrder;
	}

}
