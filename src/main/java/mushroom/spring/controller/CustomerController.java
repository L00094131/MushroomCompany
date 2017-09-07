package mushroom.spring.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import mushroom.spring.dao.CustomerDAO;
import mushroom.spring.model.Customer;

@Controller("/customerForm")
public class CustomerController {
	@Autowired
	private CustomerDAO customerDAO;

	private static final Logger logger = Logger.getLogger(CustomerController.class);

	@RequestMapping(value = "/newCustomer", method = RequestMethod.GET)
	public ModelAndView newCustomer(ModelAndView model) {
		// logs debug message
		if (logger.isDebugEnabled()) {
			logger.debug("newCustomer method executed.");
		}
		else {
		//logs exception
		logger.error("newCustomer method failed to execute.", new Exception("Method fail"));
		}
		Customer newCustomer = new Customer();
		model.addObject("customer", newCustomer);
		model.setViewName("addCustomer");
		return model;
	}

	@RequestMapping(value = "/customerForm")
	public ModelAndView listCustomer(ModelAndView model) throws IOException {
		// logs debug message
		if (logger.isDebugEnabled()) {
			logger.debug("listCustomer method executed.");
		}
		else {
		//logs exception
		logger.error("listCustomer method failed to execute.", new Exception("Method fail"));
		}		
		List<Customer> listCustomer = customerDAO.list();
		model.addObject("listCustomer", listCustomer);
		model.setViewName("customerForm");
		return model;
	}

	@RequestMapping(value = "/saveCustomer", method = RequestMethod.POST)
	public ModelAndView saveCustomer(@ModelAttribute Customer customer) {
		// logs debug message
		if (logger.isDebugEnabled()) {
			logger.debug("saveCustomer method executed.");
		}
		else {
		//logs exception
		logger.error("saveCustomer method failed to execute.", new Exception("Method fail"));
		}
		customerDAO.saveOrUpdate(customer);
		return new ModelAndView("redirect:/customerForm");
	}

	@RequestMapping(value = "/deleteCustomer", method = RequestMethod.GET)
	public ModelAndView deleteCustomer(HttpServletRequest request) {
		// logs debug message
		if (logger.isDebugEnabled()) {
			logger.debug("deleteCustomer method executed.");
		}
		else {
		//logs exception
		logger.error("deleteCustomer method failed to execute.", new Exception("Method fail"));
		}
		int customerId = Integer.parseInt(request.getParameter("id"));
		customerDAO.delete(customerId);
		return new ModelAndView("redirect:/customerForm");
	}

	@RequestMapping(value = "/editCustomer", method = RequestMethod.GET)
	public ModelAndView editCustomer(HttpServletRequest request) {
		// logs debug message
		if (logger.isDebugEnabled()) {
			logger.debug("editCustomer method executed.");
		}
		else {
		//logs exception
		logger.error("editCustomer method failed to execute.", new Exception("Method fail"));
		}	
		int customerId = Integer.parseInt(request.getParameter("id"));
		Customer customer = customerDAO.get(customerId);
		ModelAndView model = new ModelAndView("addCustomer");
		model.addObject("customer", customer);
		return model;
	}
}
