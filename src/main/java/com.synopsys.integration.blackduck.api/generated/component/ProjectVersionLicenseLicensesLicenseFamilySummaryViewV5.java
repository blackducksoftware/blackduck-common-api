package com.synopsys.integration.blackduck.api.generated.component;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import java.util.Optional;

/**
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public class ProjectVersionLicenseLicensesLicenseFamilySummaryViewV5 extends BlackDuckComponent {
	public static final String mediaType = "application/vnd.blackducksoftware.project-detail-5+json";

    private String name;
    private String href;

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public String getHref() {
	return href;
    }

    public void setHref(String href) {
	this.href = href;
    }


    public String getMediaType() {
	return mediaType;
    }

}
