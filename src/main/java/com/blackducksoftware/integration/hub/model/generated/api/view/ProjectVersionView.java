package com.blackducksoftware.integration.hub.model.generated.api.view;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.blackducksoftware.integration.hub.model.HubView;
import com.google.gson.reflect.TypeToken;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ProjectVersionView extends HubView {
    public static final Map<String, Type> links = new HashMap<>();

    public static final String COMPONENTS_LINK = "components";
    public static final String POLICY_STATUS_LINK = "policy-status";
    public static final String RISKPROFILE_LINK = "riskProfile";
    public static final String CODELOCATIONS_LINK = "codelocations";
    public static final String PROJECT_LINK = "project";
    public static final String VULNERABLE_COMPONENTS_LINK = "vulnerable-components";

    static {
        links.put(COMPONENTS_LINK, new TypeToken<ArrayList<VersionBomComponentView>>() {}.getType());
        links.put(POLICY_STATUS_LINK, VersionBomPolicyStatusView.class);
        links.put(RISKPROFILE_LINK, VersionRiskProfileView.class);
        links.put(CODELOCATIONS_LINK, new TypeToken<ArrayList<CodeLocationView>>() {}.getType());
        links.put(PROJECT_LINK, ProjectView.class);
        links.put(VULNERABLE_COMPONENTS_LINK, new TypeToken<ArrayList<VulnerableComponentView>>() {}.getType());
    }

    public com.blackducksoftware.integration.hub.model.generated.api.enumeration.ProjectVersionDistributionEnum distribution;
    public ComplexLicenseView license;
    public String nickname;
    public com.blackducksoftware.integration.hub.model.generated.api.enumeration.ProjectVersionPhaseEnum phase;
    public String releaseComments;
    public java.util.Date releasedOn;
    public com.blackducksoftware.integration.hub.model.generated.api.enumeration.ProjectVersionSourceEnum source;
    public String versionName;

}
