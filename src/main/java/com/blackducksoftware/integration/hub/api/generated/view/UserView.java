package com.blackducksoftware.integration.hub.api.generated.view;

import java.util.HashMap;
import java.util.Map;

import com.blackducksoftware.integration.hub.api.core.HubView;
import com.blackducksoftware.integration.hub.api.core.LinkMultipleResponses;
import com.blackducksoftware.integration.hub.api.core.LinkResponse;
import com.blackducksoftware.integration.hub.api.generated.response.AssignedProjectView;
import com.blackducksoftware.integration.hub.api.generated.view.NotificationUserView;
import com.blackducksoftware.integration.hub.api.generated.view.RoleAssignmentView;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class UserView extends HubView {
    public static final Map<String, LinkResponse> links = new HashMap<>();

    public static final String PROJECTS_LINK = "projects";
    public static final String INHERITED_ROLES_LINK = "inherited-roles";
    public static final String ROLES_LINK = "roles";
    public static final String NOTIFICATIONS_LINK = "notifications";

    public static final LinkMultipleResponses PROJECTS_LINK_RESPONSE = new LinkMultipleResponses(PROJECTS_LINK, AssignedProjectView.class);
    public static final LinkMultipleResponses INHERITED_ROLES_LINK_RESPONSE = new LinkMultipleResponses(INHERITED_ROLES_LINK, RoleAssignmentView.class);
    public static final LinkMultipleResponses ROLES_LINK_RESPONSE = new LinkMultipleResponses(ROLES_LINK, RoleAssignmentView.class);
    public static final LinkMultipleResponses NOTIFICATIONS_LINK_RESPONSE = new LinkMultipleResponses(NOTIFICATIONS_LINK, NotificationUserView.class);

    static {
            links.put(PROJECTS_LINK, PROJECTS_LINK_RESPONSE);
            links.put(INHERITED_ROLES_LINK, INHERITED_ROLES_LINK_RESPONSE);
            links.put(ROLES_LINK, ROLES_LINK_RESPONSE);
            links.put(NOTIFICATIONS_LINK, NOTIFICATIONS_LINK_RESPONSE);
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
