/*
 * blackduck-common-api
 *
 * Copyright (c) 2021 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.synopsys.integration.blackduck.api.generated.view;

import java.math.BigDecimal;
import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import com.synopsys.integration.blackduck.api.core.response.LinkResponse;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class CodeLocationView extends BlackDuckView {
    private java.util.Date createdAt;
    private String mappedProjectVersion;
    private String name;
    private BigDecimal scanSize;
    private java.util.Date updatedAt;
    private String url;

    public java.util.Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getMappedProjectVersion() {
        return mappedProjectVersion;
    }

    public void setMappedProjectVersion(String mappedProjectVersion) {
        this.mappedProjectVersion = mappedProjectVersion;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getScanSize() {
        return scanSize;
    }

    public void setScanSize(BigDecimal scanSize) {
        this.scanSize = scanSize;
    }

    public java.util.Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
