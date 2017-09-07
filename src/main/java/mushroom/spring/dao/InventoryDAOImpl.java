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
	public void saveOrUpdate_Inv(Inventory inventory) {
		if (inventory.getInventory_ID() > 0) {
			// update
			String sql = "UPDATE Inventory SET Vendor_ID=?, Cost=?, Quantity=?, Jar-size=?, Sell_By_Date=?, Mushroom_Type=? WHERE Inventory_ID=?";
			jdbcTemplate.update(sql, inventory.getVendor_ID(), inventory.getCost(),
					inventory.getQuantity(), inventory.getJar_size(), inventory.getSell_By_Date(),
					inventory.getMushroom_Type(), inventory.getInventory_ID());
		} else {
			// insert
			String sql = "INSERT INTO Inventory (Vendor_ID, Cost, Quantity, Jar_size, Sell_By_Date, Mushroom_Type) VALUES (?, ?, ?, ?, ?, ?)";
			jdbcTemplate.update(sql, inventory.getVendor_ID(), inventory.getCost(),
					inventory.getQuantity(), inventory.getJar_size(), inventory.getSell_By_Date(),
					inventory.getMushroom_Type());
		}

	}

	@Override
	public void delete_Inv(int Inventory_ID) {
		String sql = "DELETE FROM Inventory WHERE Inventory_ID=?";
		jdbcTemplate.update(sql, Inventory_ID);
	}

	@Override
	public List<Inventory> list_Inv() {
		String sql = "SELECT * FROM Inventory";
		List<Inventory> listInventory = jdbcTemplate.query(sql, new RowMapper<Inventory>() {

			@Override
			public Inventory mapRow(ResultSet rs, int rowNum) throws SQLException {
				Inventory aInventory = new Inventory();

				aInventory.setInventory_ID(rs.getInt("Inventory_ID"));
				aInventory.setVendor_ID(rs.getInt("Vendor_ID"));
				aInventory.setCost(rs.getInt("Cost"));
				aInventory.setQuantity(rs.getInt("Quantity"));
				aInventory.setJar_size(rs.getString("Jar_size"));
				aInventory.setSell_By_Date(rs.getString("Sell_By_Date"));
				aInventory.setMushroom_Type(rs.getString("Mushroom_Type"));

				return aInventory;
			}

		});

		return listInventory;
	}

	@Override
	public Inventory get_Inv(int Inventory_ID) {
		String sql = "SELECT * FROM Inventory WHERE Inventory_ID=" + Inventory_ID;
		return jdbcTemplate.query(sql, new ResultSetExtractor<Inventory>() {

			@Override
			public Inventory extractData(ResultSet rs) throws SQLException, DataAccessException {
				if (rs.next()) {
					Inventory inventory = new Inventory();
					inventory.setInventory_ID(rs.getInt("Inventory_ID"));
					inventory.setVendor_ID(rs.getInt("Vendor_ID"));
					inventory.setCost(rs.getInt("Cost"));
					inventory.setQuantity(rs.getInt("Quantity"));
					inventory.setJar_size(rs.getString("Jar_size"));
					inventory.setSell_By_Date(rs.getString("Sell_By_Date"));
					inventory.setMushroom_Type(rs.getString("Mushroom_Type"));
					return inventory;
				}

				return null;
			}

		});
	}
}
