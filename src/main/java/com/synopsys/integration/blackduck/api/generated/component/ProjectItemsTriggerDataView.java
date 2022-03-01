/*
 * blackduck-common-api
 *
 * Copyright (c) 2022 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.synopsys.integration.blackduck.api.generated.component;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.generated.enumeration.ProjectItemsTriggerDataType;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ProjectItemsTriggerDataView extends BlackDuckComponent {
    private String link;
    private String name;
    private ProjectItemsTriggerDataType type;

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProjectItemsTriggerDataType getType() {
        return type;
    }

    public void setType(ProjectItemsTriggerDataType type) {
        this.type = type;
    }

}
