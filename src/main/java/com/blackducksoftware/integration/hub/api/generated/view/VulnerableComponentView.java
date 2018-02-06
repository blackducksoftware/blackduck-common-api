package com.blackducksoftware.integration.hub.api.generated.view;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.blackducksoftware.integration.hub.api.core.HubView;
import com.blackducksoftware.integration.hub.api.generated.view.ComplexLicenseView;
import com.blackducksoftware.integration.hub.api.generated.view.MatchedFileView;
import com.blackducksoftware.integration.hub.api.generated.view.VulnerabilityV2View;
import com.blackducksoftware.integration.hub.api.generated.view.VulnerabilityWithRemediationView;
import com.google.gson.reflect.TypeToken;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class VulnerableComponentView extends HubView {
    public static final Map<String, Type> links = new HashMap<>();

    public static final String MATCHED_FILES_LINK = "matched-files";
    public static final String VULNERABILITIES_LINK = "vulnerabilities";

    static {
            links.put(MATCHED_FILES_LINK, new TypeToken<ArrayList<MatchedFileView>>() {}.getType());
            links.put(VULNERABILITIES_LINK, new TypeToken<ArrayList<VulnerabilityV2View>>() {}.getType());
    }

    public String component;
    public String componentName;
    public String componentVersion;
    public String componentVersionName;
    public String componentVersionOriginId;
    public String componentVersionOriginName;
    public ComplexLicenseView license;
    public VulnerabilityWithRemediationView vulnerabilityWithRemediation;

}
