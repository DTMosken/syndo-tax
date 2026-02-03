package com.syndo.project.taxgis.domain;

import java.util.List;

public class QyglTreeData {
    private String id;
    private String pid;
    private String label;
    private String lx;
    private String geo;
    private int wbz;
    private List<QyglTreeData> children = null;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public List<QyglTreeData> getChildren() {
        return children;
    }

    public void setChildren(List<QyglTreeData> children) {
        this.children = children;
    }

    public int getWbz() {
        return wbz;
    }

    public void setWbz(int wbz) {
        this.wbz = wbz;
    }

    public String getGeo() {
        return geo;
    }

    public void setGeo(String geo) {
        this.geo = geo;
    }

    public String getLx() {
        return lx;
    }

    public void setLx(String lx) {
        this.lx = lx;
    }

}