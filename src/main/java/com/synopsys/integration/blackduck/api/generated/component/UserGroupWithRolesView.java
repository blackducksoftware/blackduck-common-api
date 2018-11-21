package com.synopsys.integration.blackduck.api.generated.component;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.generated.enumeration.UserGroupCreatedFromType;
import com.synopsys.integration.blackduck.api.generated.view.RoleAssignmentView;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class UserGroupWithRolesView extends BlackDuckComponent {
    private Boolean active;
    private UserGroupCreatedFromType createdFrom;
    private String externalName;
    private String name;
    private java.util.List<RoleAssignmentView> roles;
    private String userGroup;

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public UserGroupCreatedFromType getCreatedFrom() {
        return createdFrom;
    }

    public void setCreatedFrom(UserGroupCreatedFromType createdFrom) {
        this.createdFrom = createdFrom;
    }

    public String getExternalName() {
        return externalName;
    }

    public void setExternalName(String externalName) {
        this.externalName = externalName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public java.util.List<RoleAssignmentView> getRoles() {
        return roles;
    }

    public void setRoles(java.util.List<RoleAssignmentView> roles) {
        this.roles = roles;
    }

    public String getUserGroup() {
        return userGroup;
    }

    public void setUserGroup(String userGroup) {
        this.userGroup = userGroup;
    }

}
