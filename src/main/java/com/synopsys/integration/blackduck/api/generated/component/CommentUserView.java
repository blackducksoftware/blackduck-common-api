package com.synopsys.integration.blackduck.api.generated.component;

import java.util.Optional;
import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;

/**
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public class CommentUserView extends BlackDuckComponent {
    private String firstName;
    private String email;
    private String lastName;
    private Boolean active;
    private String userName;

    public String getFirstName() {
	    return firstName;
    }

    public void setFirstName(String firstName) {
	    this.firstName = firstName;
    }

    public String getEmail() {
	    return email;
    }

    public void setEmail(String email) {
	    this.email = email;
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

    public String getUserName() {
	    return userName;
    }

    public void setUserName(String userName) {
	    this.userName = userName;
    }

}
