package com.synopsys.integration.blackduck.api.generated.component;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;

/**
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public class LicenseLicenseFamilyView extends BlackDuckComponent {
	public static final String mediaType = "application/vnd.blackducksoftware.component-detail-5+json";

    private String href;
    private String name;

    public String getHref() {
	return href;
    }

    public void setHref(String href) {
	this.href = href;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }


    public String getMediaType() {
	return mediaType;
    }

}
