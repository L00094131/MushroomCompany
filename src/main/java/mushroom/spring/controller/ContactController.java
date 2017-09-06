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

import mushroom.spring.model.Contact;
import mushroom.spring.model.Customer;
import mushroom.spring.dao.ContactDAO;


@Controller("/contact")
public class ContactController {
	
	@Autowired
	private ContactDAO contactDAO;
	
	@RequestMapping(value="/contact", method = RequestMethod.GET)
	public ModelAndView contact(ModelAndView model){
		Contact contact = new Contact();
		model.addObject("contact", contact);
		model.setViewName("contact");
		return model;
	}
	
	@RequestMapping(value = "/contactForm")
	public ModelAndView listContact(ModelAndView model) throws IOException {
		List<Contact> listContact = contactDAO.listContact();
		model.addObject("listContact", listContact);
		model.setViewName("contactForm");
		return model;
	}

	
	@RequestMapping(value = "/deleteContact", method = RequestMethod.GET)
	public ModelAndView deleteContact(HttpServletRequest request) {
		int contactId = Integer.parseInt(request.getParameter("id"));
		contactDAO.deleteContact(contactId);
		return new ModelAndView("redirect:/contactForm");
	}
	
	@RequestMapping(value = "/contactConfirmation", method = RequestMethod.POST)
	public String contactConfirmation(@ModelAttribute Contact contact) {
		contactDAO.saveContact(contact);
		return "contactConfirmation";
	}
}
