/*
 * blackduck-common-api
 *
 * Copyright (c) 2021 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.synopsys.integration.blackduck.api.manual.temporary.component;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;

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
