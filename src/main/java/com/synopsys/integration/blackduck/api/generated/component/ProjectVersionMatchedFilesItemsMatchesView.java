package com.synopsys.integration.blackduck.api.generated.component;

import java.util.Optional;
import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.generated.enumeration.ProjectVersionMatchedFilesItemsMatchesMatchType;

/**
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public class ProjectVersionMatchedFilesItemsMatchesView extends BlackDuckComponent {
    private ProjectVersionMatchedFilesItemsMatchesMatchType matchType;
    private String component;
    private String snippet;

    public ProjectVersionMatchedFilesItemsMatchesMatchType getMatchType() {
	    return matchType;
    }

    public void setMatchType(ProjectVersionMatchedFilesItemsMatchesMatchType matchType) {
	    this.matchType = matchType;
    }

    public String getComponent() {
	    return component;
    }

    public void setComponent(String component) {
	    this.component = component;
    }

    public String getSnippet() {
	    return snippet;
    }

    public void setSnippet(String snippet) {
	    this.snippet = snippet;
    }

}
