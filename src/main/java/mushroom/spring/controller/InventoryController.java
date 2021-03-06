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

import mushroom.spring.dao.InventoryDAO;
import mushroom.spring.model.Inventory;

@Controller("/inventoryForm")
public class InventoryController {
	@Autowired
	private InventoryDAO inventoryDAO;

	@RequestMapping(value = "/newInventory", method = RequestMethod.GET)
	public ModelAndView newInventory(ModelAndView model) {
		Inventory newInventory = new Inventory();
		model.addObject("inventory", newInventory);
		model.setViewName("addInventory");
		return model;
	}

	@RequestMapping(value = "/inventoryForm")
	public ModelAndView listInventory(ModelAndView model) throws IOException {
		List<Inventory> listInventory = inventoryDAO.listInventory();
		model.addObject("listInventory", listInventory);
		model.setViewName("inventoryForm");
		return model;
	}

	@RequestMapping(value = "/saveInventory", method = RequestMethod.POST)
	public ModelAndView saveInventory(@ModelAttribute Inventory inventory) {
		inventoryDAO.saveOrUpdateInventory(inventory);
		return new ModelAndView("redirect:/inventoryForm");
	}

	@RequestMapping(value = "/deleteInventory", method = RequestMethod.GET)
	public ModelAndView deleteInventory(HttpServletRequest request) {
		int inventoryId = Integer.parseInt(request.getParameter("id"));
		inventoryDAO.deleteInventory(inventoryId);
		return new ModelAndView("redirect:/inventoryForm");
	}

	@RequestMapping(value = "/editInventory", method = RequestMethod.GET)
	public ModelAndView editInventory(HttpServletRequest request) {
		int inventoryId = Integer.parseInt(request.getParameter("id"));
		Inventory inventory = inventoryDAO.getInventory(inventoryId);
		ModelAndView model = new ModelAndView("addInventory");
		model.addObject("inventory", inventory);
		return model;
	}

}
