package com.synopsys.integration.blackduck.api.generated.view;

import java.util.HashMap;
import java.util.Map;

import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import com.synopsys.integration.blackduck.api.core.LinkMultipleResponses;
import com.synopsys.integration.blackduck.api.core.LinkResponse;
import com.synopsys.integration.blackduck.api.generated.view.UserView;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class RoleView extends BlackDuckView {
    public static final Map<String, LinkResponse> links = new HashMap<>();

    public static final String ROLE_USERS_LINK = "role-users";
    public static final String INHERITED_ROLE_USERS_LINK = "inherited-role-users";

    public static final LinkMultipleResponses<UserView> ROLE_USERS_LINK_RESPONSE = new LinkMultipleResponses<UserView>(ROLE_USERS_LINK, UserView.class);
    public static final LinkMultipleResponses<UserView> INHERITED_ROLE_USERS_LINK_RESPONSE = new LinkMultipleResponses<UserView>(INHERITED_ROLE_USERS_LINK, UserView.class);

    static {
        links.put(ROLE_USERS_LINK, ROLE_USERS_LINK_RESPONSE);
        links.put(INHERITED_ROLE_USERS_LINK, INHERITED_ROLE_USERS_LINK_RESPONSE);
    }

    private String description;
    private String name;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
