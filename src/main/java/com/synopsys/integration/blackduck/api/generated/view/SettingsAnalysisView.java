package com.synopsys.integration.blackduck.api.generated.view;

import java.math.BigDecimal;
import com.synopsys.integration.blackduck.api.core.BlackDuckView;

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
