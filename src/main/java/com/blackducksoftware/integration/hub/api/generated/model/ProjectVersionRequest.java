package com.blackducksoftware.integration.hub.api.generated.model;

import com.blackducksoftware.integration.hub.api.HubModel;
import com.blackducksoftware.integration.hub.api.generated.enumeration.ProjectVersionDistribution;
import com.blackducksoftware.integration.hub.api.generated.enumeration.ProjectVersionPhase;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ProjectVersionRequest extends HubModel {
    public ProjectVersionDistribution distribution;
    public String nickname;
    public ProjectVersionPhase phase;
    public String releaseComments;
    public java.util.Date releasedOn;
    public String versionName;

}
