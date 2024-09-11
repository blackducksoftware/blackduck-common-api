/*
 * blackduck-common-api
 *
 * Copyright (c) 2024 Black Duck Software, Inc.
 *
 * Use subject to the terms and conditions of the Black Duck Software End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.blackduck.integration.blackduck.api.generated.view;

import java.math.BigDecimal;
import com.blackduck.integration.blackduck.api.core.BlackDuckView;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class SettingsAnalysisView extends BlackDuckView {
    private BigDecimal customSignatureMatchDepth;
    private BigDecimal fileDependencyAllowDupDepth;
    private BigDecimal maximumSnippetFileSize;
    private BigDecimal minimumScanInterval;

    public BigDecimal getCustomSignatureMatchDepth() {
        return customSignatureMatchDepth;
    }

    public void setCustomSignatureMatchDepth(BigDecimal customSignatureMatchDepth) {
        this.customSignatureMatchDepth = customSignatureMatchDepth;
    }

    public BigDecimal getFileDependencyAllowDupDepth() {
        return fileDependencyAllowDupDepth;
    }

    public void setFileDependencyAllowDupDepth(BigDecimal fileDependencyAllowDupDepth) {
        this.fileDependencyAllowDupDepth = fileDependencyAllowDupDepth;
    }

    public BigDecimal getMaximumSnippetFileSize() {
        return maximumSnippetFileSize;
    }

    public void setMaximumSnippetFileSize(BigDecimal maximumSnippetFileSize) {
        this.maximumSnippetFileSize = maximumSnippetFileSize;
    }

    public BigDecimal getMinimumScanInterval() {
        return minimumScanInterval;
    }

    public void setMinimumScanInterval(BigDecimal minimumScanInterval) {
        this.minimumScanInterval = minimumScanInterval;
    }

}
