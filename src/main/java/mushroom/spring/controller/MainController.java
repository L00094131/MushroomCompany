package mushroom.spring.controller;


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

	@RequestMapping(value = "/about", method = RequestMethod.GET)
	public String about() {
	    return "about";
	}
	
	@RequestMapping(value="/products", method = RequestMethod.GET)
	public String products(){
		return "products";
	}
	

	
	@RequestMapping(value="/admin", method = RequestMethod.GET)
	public String admin(){
		return "admin";
	}
	
	
	@RequestMapping(value = "/signup", method = RequestMethod.GET)
	public ModelAndView signup(ModelAndView model) {
		Customer newCustomer = new Customer();
		model.addObject("customer", newCustomer);
		model.setViewName("signup");
		return model;
	}
	
	@RequestMapping(value = "/signupConfirmation", method = RequestMethod.POST)
	public String signupConfirmation(@ModelAttribute Customer customer) {
		customerDAO.saveOrUpdate(customer);
		return "signupConfirmation";
	}
	

}
