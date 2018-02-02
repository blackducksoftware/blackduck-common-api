package com.blackducksoftware.integration.hub.model.generated.api.view;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.blackducksoftware.integration.hub.model.HubView;
import com.google.gson.reflect.TypeToken;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class RoleView extends HubView {
    public static final Map<String, Type> links = new HashMap<>();

    public static final String ROLE_USERS_LINK = "role-users";
    public static final String INHERITED_ROLE_USERS_LINK = "inherited-role-users";

    static {
        links.put(ROLE_USERS_LINK, new TypeToken<ArrayList<UserView>>() {}.getType());
        links.put(INHERITED_ROLE_USERS_LINK, new TypeToken<ArrayList<UserView>>() {}.getType());
    }

    public String description;
    public String name;

}
