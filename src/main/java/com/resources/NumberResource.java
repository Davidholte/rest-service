package com.resources;
import com.models.Number;
import com.repository.NumberRepository;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/number")
public class NumberResource {

    private NumberRepository repo = new NumberRepository();

    @GET
    @Produces(MediaType.APPLICATION_XML)
    public Number getAll() {

        return repo.addTwoNumbers();
    }
}