package com.blackducksoftware.integration.hub.model.generated.api.view;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.blackducksoftware.integration.hub.model.HubView;
import com.google.gson.reflect.TypeToken;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class UserView extends HubView {
    public static final Map<String, Type> links = new HashMap<>();

    public static final String PROJECTS_LINK = "projects";
    public static final String INHERITED_ROLES_LINK = "inherited-roles";
    public static final String ROLES_LINK = "roles";
    public static final String NOTIFICATIONS_LINK = "notifications";

    static {
        links.put(PROJECTS_LINK, new TypeToken<ArrayList<AssignedProjectView>>() {}.getType());
        links.put(INHERITED_ROLES_LINK, new TypeToken<ArrayList<RoleAssignmentView>>() {}.getType());
        links.put(ROLES_LINK, new TypeToken<ArrayList<RoleAssignmentView>>() {}.getType());
        links.put(NOTIFICATIONS_LINK, new TypeToken<ArrayList<NotificationUserView>>() {}.getType());
    }

    public Boolean active;
    public String email;
    public String externalUserName;
    public String firstName;
    public String lastName;
    public String type;
    public String user;
    public String userName;

}
