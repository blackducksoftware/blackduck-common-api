package com.blackducksoftware.integration.hub.api.generated.view;

import java.util.HashMap;
import java.util.Map;

import com.blackducksoftware.integration.hub.api.core.HubView;
import com.blackducksoftware.integration.hub.api.core.LinkResponse;
import com.blackducksoftware.integration.hub.api.core.LinkSingleResponse;
import com.blackducksoftware.integration.hub.api.generated.enumeration.MatchedFileUsagesType;
import com.blackducksoftware.integration.hub.api.generated.model.CompositePathWithArchiveContext;
import com.blackducksoftware.integration.hub.api.generated.view.CodeLocationView;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class MatchedFileView extends HubView {
    public static final Map<String, LinkResponse> links = new HashMap<>();

    public static final String CODELOCATIONS_LINK = "codelocations";

    public static final LinkSingleResponse<CodeLocationView> CODELOCATIONS_LINK_RESPONSE = new LinkSingleResponse<CodeLocationView>(CODELOCATIONS_LINK, CodeLocationView.class);

    static {
            links.put(CODELOCATIONS_LINK, CODELOCATIONS_LINK_RESPONSE);
    }

    public CompositePathWithArchiveContext filePath;
    public java.util.List<MatchedFileUsagesType> usages;

}
