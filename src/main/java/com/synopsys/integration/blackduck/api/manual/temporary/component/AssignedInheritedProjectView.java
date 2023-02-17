/*
 * blackduck-common-api
 *
 * Copyright (c) 2023 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.synopsys.integration.blackduck.api.manual.temporary.component;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class AssignedInheritedProjectView extends BlackDuckComponent {
    private java.util.List<AssignedUserGroup> assignedGroups;
    private String assignment;
    private String name;
    private String project;

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

}
