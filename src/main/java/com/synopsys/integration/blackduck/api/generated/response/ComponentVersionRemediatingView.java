/*
 * blackduck-common-api
 *
 * Copyright (c) 2021 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
/*
* blackduck-common-api
*
* Copyright (c) 2021 Synopsys, Inc.
*
* Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
*/
package com.synopsys.integration.blackduck.api.generated.response;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.core.BlackDuckResponse;
import com.synopsys.integration.blackduck.api.generated.component.RemediatingVersionView;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ComponentVersionRemediatingView extends BlackDuckResponse {
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
