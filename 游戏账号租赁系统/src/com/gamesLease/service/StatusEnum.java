package com.gamesLease.service;

/**
 * Created by wyx11 on 2017-5-21.
 */
public enum StatusEnum {
    审核未通过(-2),已下架(-1),审核中(0),可租用(1),已被租(2);

    private Integer data;

    private StatusEnum(Integer data) {
        this.data=data;
    }

    public String toString() {
        return this.data.toString();
    }


}
