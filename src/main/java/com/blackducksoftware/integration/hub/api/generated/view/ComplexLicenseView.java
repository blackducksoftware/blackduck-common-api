package com.blackducksoftware.integration.hub.api.generated.view;

import com.blackducksoftware.integration.hub.api.HubView;
import com.blackducksoftware.integration.hub.api.generated.enumeration.ComplexLicenseType;
import com.blackducksoftware.integration.hub.api.generated.enumeration.LicenseCodeSharingType;
import com.blackducksoftware.integration.hub.api.generated.enumeration.LicenseOwnershipType;
import com.blackducksoftware.integration.hub.api.generated.view.ComplexLicenseView;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ComplexLicenseView extends HubView {
    public LicenseCodeSharingType codeSharing;
    public String license;
    public String licenseDisplay;
    public java.util.List<ComplexLicenseView> licenses;
    public String name;
    public LicenseOwnershipType ownership;
    public ComplexLicenseType type;

}
