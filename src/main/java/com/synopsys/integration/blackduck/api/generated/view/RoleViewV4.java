package com.synopsys.integration.blackduck.api.generated.view;

import com.synopsys.integration.blackduck.api.core.BlackDuckView;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class RoleViewV4 extends BlackDuckView {
    private String name;
    private String description;
    private Object _meta;
    private String mediaType = "application/vnd.blackducksoftware.user-4+json";

    public String getName() {
    return name;
    }

    public void setName(String name) {
    this.name = name;
    }

    public String getDescription() {
    return description;
    }

    public void setDescription(String description) {
    this.description = description;
    }

    public Object get_meta() {
    return _meta;
    }

    public void set_meta(Object _meta) {
    this._meta = _meta;
    }

	public String getMediaType() {
	return mediaType;
	}

}
