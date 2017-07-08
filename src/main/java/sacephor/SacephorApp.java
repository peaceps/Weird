package main.java.sacephor;

import org.glassfish.jersey.server.ResourceConfig;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;


public class SacephorApp extends ResourceConfig {

	public SacephorApp() {
		packages("main.java.sacephor.resources");
		register(JacksonJsonProvider.class);
	}

}
