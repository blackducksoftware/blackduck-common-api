package com.synopsys.integration.blackduck.api.generated.deprecated.component;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.generated.enumeration.ProjectItemsTriggerDataType;

// JournalTriggerView from the previous API is now called ProjectItemsTriggerDataView
// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
@Deprecated
public class JournalTriggerView extends BlackDuckComponent {
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
