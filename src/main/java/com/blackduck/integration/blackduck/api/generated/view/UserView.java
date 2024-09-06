/*
 * blackduck-common-api
 *
 * Copyright (c) 2024 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.blackduck.integration.blackduck.api.generated.view;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import com.blackduck.integration.blackduck.api.generated.response.AssignedProjectView;
import com.blackduck.integration.blackduck.api.core.BlackDuckView;
import com.blackduck.integration.blackduck.api.core.response.LinkBlackDuckResponse;
import com.blackduck.integration.blackduck.api.core.response.LinkMultipleResponses;
import com.blackduck.integration.blackduck.api.core.response.UrlMultipleResponses;
import com.blackduck.integration.blackduck.api.manual.view.NotificationUserView;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class UserView extends BlackDuckView {
    public static final Map<String, LinkBlackDuckResponse> links = new HashMap<>();

    public static final String INHERITED_ROLES_LINK = "inherited-roles";
    public static final String NOTIFICATIONS_LINK = "notifications";
    public static final String PROJECTS_LINK = "projects";
    public static final String ROLES_LINK = "roles";
    public static final String USERGROUPS_LINK = "usergroups";

    public static final LinkMultipleResponses<RoleAssignmentView> INHERITED_ROLES_LINK_RESPONSE = new LinkMultipleResponses<RoleAssignmentView>(INHERITED_ROLES_LINK, RoleAssignmentView.class);
    public static final LinkMultipleResponses<NotificationUserView> NOTIFICATIONS_LINK_RESPONSE = new LinkMultipleResponses<NotificationUserView>(NOTIFICATIONS_LINK, NotificationUserView.class);
    public static final LinkMultipleResponses<AssignedProjectView> PROJECTS_LINK_RESPONSE = new LinkMultipleResponses<AssignedProjectView>(PROJECTS_LINK, AssignedProjectView.class);
    public static final LinkMultipleResponses<RoleAssignmentView> ROLES_LINK_RESPONSE = new LinkMultipleResponses<RoleAssignmentView>(ROLES_LINK, RoleAssignmentView.class);
    public static final LinkMultipleResponses<UserGroupView> USERGROUPS_LINK_RESPONSE = new LinkMultipleResponses<UserGroupView>(USERGROUPS_LINK, UserGroupView.class);

    static {
        links.put(INHERITED_ROLES_LINK, INHERITED_ROLES_LINK_RESPONSE);
        links.put(NOTIFICATIONS_LINK, NOTIFICATIONS_LINK_RESPONSE);
        links.put(PROJECTS_LINK, PROJECTS_LINK_RESPONSE);
        links.put(ROLES_LINK, ROLES_LINK_RESPONSE);
        links.put(USERGROUPS_LINK, USERGROUPS_LINK_RESPONSE);
    }

    private Boolean active;
    private String email;
    private String externalUserName;
    private String firstName;
    private String lastName;
    private String type;
    private String userName;

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

    public String getExternalUserName() {
        return externalUserName;
    }

    public void setExternalUserName(String externalUserName) {
        this.externalUserName = externalUserName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public UrlMultipleResponses<RoleAssignmentView> metaInheritedRolesLink() {
        return metaMultipleResponses(INHERITED_ROLES_LINK_RESPONSE);
    }

    public Optional<UrlMultipleResponses<RoleAssignmentView>> metaInheritedRolesLinkSafely() {
        return metaMultipleResponsesSafely(INHERITED_ROLES_LINK_RESPONSE);
    }

    public UrlMultipleResponses<NotificationUserView> metaNotificationsLink() {
        return metaMultipleResponses(NOTIFICATIONS_LINK_RESPONSE);
    }

    public Optional<UrlMultipleResponses<NotificationUserView>> metaNotificationsLinkSafely() {
        return metaMultipleResponsesSafely(NOTIFICATIONS_LINK_RESPONSE);
    }

    public UrlMultipleResponses<AssignedProjectView> metaProjectsLink() {
        return metaMultipleResponses(PROJECTS_LINK_RESPONSE);
    }

    public Optional<UrlMultipleResponses<AssignedProjectView>> metaProjectsLinkSafely() {
        return metaMultipleResponsesSafely(PROJECTS_LINK_RESPONSE);
    }

    public UrlMultipleResponses<RoleAssignmentView> metaRolesLink() {
        return metaMultipleResponses(ROLES_LINK_RESPONSE);
    }

    public Optional<UrlMultipleResponses<RoleAssignmentView>> metaRolesLinkSafely() {
        return metaMultipleResponsesSafely(ROLES_LINK_RESPONSE);
    }

    public UrlMultipleResponses<UserGroupView> metaUsergroupsLink() {
        return metaMultipleResponses(USERGROUPS_LINK_RESPONSE);
    }

    public Optional<UrlMultipleResponses<UserGroupView>> metaUsergroupsLinkSafely() {
        return metaMultipleResponsesSafely(USERGROUPS_LINK_RESPONSE);
    }

}
