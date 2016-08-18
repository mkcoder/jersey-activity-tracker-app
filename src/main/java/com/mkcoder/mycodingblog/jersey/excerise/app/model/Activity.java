package com.mkcoder.mycodingblog.jersey.excerise.app.model;

/**
 * A class that represents a single activity
 */
public class Activity {
    private String activity;
    private Long duration;

    public Activity() {
    }

    public Activity(String activity, Long duration) {
        this.activity = activity;
        this.duration = duration;
    }

    public String getActivity() {
        return activity;
    }

    public Activity setActivity(String activity) {
        this.activity = activity;
        return this;
    }

    public Long getDuration() {
        return duration;
    }

    public Activity setDuration(Long duration) {
        this.duration = duration;
        return this;
    }
}
