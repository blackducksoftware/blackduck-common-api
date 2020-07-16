package com.synopsys.integration.blackduck.api.generated.view;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import com.synopsys.integration.blackduck.api.core.response.LinkMultipleResponses;
import com.synopsys.integration.blackduck.api.core.response.LinkResponse;
import com.synopsys.integration.blackduck.api.generated.view.UserView;

/**
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public class UserGroupView extends UserGroupViewV4 {
	public static final Map<String, LinkResponse> links = new HashMap<>();

    public static final String USERS_LINK = "users";

	public static final LinkMultipleResponses<UserView> USERS_LINK_RESPONSE = new LinkMultipleResponses<UserView>(USERS_LINK, UserView.class);

    static {
	    links.put(USERS_LINK, USERS_LINK_RESPONSE);
    }

}
