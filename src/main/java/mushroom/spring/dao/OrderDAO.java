package mushroom.spring.dao;

import java.util.List;

import mushroom.spring.model.Order;

public interface OrderDAO {
	
	  public void saveOrUpdate(Order order);
	     
	    public void delete(int order_Id);
	     
	    public Order get(int order_Id);
	     
	    public List<Order> list();
}
