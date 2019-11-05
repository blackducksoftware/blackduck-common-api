package com.synopsys.integration.blackduck.api.generated.view;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import com.synopsys.integration.blackduck.api.generated.component.LicenseLicenseFamilyView;
import com.synopsys.integration.blackduck.api.generated.enumeration.LicenseLicenseSourceType;
import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.core.LinkResponse;
import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import com.synopsys.integration.blackduck.api.generated.enumeration.LicenseLicenseStatusType;
import java.util.Optional;
import com.synopsys.integration.blackduck.api.core.LinkStringResponse;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class LicenseViewV5 extends BlackDuckView {
	public static final String mediaType = "application/vnd.blackducksoftware.component-detail-5+json";

	public static final Map<String, LinkResponse> links = new HashMap<>();
        public static final String TEXT_LINK = "text";

	public static final LinkStringResponse TEXT_LINK_RESPONSE = new LinkStringResponse(TEXT_LINK, String.class);

    static {
	links.put(TEXT_LINK, TEXT_LINK_RESPONSE);
    }

    private String name;
    private String expirationDate;
    private String notes;
    private LicenseLicenseStatusType licenseStatus;
    private LicenseLicenseFamilyView licenseFamily;
    private LicenseLicenseSourceType licenseSource;

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public String getExpirationDate() {
	return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
	this.expirationDate = expirationDate;
    }

    public String getNotes() {
	return notes;
    }

    public void setNotes(String notes) {
	this.notes = notes;
    }

    public LicenseLicenseStatusType getLicenseStatus() {
	return licenseStatus;
    }

    public void setLicenseStatus(LicenseLicenseStatusType licenseStatus) {
	this.licenseStatus = licenseStatus;
    }

    public LicenseLicenseFamilyView getLicenseFamily() {
	return licenseFamily;
    }

    public void setLicenseFamily(LicenseLicenseFamilyView licenseFamily) {
	this.licenseFamily = licenseFamily;
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
