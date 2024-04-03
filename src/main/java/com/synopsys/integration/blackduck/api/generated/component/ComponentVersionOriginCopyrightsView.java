/*
 * blackduck-common-api
 *
 * Copyright (c) 2024 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.synopsys.integration.blackduck.api.generated.component;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.generated.enumeration.OriginSourceType;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ComponentVersionOriginCopyrightsView extends BlackDuckComponent {
    private Boolean active;
    private java.util.List<String> fileSha1s;
    private String kbCopyright;
    private OriginSourceType source;
    private java.util.Date updatedAt;
    private String updatedBy;
    private String updatedCopyright;

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public java.util.List<String> getFileSha1s() {
        return fileSha1s;
    }

    public void setFileSha1s(java.util.List<String> fileSha1s) {
        this.fileSha1s = fileSha1s;
    }

    public String getKbCopyright() {
        return kbCopyright;
    }

    public void setKbCopyright(String kbCopyright) {
        this.kbCopyright = kbCopyright;
    }

    public OriginSourceType getSource() {
        return source;
    }

    public void setSource(OriginSourceType source) {
        this.source = source;
    }

    public java.util.Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public String getUpdatedCopyright() {
        return updatedCopyright;
    }

    public void setUpdatedCopyright(String updatedCopyright) {
        this.updatedCopyright = updatedCopyright;
    }

}
