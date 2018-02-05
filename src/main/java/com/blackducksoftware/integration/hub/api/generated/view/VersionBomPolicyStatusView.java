package com.blackducksoftware.integration.hub.api.generated.view;

import com.blackducksoftware.integration.hub.api.HubView;
import com.blackducksoftware.integration.hub.api.generated.enumeration.PolicyStatusApprovalStatus;
import com.blackducksoftware.integration.hub.api.generated.model.ComponentVersionPolicyViolationDetails;
import com.blackducksoftware.integration.hub.api.generated.model.NameValuePairView;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class VersionBomPolicyStatusView extends HubView {
    public ComponentVersionPolicyViolationDetails componentVersionPolicyViolationDetails;
    public java.util.List<NameValuePairView> componentVersionStatusCounts;
    public PolicyStatusApprovalStatus overallStatus;
    public java.util.Date updatedAt;

}
