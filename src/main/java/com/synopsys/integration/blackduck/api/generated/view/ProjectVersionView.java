package com.synopsys.integration.blackduck.api.generated.view;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import com.synopsys.integration.blackduck.api.core.response.LinkMultipleResponses;
import com.synopsys.integration.blackduck.api.core.response.LinkResponse;
import com.synopsys.integration.blackduck.api.core.response.LinkSingleResponse;
import com.synopsys.integration.blackduck.api.generated.enumeration.LicenseFamilyLicenseFamilyRiskRulesReleaseDistributionType;
import com.synopsys.integration.blackduck.api.generated.view.CodeLocationView;
import com.synopsys.integration.blackduck.api.generated.view.ProjectVersionComponentView;
import com.synopsys.integration.blackduck.api.generated.view.ProjectVersionLicenseView;
import com.synopsys.integration.blackduck.api.generated.view.ProjectVersionPolicyStatusView;
import com.synopsys.integration.blackduck.api.generated.view.ProjectView;
import com.synopsys.integration.blackduck.api.manual.throwaway.generated.enumeration.ProjectVersionPhaseType;
import com.synopsys.integration.blackduck.api.manual.throwaway.generated.view.IssueView;
import com.synopsys.integration.blackduck.api.manual.throwaway.generated.view.VulnerableComponentView;

/**
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public class ProjectVersionView extends ProjectVersionViewV5 {
	public static final Map<String, LinkResponse> links = new HashMap<>();

    public static final String CODELOCATIONS_LINK = "codelocations";
    public static final String COMPONENTS_LINK = "components";
    public static final String ISSUES_LINK = "issues";
    public static final String LICENSEREPORTS_LINK = "licenseReports";
    public static final String POLICY_STATUS_LINK = "policy-status";
    public static final String PROJECT_LINK = "project";
    public static final String VULNERABLE_COMPONENTS_LINK = "vulnerable-components";

	public static final LinkMultipleResponses<CodeLocationView> CODELOCATIONS_LINK_RESPONSE = new LinkMultipleResponses<CodeLocationView>(CODELOCATIONS_LINK, CodeLocationView.class);
	public static final LinkMultipleResponses<ProjectVersionComponentView> COMPONENTS_LINK_RESPONSE = new LinkMultipleResponses<ProjectVersionComponentView>(COMPONENTS_LINK, ProjectVersionComponentView.class);
	public static final LinkMultipleResponses<IssueView> ISSUES_LINK_RESPONSE = new LinkMultipleResponses<IssueView>(ISSUES_LINK, IssueView.class);
	public static final LinkMultipleResponses<ReportView> LICENSEREPORTS_LINK_RESPONSE = new LinkMultipleResponses<ReportView>(LICENSEREPORTS_LINK, ReportView.class);
	public static final LinkSingleResponse<ProjectVersionPolicyStatusView> POLICY_STATUS_LINK_RESPONSE = new LinkSingleResponse<ProjectVersionPolicyStatusView>(POLICY_STATUS_LINK, ProjectVersionPolicyStatusView.class);
	public static final LinkSingleResponse<ProjectView> PROJECT_LINK_RESPONSE = new LinkSingleResponse<ProjectView>(PROJECT_LINK, ProjectView.class);
	public static final LinkMultipleResponses<VulnerableComponentView> VULNERABLE_COMPONENTS_LINK_RESPONSE = new LinkMultipleResponses<VulnerableComponentView>(VULNERABLE_COMPONENTS_LINK, VulnerableComponentView.class);

    static {
	    links.put(CODELOCATIONS_LINK, CODELOCATIONS_LINK_RESPONSE);
	    links.put(COMPONENTS_LINK, COMPONENTS_LINK_RESPONSE);
	    links.put(ISSUES_LINK, ISSUES_LINK_RESPONSE);
	    links.put(LICENSEREPORTS_LINK, LICENSEREPORTS_LINK_RESPONSE);
	    links.put(POLICY_STATUS_LINK, POLICY_STATUS_LINK_RESPONSE);
	    links.put(PROJECT_LINK, PROJECT_LINK_RESPONSE);
	    links.put(VULNERABLE_COMPONENTS_LINK, VULNERABLE_COMPONENTS_LINK_RESPONSE);
    }

}
