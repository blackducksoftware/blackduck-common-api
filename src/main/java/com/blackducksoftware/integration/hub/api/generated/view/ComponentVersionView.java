package com.blackducksoftware.integration.hub.api.generated.view;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.blackducksoftware.integration.hub.api.HubView;
import com.blackducksoftware.integration.hub.api.generated.enumeration.OriginSourceType;
import com.blackducksoftware.integration.hub.api.generated.model.ComponentVersionReferenceView;
import com.blackducksoftware.integration.hub.api.generated.model.ComponentVersionRiskView;
import com.blackducksoftware.integration.hub.api.generated.view.ComplexLicenseView;
import com.blackducksoftware.integration.hub.api.generated.view.ComponentView;
import com.blackducksoftware.integration.hub.api.generated.view.OriginView;
import com.blackducksoftware.integration.hub.api.generated.view.VulnerabilityV2View;
import com.google.gson.reflect.TypeToken;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ComponentVersionView extends HubView {
    public static final Map<String, Type> links = new HashMap<>();

    public static final String COMPONENT_LINK = "component";
    public static final String REFERENCES_LINK = "references";
    public static final String ORIGINS_LINK = "origins";
    public static final String VULNERABILITIES_LINK = "vulnerabilities";
    public static final String RISK_PROFILE_LINK = "risk-profile";

    static {
            links.put(COMPONENT_LINK, ComponentView.class);
            links.put(REFERENCES_LINK, new TypeToken<ArrayList<ComponentVersionReferenceView>>() {}.getType());
            links.put(ORIGINS_LINK, new TypeToken<ArrayList<OriginView>>() {}.getType());
            links.put(VULNERABILITIES_LINK, new TypeToken<ArrayList<VulnerabilityV2View>>() {}.getType());
            links.put(RISK_PROFILE_LINK, ComponentVersionRiskView.class);
    }

    public ComplexLicenseView license;
    public java.util.Date releasedOn;
    public OriginSourceType source;
    public String versionName;

}
