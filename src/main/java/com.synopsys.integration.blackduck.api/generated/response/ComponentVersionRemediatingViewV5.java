package com.synopsys.integration.blackduck.api.generated.response;

import com.synopsys.integration.blackduck.api.core.BlackDuckResponse;
import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import java.util.Optional;
import com.synopsys.integration.blackduck.api.generated.component.ComponentVersionRemediatingFixesPreviousVulnerabilitiesView;

/**
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public class ComponentVersionRemediatingViewV5 extends BlackDuckResponse {
	public static final String mediaType = "application/vnd.blackducksoftware.component-detail-5+json";

    private ComponentVersionRemediatingFixesPreviousVulnerabilitiesView latestAfterCurrent;
    private ComponentVersionRemediatingFixesPreviousVulnerabilitiesView fixesPreviousVulnerabilities;
    private ComponentVersionRemediatingFixesPreviousVulnerabilitiesView noVulnerabilities;

    public ComponentVersionRemediatingFixesPreviousVulnerabilitiesView getLatestAfterCurrent() {
	return latestAfterCurrent;
    }

    public void setLatestAfterCurrent(ComponentVersionRemediatingFixesPreviousVulnerabilitiesView latestAfterCurrent) {
	this.latestAfterCurrent = latestAfterCurrent;
    }

    public ComponentVersionRemediatingFixesPreviousVulnerabilitiesView getFixesPreviousVulnerabilities() {
	return fixesPreviousVulnerabilities;
    }

    public void setFixesPreviousVulnerabilities(ComponentVersionRemediatingFixesPreviousVulnerabilitiesView fixesPreviousVulnerabilities) {
	this.fixesPreviousVulnerabilities = fixesPreviousVulnerabilities;
    }

    public ComponentVersionRemediatingFixesPreviousVulnerabilitiesView getNoVulnerabilities() {
	return noVulnerabilities;
    }

    public void setNoVulnerabilities(ComponentVersionRemediatingFixesPreviousVulnerabilitiesView noVulnerabilities) {
	this.noVulnerabilities = noVulnerabilities;
    }


    public String getMediaType() {
	return mediaType;
    }

}
