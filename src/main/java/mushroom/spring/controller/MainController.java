package mushroom.spring.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.apache.log4j.Logger;


import mushroom.spring.dao.CustomerDAO;
import mushroom.spring.model.Customer;

@Controller
public class MainController {
	
	@Autowired
	private CustomerDAO customerDAO;
	
	private static final Logger logger = Logger.getLogger(MainController.class);


	@RequestMapping(value="/")
	public String home(){
		// logs debug message
		if (logger.isDebugEnabled()) {
			logger.debug("home method executed.");
		}
		else {
		//logs exception
		logger.error("home method failed to execute.", new Exception("Method fail"));
		}
		return "index";
	}
		
	@RequestMapping(value="/home", method = RequestMethod.GET)
	public String index(){
		// logs debug message
		if (logger.isDebugEnabled()) {
			logger.debug("index method executed.");
		}
		else {
		//logs exception
		logger.error("index method failed to execute.", new Exception("Method fail"));
		}
		return "index";
	}

	@RequestMapping(value = "/about", method = RequestMethod.GET)
	public String about() {
		// logs debug message
		if (logger.isDebugEnabled()) {
			logger.debug("about method executed.");
		}
		else {
		//logs exception
		logger.error("about method failed to execute.", new Exception("Method fail"));
		}
	    return "about";
	}
	
	@RequestMapping(value="/products", method = RequestMethod.GET)
	public String products(){
		// logs debug message
		if (logger.isDebugEnabled()) {
			logger.debug("products method executed.");
		}
		else {
		//logs exception
		logger.error("products method failed to execute.", new Exception("Method fail"));
		}
		return "products";
	}
	

	
	@RequestMapping(value="/admin", method = RequestMethod.GET)
	public String admin(){
		// logs debug message
		if (logger.isDebugEnabled()) {
			logger.debug("admin method executed.");
		}
		else {
		//logs exception
		logger.error("admin method failed to execute.", new Exception("Method fail"));
		}
		return "admin";
	}
	
	@RequestMapping(value="/customer", method = RequestMethod.GET)
	public String customer(){
		// logs debug message
		if (logger.isDebugEnabled()) {
			logger.debug("admin method executed.");
		}
		else {
		//logs exception
		logger.error("admin method failed to execute.", new Exception("Method fail"));
		}
		return "customer";
	}	
	
	
	@RequestMapping(value = "/signup", method = RequestMethod.GET)
	public ModelAndView signup(ModelAndView model) {
		// logs debug message
		if (logger.isDebugEnabled()) {
			logger.debug("signup method executed.");
		}
		else {
		//logs exception
		logger.error("signup method failed to execute.", new Exception("Method fail"));
		}
		Customer newCustomer = new Customer();
		model.addObject("customer", newCustomer);
		model.setViewName("signup");
		return model;
	}
	
	@RequestMapping(value = "/signupConfirmation", method = RequestMethod.POST)
	public String signupConfirmation(@ModelAttribute Customer customer) {
		// logs debug message
		if (logger.isDebugEnabled()) {
			logger.debug("signupConfirmation method executed.");
		}
		else {
		//logs exception
		logger.error("signupConfirmation method failed to execute.", new Exception("Method fail"));
		}
		customerDAO.saveOrUpdate(customer);
		return "signupConfirmation";
	}
}
