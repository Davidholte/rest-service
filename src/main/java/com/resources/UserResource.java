package com.resources;

import com.models.User;
import com.repository.IUserRepository;
import com.repository.UserRepository;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by Dave on 11/03/19.
 */
@Path("/user")
public class UserResource {

    private IUserRepository repo = new UserRepository();

    @GET
    @Produces(MediaType.APPLICATION_XML)
    public List<User> getAll() {

        return repo.getAllUsers();
    }
}
