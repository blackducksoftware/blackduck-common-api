/*
 * blackduck-common-api
 *
 * Copyright (c) 2024 Black Duck Software, Inc.
 *
 * Use subject to the terms and conditions of the Black Duck Software End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.blackduck.integration.blackduck.api.manual.view;

import com.blackduck.integration.blackduck.api.core.BlackDuckView;

public class PolicyViolationComponentView extends BlackDuckView {
    private String componentName;
    private String versionName;

    public String getComponentName() {
        return componentName;
    }

    public String getVersionName() {
        return versionName;
    }
}

