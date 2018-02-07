package com.blackducksoftware.integration.hub.api.generated.model;

import com.blackducksoftware.integration.hub.api.core.HubModel;
import com.blackducksoftware.integration.hub.api.generated.enumeration.ProjectVersionDistributionType;
import com.blackducksoftware.integration.hub.api.generated.enumeration.ProjectVersionPhaseType;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ProjectVersionRequest extends HubModel {
    public ProjectVersionDistributionType distribution;
    public String nickname;
    public ProjectVersionPhaseType phase;
    public String releaseComments;
    public java.util.Date releasedOn;
    public String versionName;

}
