package com.remets.miniOnlineMarket.domain;

import javax.validation.constraints.NotEmpty;

public enum AddressType {

    BILLING("BILLING"), SHIPPING("SHIPPING");
    private String type;

    AddressType(String type){
        this.type = type;
    }
    public String getType(){
        return type;
    }
}