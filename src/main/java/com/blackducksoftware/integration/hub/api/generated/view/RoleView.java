package com.blackducksoftware.integration.hub.api.generated.view;

import java.util.HashMap;
import java.util.Map;

import com.blackducksoftware.integration.hub.api.core.HubView;
import com.blackducksoftware.integration.hub.api.core.LinkMultipleResponses;
import com.blackducksoftware.integration.hub.api.core.LinkResponse;
import com.blackducksoftware.integration.hub.api.generated.view.UserView;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class RoleView extends HubView {
    public static final Map<String, LinkResponse> links = new HashMap<>();

    public static final String ROLE_USERS_LINK = "role-users";
    public static final String INHERITED_ROLE_USERS_LINK = "inherited-role-users";

    public static final LinkMultipleResponses<UserView> ROLE_USERS_LINK_RESPONSE = new LinkMultipleResponses<UserView>(ROLE_USERS_LINK, UserView.class);
    public static final LinkMultipleResponses<UserView> INHERITED_ROLE_USERS_LINK_RESPONSE = new LinkMultipleResponses<UserView>(INHERITED_ROLE_USERS_LINK, UserView.class);

    static {
            links.put(ROLE_USERS_LINK, ROLE_USERS_LINK_RESPONSE);
            links.put(INHERITED_ROLE_USERS_LINK, INHERITED_ROLE_USERS_LINK_RESPONSE);
    }

    public String description;
    public String name;

}
