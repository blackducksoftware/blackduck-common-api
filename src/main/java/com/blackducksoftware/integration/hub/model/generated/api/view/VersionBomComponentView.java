package com.blackducksoftware.integration.hub.model.generated.api.view;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.blackducksoftware.integration.hub.model.HubView;
import com.google.gson.reflect.TypeToken;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class VersionBomComponentView extends HubView {
    public static final Map<String, Type> links = new HashMap<>();

    public static final String POLICY_RULES_LINK = "policy-rules";
    public static final String MATCHED_FILES_LINK = "matched-files";
    public static final String COMMENTS_LINK = "comments";
    public static final String COMPONENT_ISSUES_LINK = "component-issues";
    public static final String VULNERABILITIES_LINK = "vulnerabilities";

    static {
        links.put(POLICY_RULES_LINK, new TypeToken<ArrayList<PolicyRuleViewV2>>() {}.getType());
        links.put(MATCHED_FILES_LINK, new TypeToken<ArrayList<MatchedFileView>>() {}.getType());
        links.put(COMMENTS_LINK, new TypeToken<ArrayList<UserCommentView>>() {}.getType());
        links.put(COMPONENT_ISSUES_LINK, IssueView.class);
        links.put(VULNERABILITIES_LINK, new TypeToken<ArrayList<VulnerabilityV2View>>() {}.getType());
    }

    public ActivityDataView activityData;
    public RiskProfileView activityRiskProfile;
    public com.blackducksoftware.integration.hub.model.generated.api.enumeration.VersionBomComponentApprovalStatusEnum approvalStatus;
    public String component;
    public String componentName;
    public String componentVersion;
    public String componentVersionName;
    public RiskProfileView licenseRiskProfile;
    public java.util.List<VersionBomLicenseView> licenses;
    public com.blackducksoftware.integration.hub.model.generated.api.enumeration.VersionBomComponentMatchTypesEnum matchTypes;
    public RiskProfileView operationalRiskProfile;
    public java.util.List<VersionBomOriginView> origins;
    public com.blackducksoftware.integration.hub.model.generated.api.enumeration.VersionBomComponentPolicyStatusEnum policyStatus;
    public java.util.Date releasedOn;
    public com.blackducksoftware.integration.hub.model.generated.api.enumeration.VersionBomComponentReviewStatusEnum reviewStatus;
    public ReviewedDetails reviewedDetails;
    public RiskProfileView securityRiskProfile;
    public Long totalFileMatchCount;
    public com.blackducksoftware.integration.hub.model.generated.api.enumeration.VersionBomComponentUsagesEnum usages;
    public RiskProfileView versionRiskProfile;

}
