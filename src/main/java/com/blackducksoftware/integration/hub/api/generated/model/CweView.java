package com.blackducksoftware.integration.hub.api.generated.model;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import com.blackducksoftware.integration.hub.api.HubModel;
import com.blackducksoftware.integration.hub.api.generated.model.CweCommonConsequenceView;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class CweView extends HubModel {
    public static final Map<String, Type> links = new HashMap<>();

    public static final String SOURCES_LINK = "sources";

    static {
    }

    public java.util.List<CweCommonConsequenceView> commonConsequences;
    public String description;
    public String extendedDescription;
    public String id;
    public String name;

}
