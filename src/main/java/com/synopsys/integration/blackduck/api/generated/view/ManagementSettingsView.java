/*
 * blackduck-common-api
 *
 * Copyright (c) 2023 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.synopsys.integration.blackduck.api.generated.view;

import java.math.BigDecimal;
import com.synopsys.integration.blackduck.api.core.BlackDuckView;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ManagementSettingsView extends BlackDuckView {
    private Boolean checkList;
    private BigDecimal complexity;
    private Boolean enabled;
    private BigDecimal maximumLength;
    private BigDecimal minimumLength;
    private Boolean validateExisting;

    public Boolean getCheckList() {
        return checkList;
    }

    public void setCheckList(Boolean checkList) {
        this.checkList = checkList;
    }

    public BigDecimal getComplexity() {
        return complexity;
    }

    public void setComplexity(BigDecimal complexity) {
        this.complexity = complexity;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public BigDecimal getMaximumLength() {
        return maximumLength;
    }

    public void setMaximumLength(BigDecimal maximumLength) {
        this.maximumLength = maximumLength;
    }

    public BigDecimal getMinimumLength() {
        return minimumLength;
    }

    public void setMinimumLength(BigDecimal minimumLength) {
        this.minimumLength = minimumLength;
    }

    public Boolean getValidateExisting() {
        return validateExisting;
    }

    public void setValidateExisting(Boolean validateExisting) {
        this.validateExisting = validateExisting;
    }

}
