package com.synopsys.integration.blackduck.api.generated.view;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import com.synopsys.integration.blackduck.api.core.response.LinkResponse;
import com.synopsys.integration.blackduck.api.core.response.LinkStringResponse;
import com.synopsys.integration.blackduck.api.generated.enumeration.LicenseReportsReportReportFormatType;
import com.synopsys.integration.blackduck.api.generated.enumeration.LicenseReportsReportReportType;

/**
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public class ReportView extends ReportViewV4 {
	public static final Map<String, LinkResponse> links = new HashMap<>();

    public static final String CONTENT_LINK = "content";

	public static final LinkStringResponse CONTENT_LINK_RESPONSE = new LinkStringResponse(CONTENT_LINK, String.class);

    static {
	    links.put(CONTENT_LINK, CONTENT_LINK_RESPONSE);
    }

}
