package mushroom.spring.dao;

import java.util.List;

import mushroom.spring.model.Order;

public interface OrderDAO {
	
    public void saveOrUpdateOrder(Order order);
    
    public void deleteOrder(int order_id);
     
    public Order getOrder(int order_id);
     
    public List<Order> listOrder();
}
