package mushroom.spring.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HTTPErrorHandler {
	
	private static final Logger logger = Logger.getLogger(HTTPErrorHandler.class);


	@RequestMapping(value = "/404")
	public String error404() {
		logger.error("404 page not found exception", new Exception("404 Not Found Exception"));
		return "404NotFound";
	}

}