package mushroom.spring.dao;

import java.util.List;

import mushroom.spring.model.AdminSummary;
import mushroom.spring.model.Customer;

public interface AdminSummaryDAO {
	
	public AdminSummary getSummary(int customerCount);
	
    public List<AdminSummary> listAdmin();

}
