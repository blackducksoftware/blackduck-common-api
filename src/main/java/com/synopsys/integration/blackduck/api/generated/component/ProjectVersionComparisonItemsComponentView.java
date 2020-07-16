package com.synopsys.integration.blackduck.api.generated.component;

import java.util.List;
import java.util.Optional;
import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.generated.enumeration.ProjectVersionComparisonItemsComponentMatchTypesType;

/**
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public class ProjectVersionComparisonItemsComponentView extends BlackDuckComponent {
    private java.util.List<ProjectVersionComparisonItemsComponentMatchTypesType> matchTypes;

    public java.util.List<ProjectVersionComparisonItemsComponentMatchTypesType> getMatchTypes() {
	    return matchTypes;
    }

    public void setMatchTypes(java.util.List<ProjectVersionComparisonItemsComponentMatchTypesType> matchTypes) {
	    this.matchTypes = matchTypes;
    }

}
