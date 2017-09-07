/**
 * 
 */
package mushroom.spring.model;

/**
 * @author Eugene
 *
 */


public class AdminSummary {
	private int customerCount;
	
	public AdminSummary() {
	}

	public int getCustomerCount() {
		return customerCount;
	}
	
	

	public AdminSummary(int customerCount) {
		this.customerCount = customerCount;
	}



	public void setCustomerCount(int customerCount) {
		this.customerCount = customerCount;
	}

	
}
