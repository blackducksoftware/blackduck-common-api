package com.synopsys.integration.blackduck.api.generated.view;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import com.synopsys.integration.blackduck.api.core.response.LinkMultipleResponses;
import com.synopsys.integration.blackduck.api.core.response.LinkResponse;
import com.synopsys.integration.blackduck.api.generated.component.ComponentVersionRiskProfileActivityDataView;
import com.synopsys.integration.blackduck.api.generated.component.ProjectVersionComponentLicensesView;
import com.synopsys.integration.blackduck.api.generated.component.ProjectVersionComponentReviewedDetailsView;
import com.synopsys.integration.blackduck.api.generated.enumeration.LicenseFamilyLicenseFamilyRiskRulesUsageType;
import com.synopsys.integration.blackduck.api.generated.enumeration.PolicyStatusType;
import com.synopsys.integration.blackduck.api.generated.enumeration.ProjectVersionComparisonItemsComponentMatchTypesType;
import com.synopsys.integration.blackduck.api.generated.enumeration.ProjectVersionComponentReviewStatusType;
import com.synopsys.integration.blackduck.api.generated.view.RiskProfileView;
import com.synopsys.integration.blackduck.api.manual.throwaway.generated.component.VersionBomOriginView;
import com.synopsys.integration.blackduck.api.manual.throwaway.generated.view.OriginView;

/**
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public class ProjectVersionComponentView extends ProjectVersionComponentViewV6 {
	public static final Map<String, LinkResponse> links = new HashMap<>();

    public static final String MATCHED_FILES_LINK = "matched-files";
    public static final String ORIGINS_LINK = "origins";
    public static final String POLICY_RULES_LINK = "policy-rules";

	public static final LinkMultipleResponses<ComponentMatchedFilesView> MATCHED_FILES_LINK_RESPONSE = new LinkMultipleResponses<ComponentMatchedFilesView>(MATCHED_FILES_LINK, ComponentMatchedFilesView.class);
	public static final LinkMultipleResponses<OriginView> ORIGINS_LINK_RESPONSE = new LinkMultipleResponses<OriginView>(ORIGINS_LINK, OriginView.class);
	public static final LinkMultipleResponses<ComponentPolicyRulesView> POLICY_RULES_LINK_RESPONSE = new LinkMultipleResponses<ComponentPolicyRulesView>(POLICY_RULES_LINK, ComponentPolicyRulesView.class);

    static {
	    links.put(MATCHED_FILES_LINK, MATCHED_FILES_LINK_RESPONSE);
	    links.put(ORIGINS_LINK, ORIGINS_LINK_RESPONSE);
	    links.put(POLICY_RULES_LINK, POLICY_RULES_LINK_RESPONSE);
    }

}
