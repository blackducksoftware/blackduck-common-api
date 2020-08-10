package com.synopsys.integration.blackduck.api.generated.response;

import java.util.Optional;
import com.synopsys.integration.blackduck.api.core.BlackDuckResponse;
import com.synopsys.integration.blackduck.api.core.BlackDuckView;

/**
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public class UserGroupProjectsViewV4 extends BlackDuckResponse {
    private String project;
    private String assignment;
    private String name;

    public String getProject() {
	    return project;
    }

    public void setProject(String project) {
	    this.project = project;
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

}
