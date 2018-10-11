package com.capgemini.car_project;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CarService {
	private final Logger log=LoggerFactory.getLogger(CarService.class);
	public void process(String inputString) {
		
		log.debug("processing car:"+inputString);
		log.info("processing car:"+inputString);
		log.warn("processing car:"+inputString);
		log.error("processing car:"+inputString);
		
		
	}

}
