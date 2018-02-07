package com.blackducksoftware.integration.hub.api.generated.view;

import java.util.HashMap;
import java.util.Map;

import com.blackducksoftware.integration.hub.api.core.HubView;
import com.blackducksoftware.integration.hub.api.core.LinkResponse;
import com.blackducksoftware.integration.hub.api.core.LinkSingleResponse;
import com.blackducksoftware.integration.hub.api.generated.view.UserView;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class RoleAssignmentView extends HubView {
    public static final Map<String, LinkResponse> links = new HashMap<>();

    public static final String USER_LINK = "user";

    public static final LinkSingleResponse USER_LINK_RESPONSE = new LinkSingleResponse(USER_LINK, UserView.class);

    static {
            links.put(USER_LINK, USER_LINK_RESPONSE);
    }

    public String description;
    public String name;
    public String role;

}
