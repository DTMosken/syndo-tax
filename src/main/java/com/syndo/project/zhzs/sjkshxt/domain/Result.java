package com.syndo.project.zhzs.sjkshxt.domain;

public class Result
{
    private Location location;

    private int precise;

    private int confidence;

    private int comprehension;

    private String level;

    public void setLocation(Location location){
        this.location = location;
    }
    public Location getLocation(){
        return this.location;
    }
    public void setPrecise(int precise){
        this.precise = precise;
    }
    public int getPrecise(){
        return this.precise;
    }
    public void setConfidence(int confidence){
        this.confidence = confidence;
    }
    public int getConfidence(){
        return this.confidence;
    }
    public void setComprehension(int comprehension){
        this.comprehension = comprehension;
    }
    public int getComprehension(){
        return this.comprehension;
    }
    public void setLevel(String level){
        this.level = level;
    }
    public String getLevel(){
        return this.level;
    }
}