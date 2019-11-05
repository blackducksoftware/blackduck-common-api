package com.synopsys.integration.blackduck.api.generated.view;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import com.synopsys.integration.blackduck.api.generated.enumeration.LicenseLicenseSourceType;
import com.synopsys.integration.blackduck.api.generated.enumeration.LicenseOwnershipType;
import com.synopsys.integration.blackduck.api.generated.enumeration.LicenseCodeSharingType;
import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.core.LinkResponse;
import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import com.synopsys.integration.blackduck.api.generated.enumeration.LicenseLicenseStatusType;
import com.synopsys.integration.blackduck.api.core.LinkStringResponse;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class LicenseViewV4 extends BlackDuckView {
	public static final String mediaType = "application/vnd.blackducksoftware.component-detail-4+json";

	public static final Map<String, LinkResponse> links = new HashMap<>();
        public static final String TEXT_LINK = "text";

	public static final LinkStringResponse TEXT_LINK_RESPONSE = new LinkStringResponse(TEXT_LINK, String.class);

    static {
	links.put(TEXT_LINK, TEXT_LINK_RESPONSE);
    }

    private String name;
    private LicenseOwnershipType ownership;
    private LicenseCodeSharingType codeSharing;
    private LicenseLicenseStatusType licenseStatus;
    private String spdxId;
    private LicenseLicenseSourceType licenseSource;

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public LicenseOwnershipType getOwnership() {
	return ownership;
    }

    public void setOwnership(LicenseOwnershipType ownership) {
	this.ownership = ownership;
    }

    public LicenseCodeSharingType getCodeSharing() {
	return codeSharing;
    }

    public void setCodeSharing(LicenseCodeSharingType codeSharing) {
	this.codeSharing = codeSharing;
    }

    public LicenseLicenseStatusType getLicenseStatus() {
	return licenseStatus;
    }

    public void setLicenseStatus(LicenseLicenseStatusType licenseStatus) {
	this.licenseStatus = licenseStatus;
    }

    public String getSpdxId() {
	return spdxId;
    }

    public void setSpdxId(String spdxId) {
	this.spdxId = spdxId;
    }

    public LicenseLicenseSourceType getLicenseSource() {
	return licenseSource;
    }

    public void setLicenseSource(LicenseLicenseSourceType licenseSource) {
	this.licenseSource = licenseSource;
    }


    public String getMediaType() {
	return mediaType;
    }

}
