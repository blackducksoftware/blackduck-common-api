/*
 * blackduck-common-api
 *
 * Copyright (c) 2021 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.synopsys.integration.blackduck.api.generated.component;

import java.util.Optional;
import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.core.response.LinkBlackDuckResponse;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class SsoConfigurationView extends BlackDuckComponent {
    private Boolean groupSynchronizationEnabled;
    private Boolean idpMetadataFileUploaded;
    private String idpMetadataUrl;
    private Boolean localLogoutEnabled;
    private String samlMetadataUrl;
    private String spEntityId;
    private String spExternalUrl;
    private Boolean ssoEnabled;
    private Boolean userCreationEnabled;

    public Boolean getGroupSynchronizationEnabled() {
        return groupSynchronizationEnabled;
    }

    public void setGroupSynchronizationEnabled(Boolean groupSynchronizationEnabled) {
        this.groupSynchronizationEnabled = groupSynchronizationEnabled;
    }

    public Boolean getIdpMetadataFileUploaded() {
        return idpMetadataFileUploaded;
    }

    public void setIdpMetadataFileUploaded(Boolean idpMetadataFileUploaded) {
        this.idpMetadataFileUploaded = idpMetadataFileUploaded;
    }

    public String getIdpMetadataUrl() {
        return idpMetadataUrl;
    }

    public void setIdpMetadataUrl(String idpMetadataUrl) {
        this.idpMetadataUrl = idpMetadataUrl;
    }

    public Boolean getLocalLogoutEnabled() {
        return localLogoutEnabled;
    }

    public void setLocalLogoutEnabled(Boolean localLogoutEnabled) {
        this.localLogoutEnabled = localLogoutEnabled;
    }

    public String getSamlMetadataUrl() {
        return samlMetadataUrl;
    }

    public void setSamlMetadataUrl(String samlMetadataUrl) {
        this.samlMetadataUrl = samlMetadataUrl;
    }

    public String getSpEntityId() {
        return spEntityId;
    }

    public void setSpEntityId(String spEntityId) {
        this.spEntityId = spEntityId;
    }

    public String getSpExternalUrl() {
        return spExternalUrl;
    }

    public void setSpExternalUrl(String spExternalUrl) {
        this.spExternalUrl = spExternalUrl;
    }

    public Boolean getSsoEnabled() {
        return ssoEnabled;
    }

    public void setSsoEnabled(Boolean ssoEnabled) {
        this.ssoEnabled = ssoEnabled;
    }

    public Boolean getUserCreationEnabled() {
        return userCreationEnabled;
    }

    public void setUserCreationEnabled(Boolean userCreationEnabled) {
        this.userCreationEnabled = userCreationEnabled;
    }

}
