package mushroom.spring.dao;

import java.util.List;

import mushroom.spring.model.Inventory;

public interface InventoryDAO {

    public void saveOrUpdate_Inv(Inventory Inventory);
    
    public void delete_Inv(int Inventory_ID);
     
    public Inventory get_Inv(int Inventory_ID);
     
    public List<Inventory> list_Inv();
}
