package com.blackducksoftware.integration.hub.api.generated.view;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.blackducksoftware.integration.hub.api.core.HubView;
import com.blackducksoftware.integration.hub.api.generated.enumeration.OriginSourceType;
import com.blackducksoftware.integration.hub.api.generated.enumeration.ProjectVersionDistributionType;
import com.blackducksoftware.integration.hub.api.generated.enumeration.ProjectVersionPhaseType;
import com.blackducksoftware.integration.hub.api.generated.model.VersionRiskProfileView;
import com.blackducksoftware.integration.hub.api.generated.view.CodeLocationView;
import com.blackducksoftware.integration.hub.api.generated.view.ComplexLicenseView;
import com.blackducksoftware.integration.hub.api.generated.view.ProjectView;
import com.blackducksoftware.integration.hub.api.generated.view.ReportView;
import com.blackducksoftware.integration.hub.api.generated.view.VersionBomComponentView;
import com.blackducksoftware.integration.hub.api.generated.view.VersionBomPolicyStatusView;
import com.blackducksoftware.integration.hub.api.generated.view.VulnerableComponentView;
import com.google.gson.reflect.TypeToken;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ProjectVersionView extends HubView {
    public static final Map<String, Type> links = new HashMap<>();

    public static final String COMPONENTS_LINK = "components";
    public static final String POLICY_STATUS_LINK = "policy-status";
    public static final String RISKPROFILE_LINK = "riskProfile";
    public static final String CODELOCATIONS_LINK = "codelocations";
    public static final String LICENSEREPORTS_LINK = "licenseReports";
    public static final String PROJECT_LINK = "project";
    public static final String VULNERABLE_COMPONENTS_LINK = "vulnerable-components";
    public static final String VERSIONREPORT_LINK = "versionReport";

    static {
            links.put(COMPONENTS_LINK, new TypeToken<ArrayList<VersionBomComponentView>>() {}.getType());
            links.put(POLICY_STATUS_LINK, VersionBomPolicyStatusView.class);
            links.put(RISKPROFILE_LINK, VersionRiskProfileView.class);
            links.put(CODELOCATIONS_LINK, new TypeToken<ArrayList<CodeLocationView>>() {}.getType());
            links.put(LICENSEREPORTS_LINK, new TypeToken<ArrayList<ReportView>>() {}.getType());
            links.put(PROJECT_LINK, ProjectView.class);
            links.put(VULNERABLE_COMPONENTS_LINK, new TypeToken<ArrayList<VulnerableComponentView>>() {}.getType());
            links.put(VERSIONREPORT_LINK, new TypeToken<ArrayList<ReportView>>() {}.getType());
    }

    public ProjectVersionDistributionType distribution;
    public ComplexLicenseView license;
    public String nickname;
    public ProjectVersionPhaseType phase;
    public String releaseComments;
    public java.util.Date releasedOn;
    public OriginSourceType source;
    public String versionName;

}
