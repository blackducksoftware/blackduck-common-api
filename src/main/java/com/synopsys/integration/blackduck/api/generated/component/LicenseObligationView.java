package com.synopsys.integration.blackduck.api.generated.component;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.generated.enumeration.LicenseObligationResponsibilityType;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class LicenseObligationView extends BlackDuckComponent {
    private String name;
    private LicenseObligationResponsibilityType responsibility;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LicenseObligationResponsibilityType getResponsibility() {
        return responsibility;
    }

    public void setResponsibility(LicenseObligationResponsibilityType responsibility) {
        this.responsibility = responsibility;
    }

}
