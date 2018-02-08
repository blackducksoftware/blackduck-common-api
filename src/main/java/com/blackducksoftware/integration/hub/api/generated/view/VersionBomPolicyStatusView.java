package com.blackducksoftware.integration.hub.api.generated.view;

import com.blackducksoftware.integration.hub.api.core.HubView;
import com.blackducksoftware.integration.hub.api.generated.component.ComponentVersionPolicyViolationDetails;
import com.blackducksoftware.integration.hub.api.generated.component.NameValuePairView;
import com.blackducksoftware.integration.hub.api.generated.enumeration.PolicyStatusApprovalStatusType;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class VersionBomPolicyStatusView extends HubView {
    public ComponentVersionPolicyViolationDetails componentVersionPolicyViolationDetails;
    public java.util.List<NameValuePairView> componentVersionStatusCounts;
    public PolicyStatusApprovalStatusType overallStatus;
    public java.util.Date updatedAt;

}
