package com.synopsys.integration.blackduck.api.manual.throwaway.generated.view;

import java.util.HashMap;
import java.util.Map;

import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import com.synopsys.integration.blackduck.api.core.LinkResponse;
import com.synopsys.integration.blackduck.api.core.LinkSingleResponse;
import com.synopsys.integration.blackduck.api.manual.throwaway.generated.component.CompositePathWithArchiveContext;
import com.synopsys.integration.blackduck.api.manual.throwaway.generated.enumeration.MatchedFileUsagesType;
import com.synopsys.integration.blackduck.api.generated.view.CodeLocationView;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class MatchedFileView extends BlackDuckView {
    public static final Map<String, LinkResponse> links = new HashMap<>();

    public static final String CODELOCATIONS_LINK = "codelocations";

    public static final LinkSingleResponse<CodeLocationView> CODELOCATIONS_LINK_RESPONSE = new LinkSingleResponse<CodeLocationView>(CODELOCATIONS_LINK, CodeLocationView.class);

    static {
        links.put(CODELOCATIONS_LINK, CODELOCATIONS_LINK_RESPONSE);
    }

    private CompositePathWithArchiveContext filePath;
    private java.util.List<MatchedFileUsagesType> usages;

    public CompositePathWithArchiveContext getFilePath() {
        return filePath;
    }

    public void setFilePath(CompositePathWithArchiveContext filePath) {
        this.filePath = filePath;
    }

    public java.util.List<MatchedFileUsagesType> getUsages() {
        return usages;
    }

    public void setUsages(java.util.List<MatchedFileUsagesType> usages) {
        this.usages = usages;
    }

}
