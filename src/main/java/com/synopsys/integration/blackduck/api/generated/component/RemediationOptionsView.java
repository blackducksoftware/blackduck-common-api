package com.synopsys.integration.blackduck.api.generated.component;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.generated.component.RemediatingVersionView;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class RemediationOptionsView extends BlackDuckComponent {
    private RemediatingVersionView fixesPreviousVulnerabilities;
    private RemediatingVersionView latestAfterCurrent;
    private RemediatingVersionView noVulnerabilities;

    public RemediatingVersionView getFixesPreviousVulnerabilities() {
        return fixesPreviousVulnerabilities;
    }

    public void setFixesPreviousVulnerabilities(RemediatingVersionView fixesPreviousVulnerabilities) {
        this.fixesPreviousVulnerabilities = fixesPreviousVulnerabilities;
    }

    public RemediatingVersionView getLatestAfterCurrent() {
        return latestAfterCurrent;
    }

    public void setLatestAfterCurrent(RemediatingVersionView latestAfterCurrent) {
        this.latestAfterCurrent = latestAfterCurrent;
    }

    public RemediatingVersionView getNoVulnerabilities() {
        return noVulnerabilities;
    }

    public void setNoVulnerabilities(RemediatingVersionView noVulnerabilities) {
        this.noVulnerabilities = noVulnerabilities;
    }

}
