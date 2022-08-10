package com.butler.playgroundTesting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//      Create a new SpringBoot project that you can easily experiment in without worry of messing up progress for another assignment. Your coding challenge is as follows.
//		Create a new SpringBoot project using start.spring.io. (Same format we used for the JsonPlaceholder and Nasa APIs)
//		Confirm you can successfully start you server before writing any code
//		Update your server to use port 4444 (or any other port between 4000-4999
//		Create a controller class which uses the path ‘/api’
//		Add a new route handler (java method) to implement each of the CRUD HTTP methods which use the path /data
//		Once complete you should be able to make a request to (http://localhost:4444/api/data) using all of the major HTTP methods
//		After that, try to implement PathVariables and RequestParams into you route-handlers (controller methods)

@SpringBootApplication
public class PlaygroundTestingApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlaygroundTestingApplication.class, args);
	}

}
