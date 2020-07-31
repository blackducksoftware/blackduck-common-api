package com.synopsys.integration.blackduck.api.generated.view;

import java.util.HashMap;
import java.util.Map;
import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import com.synopsys.integration.blackduck.api.core.response.LinkMultipleResponses;
import com.synopsys.integration.blackduck.api.core.response.LinkResponse;
import com.synopsys.integration.blackduck.api.generated.response.UserProjectsView;
import com.synopsys.integration.blackduck.api.generated.view.RoleAssignmentView;
import com.synopsys.integration.blackduck.api.manual.view.NotificationUserView;

/**
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public class UserViewV4 extends BlackDuckView {
	public static final Map<String, LinkResponse> links = new HashMap<>();

    public static final String INHERITED_ROLES_LINK = "inherited-roles";
    public static final String NOTIFICATIONS_LINK = "notifications";
    public static final String PROJECTS_LINK = "projects";
    public static final String ROLES_LINK = "roles";

	public static final LinkMultipleResponses<RoleAssignmentView> INHERITED_ROLES_LINK_RESPONSE = new LinkMultipleResponses<RoleAssignmentView>(INHERITED_ROLES_LINK, RoleAssignmentView.class);
	public static final LinkMultipleResponses<NotificationUserView> NOTIFICATIONS_LINK_RESPONSE = new LinkMultipleResponses<NotificationUserView>(NOTIFICATIONS_LINK, NotificationUserView.class);
	public static final LinkMultipleResponses<UserProjectsView> PROJECTS_LINK_RESPONSE = new LinkMultipleResponses<UserProjectsView>(PROJECTS_LINK, UserProjectsView.class);
	public static final LinkMultipleResponses<RoleAssignmentView> ROLES_LINK_RESPONSE = new LinkMultipleResponses<RoleAssignmentView>(ROLES_LINK, RoleAssignmentView.class);

    static {
	    links.put(INHERITED_ROLES_LINK, INHERITED_ROLES_LINK_RESPONSE);
	    links.put(NOTIFICATIONS_LINK, NOTIFICATIONS_LINK_RESPONSE);
	    links.put(PROJECTS_LINK, PROJECTS_LINK_RESPONSE);
	    links.put(ROLES_LINK, ROLES_LINK_RESPONSE);
    }

    private String firstName;
    private String userName;
    private String user;
    private String lastName;
    private String externalUserName;
    private Boolean active;
    private String email;
    private String type;

    public String getFirstName() {
	    return firstName;
    }

    public void setFirstName(String firstName) {
	    this.firstName = firstName;
    }

    public String getUserName() {
	    return userName;
    }

    public void setUserName(String userName) {
	    this.userName = userName;
    }

    public String getUser() {
	    return user;
    }

    public void setUser(String user) {
	    this.user = user;
    }

    public String getLastName() {
	    return lastName;
    }

    public void setLastName(String lastName) {
	    this.lastName = lastName;
    }

    public String getExternalUserName() {
	    return externalUserName;
    }

    public void setExternalUserName(String externalUserName) {
	    this.externalUserName = externalUserName;
    }

    public Boolean getActive() {
	    return active;
    }

    public void setActive(Boolean active) {
	    this.active = active;
    }

    public String getEmail() {
	    return email;
    }

    public void setEmail(String email) {
	    this.email = email;
    }

    public String getType() {
	    return type;
    }

    public void setType(String type) {
	    this.type = type;
    }

}
