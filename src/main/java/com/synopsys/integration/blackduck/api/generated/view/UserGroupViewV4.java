package com.synopsys.integration.blackduck.api.generated.view;

import com.synopsys.integration.blackduck.api.core.BlackDuckView;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class UserGroupViewV4 extends BlackDuckView {
    private String createdFrom;
    private String externalName;
    private String name;
    private Boolean active;
    private Object _meta;
    private String userGroup;
    private String mediaType = "application/vnd.blackducksoftware.user-4+json";

    public String getCreatedFrom() {
    return createdFrom;
    }

    public void setCreatedFrom(String createdFrom) {
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

    public Boolean getActive() {
    return active;
    }

    public void setActive(Boolean active) {
    this.active = active;
    }

    public Object get_meta() {
    return _meta;
    }

    public void set_meta(Object _meta) {
    this._meta = _meta;
    }

    public String getUserGroup() {
    return userGroup;
    }

    public void setUserGroup(String userGroup) {
    this.userGroup = userGroup;
    }

	public String getMediaType() {
	return mediaType;
	}

}
