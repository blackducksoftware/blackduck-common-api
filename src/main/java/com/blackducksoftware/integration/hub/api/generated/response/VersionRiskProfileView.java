package com.blackducksoftware.integration.hub.api.generated.response;

import java.util.HashMap;
import java.util.Map;

import com.blackducksoftware.integration.hub.api.core.HubResponse;
import com.blackducksoftware.integration.hub.api.core.LinkResponse;
import com.blackducksoftware.integration.hub.api.core.LinkSingleResponse;
import com.blackducksoftware.integration.hub.api.generated.view.ProjectVersionView;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class VersionRiskProfileView extends HubResponse {
    public static final Map<String, LinkResponse> links = new HashMap<>();

    public static final String VERSION_LINK = "version";

    public static final LinkSingleResponse VERSION_LINK_RESPONSE = new LinkSingleResponse(VERSION_LINK, ProjectVersionView.class);

    static {
            links.put(VERSION_LINK, VERSION_LINK_RESPONSE);
    }

    public java.util.Date bomLastUpdatedAt;
    public String categories;

}
