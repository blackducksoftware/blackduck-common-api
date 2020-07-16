package com.synopsys.integration.blackduck.api.generated.view;

import java.util.HashMap;
import java.util.Map;
import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import com.synopsys.integration.blackduck.api.core.response.LinkResponse;
import com.synopsys.integration.blackduck.api.core.response.LinkSingleResponse;
import com.synopsys.integration.blackduck.api.generated.view.UserView;

/**
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public class RoleAssignmentView extends RoleAssignmentViewV4 {
	public static final Map<String, LinkResponse> links = new HashMap<>();

    public static final String USER_LINK = "user";

	public static final LinkSingleResponse<UserView> USER_LINK_RESPONSE = new LinkSingleResponse<UserView>(USER_LINK, UserView.class);

    static {
	    links.put(USER_LINK, USER_LINK_RESPONSE);
    }

}
