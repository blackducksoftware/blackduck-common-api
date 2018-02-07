package com.blackducksoftware.integration.hub.api.generated.view;

import java.util.HashMap;
import java.util.Map;

import com.blackducksoftware.integration.hub.api.core.HubView;
import com.blackducksoftware.integration.hub.api.core.LinkMultipleResponses;
import com.blackducksoftware.integration.hub.api.core.LinkResponse;
import com.blackducksoftware.integration.hub.api.generated.enumeration.UserGroupCreatedFromType;
import com.blackducksoftware.integration.hub.api.generated.response.AssignedProjectView;
import com.blackducksoftware.integration.hub.api.generated.view.RoleAssignmentView;
import com.blackducksoftware.integration.hub.api.generated.view.UserView;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class UserGroupView extends HubView {
    public static final Map<String, LinkResponse> links = new HashMap<>();

    public static final String PROJECTS_LINK = "projects";
    public static final String ROLES_LINK = "roles";
    public static final String USERS_LINK = "users";

    public static final LinkMultipleResponses PROJECTS_LINK_RESPONSE = new LinkMultipleResponses(PROJECTS_LINK, AssignedProjectView.class);
    public static final LinkMultipleResponses ROLES_LINK_RESPONSE = new LinkMultipleResponses(ROLES_LINK, RoleAssignmentView.class);
    public static final LinkMultipleResponses USERS_LINK_RESPONSE = new LinkMultipleResponses(USERS_LINK, UserView.class);

    static {
            links.put(PROJECTS_LINK, PROJECTS_LINK_RESPONSE);
            links.put(ROLES_LINK, ROLES_LINK_RESPONSE);
            links.put(USERS_LINK, USERS_LINK_RESPONSE);
    }

    public Boolean active;
    public UserGroupCreatedFromType createdFrom;
    public String externalName;
    public String name;
    public String userGroup;

}
