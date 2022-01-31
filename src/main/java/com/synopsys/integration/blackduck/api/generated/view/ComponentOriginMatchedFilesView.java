/*
 * blackduck-common-api
 *
 * Copyright (c) 2022 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.synopsys.integration.blackduck.api.generated.view;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import com.synopsys.integration.blackduck.api.generated.component.ComponentOriginMatchedFilesItemsFilePathView;
import com.synopsys.integration.blackduck.api.generated.enumeration.UsageType;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ComponentOriginMatchedFilesView extends BlackDuckView {
    private ComponentOriginMatchedFilesItemsFilePathView filePath;
    private java.util.List<UsageType> usages;

    public ComponentOriginMatchedFilesItemsFilePathView getFilePath() {
        return filePath;
    }

    public void setFilePath(ComponentOriginMatchedFilesItemsFilePathView filePath) {
        this.filePath = filePath;
    }

    public java.util.List<UsageType> getUsages() {
        return usages;
    }

    public void setUsages(java.util.List<UsageType> usages) {
        this.usages = usages;
    }

}
