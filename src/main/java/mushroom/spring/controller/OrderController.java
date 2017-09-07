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

import mushroom.spring.dao.OrderDAO;
import mushroom.spring.model.Order;

@Controller("/orderForm")
public class OrderController {
	@Autowired
	private OrderDAO orderDAO;

	@RequestMapping(value = "/addOrder", method = RequestMethod.GET)
	public ModelAndView newOrder(ModelAndView model) {
		Order newOrder = new Order();
		model.addObject("order", newOrder);
		model.setViewName("addOrder");
		return model;
	}
	
	

	@RequestMapping(value = "/orderForm")
	public ModelAndView listOrder(ModelAndView model) throws IOException {
		List<Order> listOrder = orderDAO.list();
		model.addObject("listOrder", listOrder);
		model.setViewName("orderForm");
		return model;
	}

	@RequestMapping(value = "/saveOrder", method = RequestMethod.POST)
	public ModelAndView saveOrder(@ModelAttribute Order order) {
		orderDAO.saveOrUpdate(order);
		return new ModelAndView("redirect:/orderForm");
	}

	@RequestMapping(value = "/deleteOrder", method = RequestMethod.GET)
	public ModelAndView deleteOrder(HttpServletRequest request) {
		int orderId = Integer.parseInt(request.getParameter("id"));
		orderDAO.delete(orderId);
		return new ModelAndView("redirect:/orderForm");
	}

	@RequestMapping(value = "/editOrder", method = RequestMethod.GET)
	public ModelAndView editOrder(HttpServletRequest request) {
		int orderId = Integer.parseInt(request.getParameter("id"));
		Order order = orderDAO.get(orderId);
		ModelAndView model = new ModelAndView("addOrder");
		model.addObject("order", order);
		return model;
	}
}
