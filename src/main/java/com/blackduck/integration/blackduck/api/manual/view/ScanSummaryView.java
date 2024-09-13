/*
 * blackduck-common-api
 *
 * Copyright (c) 2024 Black Duck Software, Inc.
 *
 * Use subject to the terms and conditions of the Black Duck Software End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.blackduck.integration.blackduck.api.manual.view;

import com.blackduck.integration.blackduck.api.core.BlackDuckView;
import com.blackduck.integration.blackduck.api.generated.view.CodeLocationView;
import com.blackduck.integration.blackduck.api.manual.enumeration.ScanSummaryStatusType;

import java.lang.reflect.Type;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class ScanSummaryView extends BlackDuckView {
    public static final Map<String, Type> links = new HashMap<>();

    public static final String CODELOCATION_LINK = "codelocation";

    static {
        ScanSummaryView.links.put(ScanSummaryView.CODELOCATION_LINK, CodeLocationView.class);
    }

    private ScanSummaryStatusType status;
    private String statusMessage;
    private Date createdAt;
    private Date updatedAt;

    public ScanSummaryStatusType getStatus() {
        return status;
    }

    public String getStatusMessage() {
        return statusMessage;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

}
