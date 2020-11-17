package com.synopsys.integration.blackduck.api.generated.deprecated.component;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;

@Deprecated
/**
* LicenseFamilySummaryView from the previous API is now called ComponentVersionLicenseLicensesLicenseFamilySummaryView
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public class LicenseFamilySummaryView extends BlackDuckComponent {
    private String name;
    private String href;

    public String getName() {
	    return name;
    }

    public void setName(String name) {
	    this.name = name;
    }

    public String getHref() {
	    return href;
    }

    public void setHref(String href) {
	    this.href = href;
    }

}
