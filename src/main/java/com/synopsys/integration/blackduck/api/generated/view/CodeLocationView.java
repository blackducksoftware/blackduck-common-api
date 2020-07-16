package com.synopsys.integration.blackduck.api.generated.view;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import com.synopsys.integration.blackduck.api.core.response.LinkResponse;
import com.synopsys.integration.blackduck.api.core.response.LinkStringResponse;

/**
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public class CodeLocationView extends CodeLocationViewV4 {
	public static final Map<String, LinkResponse> links = new HashMap<>();

    public static final String SCANS_LINK = "scans";

	public static final LinkStringResponse SCANS_LINK_RESPONSE = new LinkStringResponse(SCANS_LINK, String.class);

    static {
	    links.put(SCANS_LINK, SCANS_LINK_RESPONSE);
    }

}
