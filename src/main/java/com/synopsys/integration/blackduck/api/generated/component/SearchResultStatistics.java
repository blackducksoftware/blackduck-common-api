package com.synopsys.integration.blackduck.api.generated.component;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class SearchResultStatistics extends BlackDuckComponent {
    private Long numResultsFound;
    private Integer numResultsInThisPage;
    private Long timeTakenMs;

    public Long getNumResultsFound() {
        return numResultsFound;
    }

    public void setNumResultsFound(Long numResultsFound) {
        this.numResultsFound = numResultsFound;
    }

    public Integer getNumResultsInThisPage() {
        return numResultsInThisPage;
    }

    public void setNumResultsInThisPage(Integer numResultsInThisPage) {
        this.numResultsInThisPage = numResultsInThisPage;
    }

    public Long getTimeTakenMs() {
        return timeTakenMs;
    }

    public void setTimeTakenMs(Long timeTakenMs) {
        this.timeTakenMs = timeTakenMs;
    }

}
