package com.synopsys.integration.blackduck.api.generated.response;

import com.synopsys.integration.blackduck.api.core.BlackDuckResponse;

/**
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public class UserGroupProjectsView extends BlackDuckResponse {
    private String project;
    private String name;
    private String assignment;

    public String getProject() {
	    return project;
    }

    public void setProject(String project) {
	    this.project = project;
    }

    public String getName() {
	    return name;
    }

    public void setName(String name) {
	    this.name = name;
    }

    public String getAssignment() {
	    return assignment;
    }

    public void setAssignment(String assignment) {
	    this.assignment = assignment;
    }

}
