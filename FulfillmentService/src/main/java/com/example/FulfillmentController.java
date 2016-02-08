package com.example;

import java.util.logging.Logger;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order/fulfill")
public class FulfillmentController {

	private final static Logger LOGGER = Logger.getLogger(FulfillmentController.class.getName());
	 private final static String CLASSNAME="FulfillmentController";
	 @RequestMapping(method=RequestMethod.POST)
    public void fulfill() {
		 String methodName="fulfill";
	    	LOGGER.entering(CLASSNAME, methodName);
	    	LOGGER.exiting(CLASSNAME, methodName);
    //	return null;
        
    }
}
