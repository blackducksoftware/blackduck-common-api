package com.synopsys.integration.blackduck.api.core;

public class BlackDuckStringResponse extends BlackDuckResponse {
    private String value;

    public BlackDuckStringResponse(String value) {
        this.value = value;
    }

    public String string() {
        return value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
