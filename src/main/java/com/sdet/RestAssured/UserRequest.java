package com.sdet.RestAssured;

public class UserRequest {
    private String name;
    private String job;

    private AdreesR address;

    public UserRequest() {
    }

    public UserRequest(String name, String job, AdreesR address) {
        this.name = name;
        this.job = job;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public AdreesR getAddress() {
        return address;
    }

    public void setAddress(AdreesR address) {
        this.address = address;
    }
}
