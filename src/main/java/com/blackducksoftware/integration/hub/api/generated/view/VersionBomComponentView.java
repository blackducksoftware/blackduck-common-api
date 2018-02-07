package com.blackducksoftware.integration.hub.api.generated.view;

import java.util.HashMap;
import java.util.Map;

import com.blackducksoftware.integration.hub.api.core.HubView;
import com.blackducksoftware.integration.hub.api.core.LinkMultipleResponses;
import com.blackducksoftware.integration.hub.api.core.LinkResponse;
import com.blackducksoftware.integration.hub.api.core.LinkSingleResponse;
import com.blackducksoftware.integration.hub.api.generated.enumeration.MatchedFileUsagesType;
import com.blackducksoftware.integration.hub.api.generated.enumeration.PolicyStatusApprovalStatusType;
import com.blackducksoftware.integration.hub.api.generated.enumeration.VersionBomComponentMatchType;
import com.blackducksoftware.integration.hub.api.generated.enumeration.VersionBomComponentReviewStatusType;
import com.blackducksoftware.integration.hub.api.generated.model.ActivityDataView;
import com.blackducksoftware.integration.hub.api.generated.model.ReviewedDetails;
import com.blackducksoftware.integration.hub.api.generated.model.VersionBomLicenseView;
import com.blackducksoftware.integration.hub.api.generated.model.VersionBomOriginView;
import com.blackducksoftware.integration.hub.api.generated.response.UserCommentView;
import com.blackducksoftware.integration.hub.api.generated.view.IssueView;
import com.blackducksoftware.integration.hub.api.generated.view.MatchedFileView;
import com.blackducksoftware.integration.hub.api.generated.view.PolicyRuleViewV2;
import com.blackducksoftware.integration.hub.api.generated.view.RiskProfileView;
import com.blackducksoftware.integration.hub.api.generated.view.VulnerabilityV2View;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class VersionBomComponentView extends HubView {
    public static final Map<String, LinkResponse> links = new HashMap<>();

    public static final String POLICY_RULES_LINK = "policy-rules";
    public static final String MATCHED_FILES_LINK = "matched-files";
    public static final String COMMENTS_LINK = "comments";
    public static final String COMPONENT_ISSUES_LINK = "component-issues";
    public static final String VULNERABILITIES_LINK = "vulnerabilities";

    public static final LinkMultipleResponses POLICY_RULES_LINK_RESPONSE = new LinkMultipleResponses(POLICY_RULES_LINK, PolicyRuleViewV2.class);
    public static final LinkMultipleResponses MATCHED_FILES_LINK_RESPONSE = new LinkMultipleResponses(MATCHED_FILES_LINK, MatchedFileView.class);
    public static final LinkMultipleResponses COMMENTS_LINK_RESPONSE = new LinkMultipleResponses(COMMENTS_LINK, UserCommentView.class);
    public static final LinkSingleResponse COMPONENT_ISSUES_LINK_RESPONSE = new LinkSingleResponse(COMPONENT_ISSUES_LINK, IssueView.class);
    public static final LinkMultipleResponses VULNERABILITIES_LINK_RESPONSE = new LinkMultipleResponses(VULNERABILITIES_LINK, VulnerabilityV2View.class);

    static {
            links.put(POLICY_RULES_LINK, POLICY_RULES_LINK_RESPONSE);
            links.put(MATCHED_FILES_LINK, MATCHED_FILES_LINK_RESPONSE);
            links.put(COMMENTS_LINK, COMMENTS_LINK_RESPONSE);
            links.put(COMPONENT_ISSUES_LINK, COMPONENT_ISSUES_LINK_RESPONSE);
            links.put(VULNERABILITIES_LINK, VULNERABILITIES_LINK_RESPONSE);
    }

    public ActivityDataView activityData;
    public RiskProfileView activityRiskProfile;
    public PolicyStatusApprovalStatusType approvalStatus;
    public String component;
    public String componentName;
    public String componentVersion;
    public String componentVersionName;
    public RiskProfileView licenseRiskProfile;
    public java.util.List<VersionBomLicenseView> licenses;
    public java.util.List<VersionBomComponentMatchType> matchTypes;
    public RiskProfileView operationalRiskProfile;
    public java.util.List<VersionBomOriginView> origins;
    public PolicyStatusApprovalStatusType policyStatus;
    public java.util.Date releasedOn;
    public VersionBomComponentReviewStatusType reviewStatus;
    public ReviewedDetails reviewedDetails;
    public RiskProfileView securityRiskProfile;
    public Long totalFileMatchCount;
    public java.util.List<MatchedFileUsagesType> usages;
    public RiskProfileView versionRiskProfile;

}
