package com.blackducksoftware.integration.hub.api.generated.view;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import com.blackducksoftware.integration.hub.api.HubView;
import com.blackducksoftware.integration.hub.api.generated.enumeration.LicenseCodeSharing;
import com.blackducksoftware.integration.hub.api.generated.enumeration.LicenseOwnership;
import com.blackducksoftware.integration.hub.api.generated.enumeration.LicenseSource;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class LicenseView extends HubView {
    public static final Map<String, Type> links = new HashMap<>();

    public static final String TEXT_LINK = "text";

    static {
            links.put(TEXT_LINK, String.class);
    }

    public LicenseCodeSharing codeSharing;
    public java.util.Date createdAt;
    public String createdBy;
    public String createdByUser;
    public LicenseSource licenseSource;
    public String name;
    public LicenseOwnership ownership;
    public java.util.Date updatedAt;
    public String updatedBy;
    public String updatedByUser;

}
