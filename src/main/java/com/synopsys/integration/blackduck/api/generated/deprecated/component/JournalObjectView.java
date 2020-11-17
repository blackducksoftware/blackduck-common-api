package com.synopsys.integration.blackduck.api.generated.deprecated.component;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.generated.enumeration.ProjectItemsObjectDataType;

@Deprecated
/**
* JournalObjectView from the previous API is now called ProjectItemsObjectDataView
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public class JournalObjectView extends BlackDuckComponent {
    private ProjectItemsObjectDataType type;
    private String name;
    private String link;

    public ProjectItemsObjectDataType getType() {
	    return type;
    }

    public void setType(ProjectItemsObjectDataType type) {
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
