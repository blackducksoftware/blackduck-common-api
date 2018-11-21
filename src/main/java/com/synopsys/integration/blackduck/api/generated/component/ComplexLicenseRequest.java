package com.synopsys.integration.blackduck.api.generated.component;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.generated.component.ComplexLicenseRequest;
import com.synopsys.integration.blackduck.api.generated.enumeration.ComplexLicenseType;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ComplexLicenseRequest extends BlackDuckComponent {
    private String license;
    private java.util.List<ComplexLicenseRequest> licenses;
    private ComplexLicenseType type;

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public java.util.List<ComplexLicenseRequest> getLicenses() {
        return licenses;
    }

    public void setLicenses(java.util.List<ComplexLicenseRequest> licenses) {
        this.licenses = licenses;
    }

    public ComplexLicenseType getType() {
        return type;
    }

    public void setType(ComplexLicenseType type) {
        this.type = type;
    }

}
