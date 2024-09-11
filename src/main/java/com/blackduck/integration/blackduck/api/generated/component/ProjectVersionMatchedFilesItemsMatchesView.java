/*
 * blackduck-common-api
 *
 * Copyright (c) 2024 Black Duck Software, Inc.
 *
 * Use subject to the terms and conditions of the Black Duck Software End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.blackduck.integration.blackduck.api.generated.component;

import java.math.BigDecimal;
import com.blackduck.integration.blackduck.api.core.BlackDuckComponent;
import com.blackduck.integration.blackduck.api.generated.enumeration.MatchType;
import com.blackduck.integration.blackduck.api.generated.enumeration.ProjectVersionMatchedFilesItemsMatchesMatchTypeFilterValueType;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ProjectVersionMatchedFilesItemsMatchesView extends BlackDuckComponent {
    private String component;
    private BigDecimal matchConfidencePercentage;
    private java.util.List<MatchType> matchType;
    private ProjectVersionMatchedFilesItemsMatchesMatchTypeFilterValueType matchTypeFilterValue;
    private String snippet;

    public String getComponent() {
        return component;
    }

    public void setComponent(String component) {
        this.component = component;
    }

    public BigDecimal getMatchConfidencePercentage() {
        return matchConfidencePercentage;
    }

    public void setMatchConfidencePercentage(BigDecimal matchConfidencePercentage) {
        this.matchConfidencePercentage = matchConfidencePercentage;
    }

    public java.util.List<MatchType> getMatchType() {
        return matchType;
    }

    public void setMatchType(java.util.List<MatchType> matchType) {
        this.matchType = matchType;
    }

    public ProjectVersionMatchedFilesItemsMatchesMatchTypeFilterValueType getMatchTypeFilterValue() {
        return matchTypeFilterValue;
    }

    public void setMatchTypeFilterValue(ProjectVersionMatchedFilesItemsMatchesMatchTypeFilterValueType matchTypeFilterValue) {
        this.matchTypeFilterValue = matchTypeFilterValue;
    }

    public String getSnippet() {
        return snippet;
    }

    public void setSnippet(String snippet) {
        this.snippet = snippet;
    }

}
