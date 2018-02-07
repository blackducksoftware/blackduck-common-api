package com.blackducksoftware.integration.hub.api.generated.view;

import java.util.HashMap;
import java.util.Map;

import com.blackducksoftware.integration.hub.api.core.HubView;
import com.blackducksoftware.integration.hub.api.core.LinkMultipleResponses;
import com.blackducksoftware.integration.hub.api.core.LinkResponse;
import com.blackducksoftware.integration.hub.api.core.LinkSingleResponse;
import com.blackducksoftware.integration.hub.api.generated.enumeration.OriginSourceType;
import com.blackducksoftware.integration.hub.api.generated.response.ComponentVersionReferenceView;
import com.blackducksoftware.integration.hub.api.generated.response.ComponentVersionRiskView;
import com.blackducksoftware.integration.hub.api.generated.view.ComplexLicenseView;
import com.blackducksoftware.integration.hub.api.generated.view.ComponentView;
import com.blackducksoftware.integration.hub.api.generated.view.OriginView;
import com.blackducksoftware.integration.hub.api.generated.view.VulnerabilityV2View;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ComponentVersionView extends HubView {
    public static final Map<String, LinkResponse> links = new HashMap<>();

    public static final String COMPONENT_LINK = "component";
    public static final String REFERENCES_LINK = "references";
    public static final String ORIGINS_LINK = "origins";
    public static final String VULNERABILITIES_LINK = "vulnerabilities";
    public static final String RISK_PROFILE_LINK = "risk-profile";

    public static final LinkSingleResponse<ComponentView> COMPONENT_LINK_RESPONSE = new LinkSingleResponse<ComponentView>(COMPONENT_LINK, ComponentView.class);
    public static final LinkMultipleResponses<ComponentVersionReferenceView> REFERENCES_LINK_RESPONSE = new LinkMultipleResponses<ComponentVersionReferenceView>(REFERENCES_LINK, ComponentVersionReferenceView.class);
    public static final LinkMultipleResponses<OriginView> ORIGINS_LINK_RESPONSE = new LinkMultipleResponses<OriginView>(ORIGINS_LINK, OriginView.class);
    public static final LinkMultipleResponses<VulnerabilityV2View> VULNERABILITIES_LINK_RESPONSE = new LinkMultipleResponses<VulnerabilityV2View>(VULNERABILITIES_LINK, VulnerabilityV2View.class);
    public static final LinkSingleResponse<ComponentVersionRiskView> RISK_PROFILE_LINK_RESPONSE = new LinkSingleResponse<ComponentVersionRiskView>(RISK_PROFILE_LINK, ComponentVersionRiskView.class);

    static {
            links.put(COMPONENT_LINK, COMPONENT_LINK_RESPONSE);
            links.put(REFERENCES_LINK, REFERENCES_LINK_RESPONSE);
            links.put(ORIGINS_LINK, ORIGINS_LINK_RESPONSE);
            links.put(VULNERABILITIES_LINK, VULNERABILITIES_LINK_RESPONSE);
            links.put(RISK_PROFILE_LINK, RISK_PROFILE_LINK_RESPONSE);
    }

    public ComplexLicenseView license;
    public java.util.Date releasedOn;
    public OriginSourceType source;
    public String versionName;

}
