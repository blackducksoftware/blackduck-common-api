package com.blackducksoftware.integration.hub.api.generated.view;

import java.util.HashMap;
import java.util.Map;

import com.blackducksoftware.integration.hub.api.core.HubView;
import com.blackducksoftware.integration.hub.api.core.LinkResponse;
import com.blackducksoftware.integration.hub.api.core.LinkStringResponse;
import com.blackducksoftware.integration.hub.api.generated.enumeration.CodeLocationType;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class CodeLocationView extends HubView {
    public static final Map<String, LinkResponse> links = new HashMap<>();

    public static final String SCANS_LINK = "scans";

    public static final LinkStringResponse SCANS_LINK_RESPONSE = new LinkStringResponse(SCANS_LINK, String.class);

    static {
            links.put(SCANS_LINK, SCANS_LINK_RESPONSE);
    }

    public java.util.Date createdAt;
    public String mappedProjectVersion;
    public String name;
    public CodeLocationType type;
    public java.util.Date updatedAt;
    public String url;

}
