/*
 * blackduck-common-api
 *
 * Copyright (c) 2023 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.synopsys.integration.blackduck.api.generated.view;

import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import com.synopsys.integration.blackduck.api.generated.enumeration.BomStatusScanStatusType;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class BomStatusScanView extends BlackDuckView {
    private BomStatusScanStatusType status;

    public BomStatusScanStatusType getStatus() {
        return status;
    }

    public void setStatus(BomStatusScanStatusType status) {
        this.status = status;
    }

}
