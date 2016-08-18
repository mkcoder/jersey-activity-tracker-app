package com.mkcoder.mycodingblog.jersey.excerise.app.resources;

import com.mkcoder.mycodingblog.jersey.excerise.app.model.Activity;
import com.mkcoder.mycodingblog.jersey.excerise.app.repository.ActivityRespository;
import com.mkcoder.mycodingblog.jersey.excerise.app.repository.ActivityRespositoryStub;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * our rest service for the {@link Activity}
 */
@Path("activity")
public class ActivityResources {

    private ActivityRespository respository = new ActivityRespositoryStub();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Activity> index() {
        return respository.getAllActivities();
    }

}
