package com.syndo.project.zhzs.sjkshxt.domain;

public class Root
{
    private int status;

    private Result result;

    public void setStatus(int status){
        this.status = status;
    }
    public int getStatus(){
        return this.status;
    }
    public void setResult(Result result){
        this.result = result;
    }
    public Result getResult(){
        return this.result;
    }
}