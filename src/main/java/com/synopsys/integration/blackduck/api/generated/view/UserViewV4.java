package com.synopsys.integration.blackduck.api.generated.view;

import com.synopsys.integration.blackduck.api.core.BlackDuckView;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class UserViewV4 extends BlackDuckView {
    private String firstName;
    private String lastName;
    private Boolean active;
    private Object _meta;
    private String userName;
    private String type;
    private String user;
    private String externalUserName;
    private String email;
    private String mediaType = "application/vnd.blackducksoftware.user-4+json";

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

    public String getUserName() {
    return userName;
    }

    public void setUserName(String userName) {
    this.userName = userName;
    }

    public String getType() {
    return type;
    }

    public void setType(String type) {
    this.type = type;
    }

    public String getUser() {
    return user;
    }

    public void setUser(String user) {
    this.user = user;
    }

    public String getExternalUserName() {
    return externalUserName;
    }

    public void setExternalUserName(String externalUserName) {
    this.externalUserName = externalUserName;
    }

    public String getEmail() {
    return email;
    }

    public void setEmail(String email) {
    this.email = email;
    }

	public String getMediaType() {
	return mediaType;
	}

}
