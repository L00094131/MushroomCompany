package mushroom.spring.dao;

import java.util.List;

import mushroom.spring.model.Inventory;

public interface InventoryDAO {
    public void saveOrUpdateInventory(Inventory inventory);
    
    public void deleteInventory(int inventory_id);
     
    public Inventory getInventory(int inventory_id);
     
    public List<Inventory> listInventory();
}
