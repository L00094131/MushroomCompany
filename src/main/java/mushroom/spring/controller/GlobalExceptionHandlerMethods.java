package mushroom.spring.controller;

import org.apache.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class GlobalExceptionHandlerMethods {

	private static final Logger logger = Logger.getLogger(GlobalExceptionHandlerMethods.class);

	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value = Exception.class)
	public String handleException(Exception e) {
		logger.error("Unknown exception occurred. " + e, new Exception("UnknownException"));

		return "defaultExceptionError";

	}

}
