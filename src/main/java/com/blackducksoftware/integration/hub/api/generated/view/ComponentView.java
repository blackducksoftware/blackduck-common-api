package com.blackducksoftware.integration.hub.api.generated.view;

import java.util.HashMap;
import java.util.Map;

import com.blackducksoftware.integration.hub.api.core.HubView;
import com.blackducksoftware.integration.hub.api.core.LinkMultipleResponses;
import com.blackducksoftware.integration.hub.api.core.LinkResponse;
import com.blackducksoftware.integration.hub.api.generated.enumeration.OriginSourceType;
import com.blackducksoftware.integration.hub.api.generated.view.ComponentVersionView;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ComponentView extends HubView {
    public static final Map<String, LinkResponse> links = new HashMap<>();

    public static final String VERSIONS_LINK = "versions";

    public static final LinkMultipleResponses<ComponentVersionView> VERSIONS_LINK_RESPONSE = new LinkMultipleResponses<ComponentVersionView>(VERSIONS_LINK, ComponentVersionView.class);

    static {
            links.put(VERSIONS_LINK, VERSIONS_LINK_RESPONSE);
    }

    public String description;
    public String name;
    public OriginSourceType source;

}
