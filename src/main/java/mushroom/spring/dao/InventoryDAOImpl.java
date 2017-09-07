package mushroom.spring.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import mushroom.spring.model.Inventory;

public class InventoryDAOImpl implements InventoryDAO {
	private JdbcTemplate jdbcTemplate;

	public InventoryDAOImpl(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public void saveOrUpdateInventory(Inventory inventory) {
		if (inventory.getInventory_id() > 0) {
			// update
			String sql = "UPDATE Inventory1 SET vendor=?, cost=?, quantity=?, jar_size=?, sell_by_date=?, mushroom_type=? WHERE inventory_id=?";
			jdbcTemplate.update(sql, inventory.getVendor(), inventory.getCost(), inventory.getQuantity(),
					inventory.getJar_size(), inventory.getSell_by_date(), inventory.getMushroom_type(),
					inventory.getInventory_id());
		} else {
			// insert
			String sql = "INSERT INTO Inventory1 (vendor, cost, quantity, jar_size, sell_by_date, mushroom_type) VALUES (?, ?, ?, ?, ?, ?)";
			jdbcTemplate.update(sql, inventory.getVendor(), inventory.getCost(), inventory.getQuantity(),
					inventory.getJar_size(), inventory.getSell_by_date(), inventory.getMushroom_type());
		}

	}

	@Override
	public void deleteInventory(int inventory_id) {
		String sql = "DELETE FROM Inventory1 WHERE inventory_id=?";
		jdbcTemplate.update(sql, inventory_id);
	}

	@Override
	public List<Inventory> listInventory() {
		String sql = "SELECT * FROM Inventory1";
		List<Inventory> listInventory = jdbcTemplate.query(sql, new RowMapper<Inventory>() {

			@Override
			public Inventory mapRow(ResultSet rs, int rowNum) throws SQLException {
				Inventory aInventory = new Inventory();

				aInventory.setInventory_id(rs.getInt("inventory_id"));
				aInventory.setVendor(rs.getString("vendor"));
				aInventory.setCost(rs.getString("cost"));
				aInventory.setQuantity(rs.getString("quantity"));
				aInventory.setJar_size(rs.getString("jar_size"));
				aInventory.setSell_by_date(rs.getString("sell_by_date"));
				aInventory.setMushroom_type(rs.getString("mushroom_type"));

				return aInventory;
			}

		});

		return listInventory;
	}

	@Override
	public Inventory getInventory(int inventoryId) {
		String sql = "SELECT * FROM Inventory1 WHERE inventory_id=" + inventoryId;
		return jdbcTemplate.query(sql, new ResultSetExtractor<Inventory>() {

			@Override
			public Inventory extractData(ResultSet rs) throws SQLException, DataAccessException {
				if (rs.next()) {
					Inventory inventory = new Inventory();
					inventory.setInventory_id(rs.getInt("inventory_id"));
					inventory.setVendor(rs.getString("vendor"));
					inventory.setCost(rs.getString("cost"));
					inventory.setQuantity(rs.getString("quantity"));
					inventory.setJar_size(rs.getString("jar_size"));
					inventory.setSell_by_date(rs.getString("sell_by_date"));
					inventory.setMushroom_type(rs.getString("mushroom_type"));
					return inventory;
				}

				return null;
			}

		});
	}

}
