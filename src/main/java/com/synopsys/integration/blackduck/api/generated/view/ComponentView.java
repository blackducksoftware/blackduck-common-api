package com.synopsys.integration.blackduck.api.generated.view;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import com.synopsys.integration.blackduck.api.core.response.LinkMultipleResponses;
import com.synopsys.integration.blackduck.api.core.response.LinkResponse;
import com.synopsys.integration.blackduck.api.generated.enumeration.ComponentApprovalStatusType;
import com.synopsys.integration.blackduck.api.generated.enumeration.ComponentSourceType;
import com.synopsys.integration.blackduck.api.generated.view.CustomFieldView;
import com.synopsys.integration.blackduck.api.generated.view.TagView;
import com.synopsys.integration.blackduck.api.generated.view.VulnerabilityView;
import com.synopsys.integration.blackduck.api.manual.throwaway.generated.view.ComponentVersionView;

/**
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public class ComponentView extends ComponentViewV4 {
	public static final Map<String, LinkResponse> links = new HashMap<>();

    public static final String CUSTOM_FIELDS_LINK = "custom-fields";
    public static final String TAGS_LINK = "tags";
    public static final String VERSIONS_LINK = "versions";
    public static final String VULNERABILITIES_LINK = "vulnerabilities";

	public static final LinkMultipleResponses<CustomFieldView> CUSTOM_FIELDS_LINK_RESPONSE = new LinkMultipleResponses<CustomFieldView>(CUSTOM_FIELDS_LINK, CustomFieldView.class);
	public static final LinkMultipleResponses<TagView> TAGS_LINK_RESPONSE = new LinkMultipleResponses<TagView>(TAGS_LINK, TagView.class);
	public static final LinkMultipleResponses<ComponentVersionView> VERSIONS_LINK_RESPONSE = new LinkMultipleResponses<ComponentVersionView>(VERSIONS_LINK, ComponentVersionView.class);
	public static final LinkMultipleResponses<VulnerabilityView> VULNERABILITIES_LINK_RESPONSE = new LinkMultipleResponses<VulnerabilityView>(VULNERABILITIES_LINK, VulnerabilityView.class);

    static {
	    links.put(CUSTOM_FIELDS_LINK, CUSTOM_FIELDS_LINK_RESPONSE);
	    links.put(TAGS_LINK, TAGS_LINK_RESPONSE);
	    links.put(VERSIONS_LINK, VERSIONS_LINK_RESPONSE);
	    links.put(VULNERABILITIES_LINK, VULNERABILITIES_LINK_RESPONSE);
    }

}
