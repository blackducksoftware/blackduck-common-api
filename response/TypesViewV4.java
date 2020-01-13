package com.synopsys.integration.blackduck.api.generated.response;

import com.synopsys.integration.blackduck.api.core.BlackDuckResponse;
import com.synopsys.integration.blackduck.api.core.BlackDuckView;

/**
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public class TypesViewV4 extends BlackDuckResponse {
	public static final String mediaType = "application/vnd.blackducksoftware.admin-4+json";

    private Boolean supportsOptions;
    private String name;
    private String type;

    public Boolean getSupportsOptions() {
	return supportsOptions;
    }

    public void setSupportsOptions(Boolean supportsOptions) {
	this.supportsOptions = supportsOptions;
    }

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


    public String getMediaType() {
	return mediaType;
    }

}
