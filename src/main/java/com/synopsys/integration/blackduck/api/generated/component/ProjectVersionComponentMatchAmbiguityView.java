/*
 * blackduck-common-api
 *
 * Copyright (c) 2023 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.synopsys.integration.blackduck.api.generated.component;

import java.math.BigDecimal;
import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ProjectVersionComponentMatchAmbiguityView extends BlackDuckComponent {
    private java.util.List<String> alternateVersionIds;
    private BigDecimal kbArtifactMatchPercentage;

    public java.util.List<String> getAlternateVersionIds() {
        return alternateVersionIds;
    }

    public void setAlternateVersionIds(java.util.List<String> alternateVersionIds) {
        this.alternateVersionIds = alternateVersionIds;
    }

    public BigDecimal getKbArtifactMatchPercentage() {
        return kbArtifactMatchPercentage;
    }

    public void setKbArtifactMatchPercentage(BigDecimal kbArtifactMatchPercentage) {
        this.kbArtifactMatchPercentage = kbArtifactMatchPercentage;
    }

}
