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

	public void saveOrUpdate(Order order) {
		if (order.getOrder_ID() > 0) {
			// update
			String sql = "UPDATE Orders SET Mushroom_Type=?, Jar_size=?, Quantity=?, Sell_By_Date=?, Deliver_Date=? WHERE Order_ID=?";
			jdbcTemplate.update(sql, order.getMushroom_Type(), order.getJar_size(), order.getQuantity(),
					order.getSell_By_Date(), order.getDeliver_Date()
					, order.getOrder_ID());
		} else {
			// insert
			String sql = "INSERT INTO Orders (Mushroom_Type, Jar_size, Quantity, Sell_By_Date, Deliver_Date) VALUES (?, ?, ?, ?, ?)";
			jdbcTemplate.update(sql, order.getMushroom_Type(), order.getJar_size(), order.getQuantity(),
					order.getSell_By_Date(), order.getDeliver_Date());
		}

	}

	public void delete(int Order_ID) {
		String sql = "DELETE FROM Orders WHERE Order_ID=?";
		jdbcTemplate.update(sql,Order_ID);
	}

	public List<Order> list() {
		String sql = "SELECT * FROM Orders";
		List<Order> listOrder = jdbcTemplate.query(sql, new RowMapper<Order>() {

			@Override
			public Order mapRow(ResultSet rs, int rowNum) throws SQLException {
				Order aOrder = new Order();

				aOrder.setMushroom_Type(rs.getString("Mushroom_Type"));
				aOrder.setJar_size(rs.getString("Jar_size"));
				aOrder.setQuantity(rs.getString("Quantity"));
				aOrder.setSell_By_Date(rs.getString("Sell_By_Date"));
				aOrder.setDeliver_Date(rs.getString("Deliver_Date"));
				

				return aOrder;
			}

		});

		return listOrder;
	}

	public Order get(int orderId) {
		String sql = "SELECT * FROM Orders WHERE Order_ID=" + orderId;
		return jdbcTemplate.query(sql, new ResultSetExtractor<Order>() {

			@Override
			public Order extractData(ResultSet rs) throws SQLException, DataAccessException {
				if (rs.next()) {
					 Order order = new Order();
					 order.setMushroom_Type(rs.getString("Mushroom_Type"));
					 order.setJar_size(rs.getString("Jar_size"));
					 order.setQuantity(rs.getString("Quantity"));
					 order.setSell_By_Date(rs.getString("Sell_By_Date"));
					 order.setDeliver_Date(rs.getString("Deliver_Date"));
					return order;
				}

				return null;
			}

		});
	}

}
