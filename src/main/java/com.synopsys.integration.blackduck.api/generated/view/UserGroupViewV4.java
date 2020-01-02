package com.synopsys.integration.blackduck.api.generated.view;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import com.synopsys.integration.blackduck.api.core.LinkResponse;
import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import java.util.Optional;
import com.synopsys.integration.blackduck.api.core.LinkMultipleResponses;
import com.synopsys.integration.blackduck.api.generated.view.UserView;

/**
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public class UserGroupViewV4 extends BlackDuckView {
	public static final String mediaType = "application/vnd.blackducksoftware.user-4+json";

	public static final Map<String, LinkResponse> links = new HashMap<>();
        public static final String USERS_LINK = "users";

	public static final LinkMultipleResponses<UserView> USERS_LINK_RESPONSE = new LinkMultipleResponses<UserView>(USERS_LINK, UserView.class);

    static {
	links.put(USERS_LINK, USERS_LINK_RESPONSE);
    }

    private Boolean active;
    private String userGroup;
    private String externalName;
    private String name;
    private Boolean default_;
    private String createdFrom;

    public Boolean getActive() {
	return active;
    }

    public void setActive(Boolean active) {
	this.active = active;
    }

    public String getUserGroup() {
	return userGroup;
    }

    public void setUserGroup(String userGroup) {
	this.userGroup = userGroup;
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

    public Boolean getDefault_() {
	return default_;
    }

    public void setDefault_(Boolean default_) {
	this.default_ = default_;
    }

    public String getCreatedFrom() {
	return createdFrom;
    }

    public void setCreatedFrom(String createdFrom) {
	this.createdFrom = createdFrom;
    }


    public String getMediaType() {
	return mediaType;
    }

}
