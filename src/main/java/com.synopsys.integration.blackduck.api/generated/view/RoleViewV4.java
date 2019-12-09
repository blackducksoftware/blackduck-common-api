package com.synopsys.integration.blackduck.api.generated.view;

import com.synopsys.integration.blackduck.api.core.BlackDuckView;

/**
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public class RoleViewV4 extends BlackDuckView {
	public static final String mediaType = "application/vnd.blackducksoftware.user-4+json";

    private String name;
    private String description;

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public String getDescription() {
	return description;
    }

    public void setDescription(String description) {
	this.description = description;
    }


    public String getMediaType() {
	return mediaType;
    }

}
