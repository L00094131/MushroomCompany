package mushroom.spring.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import mushroom.spring.dao.CustomerDAO;
import mushroom.spring.model.Customer;

@Controller
public class MainController {

	@Autowired
	private CustomerDAO customerDAO;
	
	
	@RequestMapping(value="/")
	public String home(){
		return "index";
	}
	
	
	@RequestMapping(value="/home", method = RequestMethod.GET)
	public String index(){
		return "index";
	}
	
	@RequestMapping(value = "/newCustomer", method = RequestMethod.GET)
	public ModelAndView newCustomer(ModelAndView model) {
		Customer newCustomer = new Customer();
		model.addObject("customer", newCustomer);
		model.setViewName("addCustomer");
		return model;
	}
	
	@RequestMapping(value = "/about", method = RequestMethod.GET)
	public String about() {
	    return "about";
	}
	
	@RequestMapping(value="/products", method = RequestMethod.GET)
	public String products(){
		return "products";
	}
	
	@RequestMapping(value="/contact", method = RequestMethod.GET)
	public String contact(){
		return "contact";
	}
	
	@RequestMapping(value="/login", method = RequestMethod.GET)
	public String login(){
		return "login";
	}
	
	@RequestMapping(value = "/customerForm")
	public ModelAndView listCustomer(ModelAndView model) throws IOException{
		List<Customer> listCustomer = customerDAO.list();
		model.addObject("listCustomer", listCustomer);
		model.setViewName("customerForm");
		
		return model;
	}
	
	@RequestMapping(value = "/saveCustomer", method = RequestMethod.POST)
	public ModelAndView saveCustomer(@ModelAttribute Customer customer) {
		customerDAO.saveOrUpdate(customer);		
		return new ModelAndView("redirect:/customerForm");
	}
	
	@RequestMapping(value = "/deleteCustomer", method = RequestMethod.GET)
	public ModelAndView deleteCustomer(HttpServletRequest request) {
		int customerId = Integer.parseInt(request.getParameter("id"));
		customerDAO.delete(customerId);
		return new ModelAndView("redirect:/customerForm");
	}
	
	@RequestMapping(value = "/editCustomer", method = RequestMethod.GET)
	public ModelAndView editCustomer(HttpServletRequest request) {
		int customerId = Integer.parseInt(request.getParameter("id"));
		Customer customer = customerDAO.get(customerId);
		ModelAndView model = new ModelAndView("addCustomer");
		model.addObject("customer", customer);
		
		return model;
	}
}
