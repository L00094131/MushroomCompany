package mushroom.spring.dao;

import java.util.List;

import mushroom.spring.model.Customer;

public interface CustomerDAO {
    
    public void saveOrUpdate(Customer customer);
     
    public void delete(int customer_Id);
     
    public Customer get(int customer_Id);
     
    public List<Customer> list();
}
