/*
 * blackduck-common-api
 *
 * Copyright (c) 2024 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.synopsys.integration.blackduck.api.generated.view;

import java.math.BigDecimal;
import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import com.synopsys.integration.blackduck.api.generated.enumeration.SystemOauthClientGrantTypesType;
import com.synopsys.integration.blackduck.api.generated.enumeration.SystemOauthClientScopesType;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class SystemOauthClientView extends BlackDuckView {
    private BigDecimal accessTokenValiditySeconds;
    private String clientId;
    private java.util.List<SystemOauthClientGrantTypesType> grantTypes;
    private BigDecimal refreshTokenValiditySeconds;
    private java.util.List<String> registeredRedirectUris;
    private java.util.List<SystemOauthClientScopesType> scopes;

    public BigDecimal getAccessTokenValiditySeconds() {
        return accessTokenValiditySeconds;
    }

    public void setAccessTokenValiditySeconds(BigDecimal accessTokenValiditySeconds) {
        this.accessTokenValiditySeconds = accessTokenValiditySeconds;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public java.util.List<SystemOauthClientGrantTypesType> getGrantTypes() {
        return grantTypes;
    }

    public void setGrantTypes(java.util.List<SystemOauthClientGrantTypesType> grantTypes) {
        this.grantTypes = grantTypes;
    }

    public BigDecimal getRefreshTokenValiditySeconds() {
        return refreshTokenValiditySeconds;
    }

    public void setRefreshTokenValiditySeconds(BigDecimal refreshTokenValiditySeconds) {
        this.refreshTokenValiditySeconds = refreshTokenValiditySeconds;
    }

    public java.util.List<String> getRegisteredRedirectUris() {
        return registeredRedirectUris;
    }

    public void setRegisteredRedirectUris(java.util.List<String> registeredRedirectUris) {
        this.registeredRedirectUris = registeredRedirectUris;
    }

    public java.util.List<SystemOauthClientScopesType> getScopes() {
        return scopes;
    }

    public void setScopes(java.util.List<SystemOauthClientScopesType> scopes) {
        this.scopes = scopes;
    }

}
