package com.synopsys.integration.blackduck.api.generated.component;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.generated.component.AssignedRoleInternalView;
import com.synopsys.integration.blackduck.api.generated.component.AssignedUserGroup;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class AssignedInheritedProjectInternalView extends BlackDuckComponent {
    private java.util.List<AssignedUserGroup> assignedGroups;
    private String assignment;
    private String name;
    private String project;
    private java.util.List<AssignedRoleInternalView> roles;

    public java.util.List<AssignedUserGroup> getAssignedGroups() {
        return assignedGroups;
    }

    public void setAssignedGroups(java.util.List<AssignedUserGroup> assignedGroups) {
        this.assignedGroups = assignedGroups;
    }

    public String getAssignment() {
        return assignment;
    }

    public void setAssignment(String assignment) {
        this.assignment = assignment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public java.util.List<AssignedRoleInternalView> getRoles() {
        return roles;
    }

    public void setRoles(java.util.List<AssignedRoleInternalView> roles) {
        this.roles = roles;
    }

}
