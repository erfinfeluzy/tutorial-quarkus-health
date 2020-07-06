package com.erfinfeluzy;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
@Produces(MediaType.TEXT_PLAIN)
@Consumes(MediaType.TEXT_PLAIN)
public class RestController {
    
    @GET
    public String index() {
        return "hello world index";
    }

    @GET
    @Path("/person")
    @Produces(MediaType.APPLICATION_JSON)
    public Person getPerson(){
        return new Person("Erfin Feluzy", "1234");
    }
    @GET
    @Path("/hello")
    @Produces(MediaType.TEXT_PLAIN)
    public String hello(){
        return "hello world";
    }
}