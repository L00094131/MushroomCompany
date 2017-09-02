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


	
	
	@RequestMapping(value="/")
	public String home(){
		return "index";
	}
		
	@RequestMapping(value="/home", method = RequestMethod.GET)
	public String index(){
		return "index";
	}
	
	@RequestMapping(value="/login", method = RequestMethod.GET)
	public String login(){
		return "login";
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
	
	@RequestMapping(value="/admin", method = RequestMethod.GET)
	public String admin(){
		return "admin";
	}
	
	@RequestMapping(value="/signup", method = RequestMethod.GET)
	public String signup(){
		return "signup";
	}
	
	

}
