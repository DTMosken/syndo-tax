package com.syndo.project.industry.zbgzjs.domain;

import com.syndo.common.core.domain.Ztree;

public class ZtreeImpl extends Ztree {    
    private static final long serialVersionUID = 1L;
    
    private boolean isParent = false;
    private String lx;
    private String fzsx;
    private String fzxx;

    public boolean isIsParent() {
        return isParent;
    }

    public void setIsParent(boolean parent) {
        isParent = parent;
    }

    public String getLx() {
        return lx;
    }

    public void setLx(String lx) {
        this.lx = lx;
    }

    public String getFzsx() {
        return fzsx;
    }

    public void setFzsx(String fzsx) {
        this.fzsx = fzsx;
    }

    public String getFzxx() {
        return fzxx;
    }

    public void setFzxx(String fzxx) {
        this.fzxx = fzxx;
    }

}
