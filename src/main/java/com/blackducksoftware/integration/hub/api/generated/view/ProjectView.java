package com.blackducksoftware.integration.hub.api.generated.view;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.blackducksoftware.integration.hub.api.HubView;
import com.blackducksoftware.integration.hub.api.generated.enumeration.OriginSourceType;
import com.blackducksoftware.integration.hub.api.generated.response.AssignedUserGroupView;
import com.blackducksoftware.integration.hub.api.generated.view.AssignedUserView;
import com.blackducksoftware.integration.hub.api.generated.view.ProjectVersionView;
import com.google.gson.reflect.TypeToken;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ProjectView extends HubView {
    public static final Map<String, Type> links = new HashMap<>();

    public static final String VERSIONS_LINK = "versions";
    public static final String USERGROUPS_LINK = "usergroups";
    public static final String CANONICALVERSION_LINK = "canonicalVersion";
    public static final String USERS_LINK = "users";

    static {
            links.put(VERSIONS_LINK, new TypeToken<ArrayList<ProjectVersionView>>() {}.getType());
            links.put(USERGROUPS_LINK, new TypeToken<ArrayList<AssignedUserGroupView>>() {}.getType());
            links.put(CANONICALVERSION_LINK, ProjectVersionView.class);
            links.put(USERS_LINK, new TypeToken<ArrayList<AssignedUserView>>() {}.getType());
    }

    public String description;
    public String name;
    public Boolean projectLevelAdjustments;
    public String projectOwner;
    public Integer projectTier;
    public OriginSourceType source;

}
