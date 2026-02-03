package com.syndo.project.taxgis.domain;

import java.util.List;

public class HyTreeData {
    private String id;
    private String pid;
    private String label;
    private List<HyTreeData> children = null;

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

    public List<HyTreeData> getChildren() {
        return children;
    }

    public void setChildren(List<HyTreeData> children) {
        this.children = children;
    }
}