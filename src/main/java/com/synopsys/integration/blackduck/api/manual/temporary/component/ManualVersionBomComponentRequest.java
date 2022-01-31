/*
 * blackduck-common-api
 *
 * Copyright (c) 2022 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.synopsys.integration.blackduck.api.manual.temporary.component;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ManualVersionBomComponentRequest extends BlackDuckComponent {
    private String component;
    private String componentModification;
    private Boolean componentModified;
    private String componentPurpose;

    public String getComponent() {
        return component;
    }

    public void setComponent(String component) {
        this.component = component;
    }

    public String getComponentModification() {
        return componentModification;
    }

    public void setComponentModification(String componentModification) {
        this.componentModification = componentModification;
    }

    public Boolean getComponentModified() {
        return componentModified;
    }

    public void setComponentModified(Boolean componentModified) {
        this.componentModified = componentModified;
    }

    public String getComponentPurpose() {
        return componentPurpose;
    }

    public void setComponentPurpose(String componentPurpose) {
        this.componentPurpose = componentPurpose;
    }

}
