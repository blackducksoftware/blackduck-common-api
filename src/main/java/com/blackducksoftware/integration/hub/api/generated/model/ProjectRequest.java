package com.blackducksoftware.integration.hub.api.generated.model;

import com.blackducksoftware.integration.hub.api.core.HubModel;
import com.blackducksoftware.integration.hub.api.generated.model.ProjectVersionRequest;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ProjectRequest extends HubModel {
    public String description;
    public String name;
    public Boolean projectLevelAdjustments;
    public String projectOwner;
    public Integer projectTier;
    public ProjectVersionRequest versionRequest;

}
