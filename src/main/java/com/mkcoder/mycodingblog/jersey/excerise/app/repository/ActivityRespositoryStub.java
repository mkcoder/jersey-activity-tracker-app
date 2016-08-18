package com.mkcoder.mycodingblog.jersey.excerise.app.repository;

import com.mkcoder.mycodingblog.jersey.excerise.app.model.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * a mock serveries that will mimic a real database connection
 */
public class ActivityRespositoryStub implements ActivityRespository {

    private List<Activity> activities;


    public ActivityRespositoryStub() {
        activities = new ArrayList<>();
        buildUpActivities();
    }

    private void buildUpActivities() {
        activities.add(new Activity("Biking", 40L));
        activities.add(new Activity("Weight lifting", 50L));
        activities.add(new Activity("Running", 30L));
    }

    @Override
    public List<Activity> getAllActivities() {
        return activities;
    }

}
