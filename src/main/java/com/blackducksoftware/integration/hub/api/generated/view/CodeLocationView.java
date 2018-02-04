package com.blackducksoftware.integration.hub.api.generated.view;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.blackducksoftware.integration.hub.api.HubView;
import com.blackducksoftware.integration.hub.api.generated.enumeration.CodeLocationEnum;
import com.google.gson.reflect.TypeToken;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class CodeLocationView extends HubView {
    public static final Map<String, Type> links = new HashMap<>();

    public static final String SCANS_LINK = "scans";

    static {
            links.put(SCANS_LINK, new TypeToken<ArrayList<String>>() {}.getType());
    }

    public java.util.Date createdAt;
    public String mappedProjectVersion;
    public String name;
    public CodeLocationEnum type;
    public java.util.Date updatedAt;
    public String url;

}