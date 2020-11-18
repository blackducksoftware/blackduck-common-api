package com.synopsys.integration.blackduck.api.generated.response;

import com.synopsys.integration.blackduck.api.core.BlackDuckResponse;

/**
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public class TypesView extends BlackDuckResponse {
    private String name;
    private String type;
    private Boolean supportsOptions;

    public String getName() {
	    return name;
    }

    public void setName(String name) {
	    this.name = name;
    }

    public String getType() {
	    return type;
    }

    public void setType(String type) {
	    this.type = type;
    }

    public Boolean getSupportsOptions() {
	    return supportsOptions;
    }

    public void setSupportsOptions(Boolean supportsOptions) {
	    this.supportsOptions = supportsOptions;
    }

}
