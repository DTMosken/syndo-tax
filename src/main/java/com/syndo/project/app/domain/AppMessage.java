package com.syndo.project.app.domain;

import com.syndo.common.core.domain.BaseEntity;

public class AppMessage extends BaseEntity {
    private String objId;
    private String author;
    private String title;
    private String substance;
    private String dateTime;

    public String getObjId() {
        return objId;
    }
    public void setObjId(String objId) {
        this.objId = objId;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getSubstance() {
        return substance;
    }
    public void setSubstance(String substance) {
        this.substance = substance;
    }
    public String getDateTime() {
        return dateTime;
    }
    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }    
}
