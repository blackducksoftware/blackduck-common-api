package com.blackducksoftware.integration.hub.api.generated.view;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.blackducksoftware.integration.hub.api.HubView;
import com.blackducksoftware.integration.hub.api.generated.enumeration.UserGroupCreatedFromEnum;
import com.blackducksoftware.integration.hub.api.generated.response.AssignedProjectView;
import com.blackducksoftware.integration.hub.api.generated.view.RoleAssignmentView;
import com.blackducksoftware.integration.hub.api.generated.view.UserView;
import com.google.gson.reflect.TypeToken;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class UserGroupView extends HubView {
    public static final Map<String, Type> links = new HashMap<>();

    public static final String PROJECTS_LINK = "projects";
    public static final String ROLES_LINK = "roles";
    public static final String USERS_LINK = "users";

    static {
            links.put(PROJECTS_LINK, new TypeToken<ArrayList<AssignedProjectView>>() {}.getType());
            links.put(ROLES_LINK, new TypeToken<ArrayList<RoleAssignmentView>>() {}.getType());
            links.put(USERS_LINK, new TypeToken<ArrayList<UserView>>() {}.getType());
    }

    public Boolean active;
    public UserGroupCreatedFromEnum createdFrom;
    public String externalName;
    public String name;
    public String userGroup;

}
