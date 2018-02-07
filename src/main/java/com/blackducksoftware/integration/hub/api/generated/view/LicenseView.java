package com.blackducksoftware.integration.hub.api.generated.view;

import java.util.HashMap;
import java.util.Map;

import com.blackducksoftware.integration.hub.api.core.HubView;
import com.blackducksoftware.integration.hub.api.core.LinkResponse;
import com.blackducksoftware.integration.hub.api.core.LinkStringResponse;
import com.blackducksoftware.integration.hub.api.generated.enumeration.LicenseCodeSharingType;
import com.blackducksoftware.integration.hub.api.generated.enumeration.LicenseOwnershipType;
import com.blackducksoftware.integration.hub.api.generated.enumeration.LicenseSourceType;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class LicenseView extends HubView {
    public static final Map<String, LinkResponse> links = new HashMap<>();

    public static final String TEXT_LINK = "text";

    public static final LinkStringResponse TEXT_LINK_RESPONSE = new LinkStringResponse(TEXT_LINK, String.class);

    static {
            links.put(TEXT_LINK, TEXT_LINK_RESPONSE);
    }

    public LicenseCodeSharingType codeSharing;
    public java.util.Date createdAt;
    public String createdBy;
    public String createdByUser;
    public LicenseSourceType licenseSource;
    public String name;
    public LicenseOwnershipType ownership;
    public java.util.Date updatedAt;
    public String updatedBy;
    public String updatedByUser;

}
