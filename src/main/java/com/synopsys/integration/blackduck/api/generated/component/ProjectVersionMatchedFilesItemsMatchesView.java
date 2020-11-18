package com.synopsys.integration.blackduck.api.generated.component;

import java.math.BigDecimal;
import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.generated.enumeration.MatchType;

/**
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public class ProjectVersionMatchedFilesItemsMatchesView extends BlackDuckComponent {
    private java.util.List<MatchType> matchType;
    private String component;
    private String snippet;
    private BigDecimal matchConfidencePercentage;

    public java.util.List<MatchType> getMatchType() {
	    return matchType;
    }

    public void setMatchType(java.util.List<MatchType> matchType) {
	    this.matchType = matchType;
    }

    public String getComponent() {
	    return component;
    }

    public void setComponent(String component) {
	    this.component = component;
    }

    public String getSnippet() {
	    return snippet;
    }

    public void setSnippet(String snippet) {
	    this.snippet = snippet;
    }

    public BigDecimal getMatchConfidencePercentage() {
	    return matchConfidencePercentage;
    }

    public void setMatchConfidencePercentage(BigDecimal matchConfidencePercentage) {
	    this.matchConfidencePercentage = matchConfidencePercentage;
    }

}
