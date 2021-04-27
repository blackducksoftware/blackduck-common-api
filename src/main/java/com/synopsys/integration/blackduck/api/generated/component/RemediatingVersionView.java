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
package com.synopsys.integration.blackduck.api.generated.component;

import java.math.BigDecimal;
import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;

// RemediatingVersionView from the previous API is now called ComponentVersionRemediatingFixesPreviousVulnerabilitiesView
// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class RemediatingVersionView extends BlackDuckComponent {
    private String componentVersion;
    private String name;
    private java.util.Date releasedOn;
    private BigDecimal vulnerabilityCount;

    public String getComponentVersion() {
        return componentVersion;
    }

    public void setComponentVersion(String componentVersion) {
        this.componentVersion = componentVersion;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public java.util.Date getReleasedOn() {
        return releasedOn;
    }

    public void setReleasedOn(java.util.Date releasedOn) {
        this.releasedOn = releasedOn;
    }

    public BigDecimal getVulnerabilityCount() {
        return vulnerabilityCount;
    }

    public void setVulnerabilityCount(BigDecimal vulnerabilityCount) {
        this.vulnerabilityCount = vulnerabilityCount;
    }

}
