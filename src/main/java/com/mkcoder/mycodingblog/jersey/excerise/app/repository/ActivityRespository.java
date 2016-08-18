package com.mkcoder.mycodingblog.jersey.excerise.app.repository;

import com.mkcoder.mycodingblog.jersey.excerise.app.model.Activity;

import java.util.List;

/**
 * Created by muhammadk on 16-Aug-16.
 */
public interface ActivityRespository {
    List<Activity> getAllActivities();
}
