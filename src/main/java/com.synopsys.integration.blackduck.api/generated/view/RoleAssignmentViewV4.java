package com.synopsys.integration.blackduck.api.generated.view;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import com.synopsys.integration.blackduck.api.core.LinkSingleResponse;
import com.synopsys.integration.blackduck.api.core.LinkResponse;
import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import com.synopsys.integration.blackduck.api.generated.view.UserView;

/**
* RoleAssignmentViewV4 is now called UserRoleAssignmentView
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public class RoleAssignmentViewV4 extends BlackDuckView {
	public static final String mediaType = "application/vnd.blackducksoftware.user-4+json";

	public static final Map<String, LinkResponse> links = new HashMap<>();
        public static final String USER_LINK = "user";

	public static final LinkSingleResponse<UserView> USER_LINK_RESPONSE = new LinkSingleResponse<UserView>(USER_LINK, UserView.class);

    static {
	links.put(USER_LINK, USER_LINK_RESPONSE);
    }

    private String scope;
    private String name;
    private String role;
    private String description;

    public String getScope() {
	return scope;
    }

    public void setScope(String scope) {
	this.scope = scope;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public String getRole() {
	return role;
    }

    public void setRole(String role) {
	this.role = role;
    }

    public String getDescription() {
	return description;
    }

    public void setDescription(String description) {
	this.description = description;
    }


    public String getMediaType() {
	return mediaType;
    }

}
