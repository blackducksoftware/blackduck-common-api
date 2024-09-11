/*
 * blackduck-common-api
 *
 * Copyright (c) 2024 Black Duck Software, Inc.
 *
 * Use subject to the terms and conditions of the Black Duck Software End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.blackduck.integration.blackduck.api.manual.temporary.component;

import com.blackduck.integration.blackduck.api.core.BlackDuckComponent;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class SearchResultSpec extends BlackDuckComponent {
    private Integer numResultsInPage;
    private Long rowStart;

    public Integer getNumResultsInPage() {
        return numResultsInPage;
    }

    public void setNumResultsInPage(Integer numResultsInPage) {
        this.numResultsInPage = numResultsInPage;
    }

    public Long getRowStart() {
        return rowStart;
    }

    public void setRowStart(Long rowStart) {
        this.rowStart = rowStart;
    }

}
