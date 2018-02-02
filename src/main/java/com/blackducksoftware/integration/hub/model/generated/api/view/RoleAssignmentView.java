package com.blackducksoftware.integration.hub.model.generated.api.view;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import com.blackducksoftware.integration.hub.model.HubView;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class RoleAssignmentView extends HubView {
    public static final Map<String, Type> links = new HashMap<>();

    public static final String USER_LINK = "user";

    static {
        links.put(USER_LINK, UserView.class);
    }

    public String description;
    public String name;
    public String role;

}
