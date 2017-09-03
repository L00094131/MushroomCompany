package mushroom.spring.controller;

import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductsController {

	@RequestMapping(value = "/productForm")
	public ModelAndView listCustomer(ModelAndView model) throws IOException {
		model.setViewName("productForm");
		return model;
	}

}
