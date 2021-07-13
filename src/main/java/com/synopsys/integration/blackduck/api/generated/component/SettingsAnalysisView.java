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

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class SettingsAnalysisView extends BlackDuckComponent {
    private BigDecimal customSignatureMatchDepth;
    private BigDecimal maximumSnippetFileSize;

    public BigDecimal getCustomSignatureMatchDepth() {
        return customSignatureMatchDepth;
    }

    public void setCustomSignatureMatchDepth(BigDecimal customSignatureMatchDepth) {
        this.customSignatureMatchDepth = customSignatureMatchDepth;
    }

    public BigDecimal getMaximumSnippetFileSize() {
        return maximumSnippetFileSize;
    }

    public void setMaximumSnippetFileSize(BigDecimal maximumSnippetFileSize) {
        this.maximumSnippetFileSize = maximumSnippetFileSize;
    }

}
