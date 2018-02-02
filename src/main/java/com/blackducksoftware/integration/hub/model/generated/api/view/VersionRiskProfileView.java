package com.blackducksoftware.integration.hub.model.generated.api.view;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import com.blackducksoftware.integration.hub.model.HubModel;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class VersionRiskProfileView extends HubModel {
    public static final Map<String, Type> links = new HashMap<>();

    public static final String VERSION_LINK = "version";

    static {
        links.put(VERSION_LINK, ProjectVersionView.class);
    }

    public java.util.Date bomLastUpdatedAt;
    public String categories;

}
