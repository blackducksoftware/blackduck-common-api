/*
 * blackduck-common-api
 *
 * Copyright (c) 2021 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.synopsys.integration.blackduck.api.generated.component;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ComponentLogoView extends BlackDuckComponent {
    private String mediumLogoUrl;
    private String smallLogoUrl;

    public String getMediumLogoUrl() {
        return mediumLogoUrl;
    }

    public void setMediumLogoUrl(String mediumLogoUrl) {
        this.mediumLogoUrl = mediumLogoUrl;
    }

    public String getSmallLogoUrl() {
        return smallLogoUrl;
    }

    public void setSmallLogoUrl(String smallLogoUrl) {
        this.smallLogoUrl = smallLogoUrl;
    }

}
