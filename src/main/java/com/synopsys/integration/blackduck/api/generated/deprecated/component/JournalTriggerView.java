package com.synopsys.integration.blackduck.api.generated.deprecated.component;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.generated.enumeration.ProjectItemsTriggerDataType;

@Deprecated
/**
* JournalTriggerView from the previous API is now called ProjectItemsTriggerDataView
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public class JournalTriggerView extends BlackDuckComponent {
    private ProjectItemsTriggerDataType type;
    private String name;
    private String link;

    public ProjectItemsTriggerDataType getType() {
	    return type;
    }

    public void setType(ProjectItemsTriggerDataType type) {
	    this.type = type;
    }

    public String getName() {
	    return name;
    }

    public void setName(String name) {
	    this.name = name;
    }

    public String getLink() {
	    return link;
    }

    public void setLink(String link) {
	    this.link = link;
    }

}