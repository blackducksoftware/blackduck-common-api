package com.blackducksoftware.integration.hub.api.generated.view;

import java.util.HashMap;
import java.util.Map;

import com.blackducksoftware.integration.hub.api.core.HubView;
import com.blackducksoftware.integration.hub.api.core.LinkMultipleResponses;
import com.blackducksoftware.integration.hub.api.core.LinkResponse;
import com.blackducksoftware.integration.hub.api.generated.view.ComplexLicenseView;
import com.blackducksoftware.integration.hub.api.generated.view.MatchedFileView;
import com.blackducksoftware.integration.hub.api.generated.view.VulnerabilityV2View;
import com.blackducksoftware.integration.hub.api.generated.view.VulnerabilityWithRemediationView;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class VulnerableComponentView extends HubView {
    public static final Map<String, LinkResponse> links = new HashMap<>();

    public static final String MATCHED_FILES_LINK = "matched-files";
    public static final String VULNERABILITIES_LINK = "vulnerabilities";

    public static final LinkMultipleResponses MATCHED_FILES_LINK_RESPONSE = new LinkMultipleResponses(MATCHED_FILES_LINK, MatchedFileView.class);
    public static final LinkMultipleResponses VULNERABILITIES_LINK_RESPONSE = new LinkMultipleResponses(VULNERABILITIES_LINK, VulnerabilityV2View.class);

    static {
            links.put(MATCHED_FILES_LINK, MATCHED_FILES_LINK_RESPONSE);
            links.put(VULNERABILITIES_LINK, VULNERABILITIES_LINK_RESPONSE);
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
