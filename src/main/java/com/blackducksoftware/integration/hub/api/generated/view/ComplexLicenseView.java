package com.blackducksoftware.integration.hub.api.generated.view;

import com.blackducksoftware.integration.hub.api.HubView;
import com.blackducksoftware.integration.hub.api.generated.enumeration.ComplexLicenseCodeSharingEnum;
import com.blackducksoftware.integration.hub.api.generated.enumeration.ComplexLicenseEnum;
import com.blackducksoftware.integration.hub.api.generated.enumeration.ComplexLicenseOwnershipEnum;
import com.blackducksoftware.integration.hub.api.generated.view.ComplexLicenseView;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ComplexLicenseView extends HubView {
    public ComplexLicenseCodeSharingEnum codeSharing;
    public String license;
    public String licenseDisplay;
    public java.util.List<ComplexLicenseView> licenses;
    public String name;
    public ComplexLicenseOwnershipEnum ownership;
    public ComplexLicenseEnum type;

}
