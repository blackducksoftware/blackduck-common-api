/*
 * blackduck-common-api
 *
 * Copyright (c) 2024 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.blackduck.integration.blackduck.api.generated.component;

import java.math.BigDecimal;
import com.blackduck.integration.blackduck.api.core.BlackDuckComponent;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class TokenTokensTokenView extends BlackDuckComponent {
    private java.util.Date createdAt;
    private String description;
    private java.util.Date lastGeneratedAt;
    private String lastUsed;
    private String name;
    private TokenTokensTokenOwnerView owner;
    private java.util.List<String> scopes;
    private java.util.Date updatedAt;
    private BigDecimal usageCount;

    public java.util.Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public java.util.Date getLastGeneratedAt() {
        return lastGeneratedAt;
    }

    public void setLastGeneratedAt(java.util.Date lastGeneratedAt) {
        this.lastGeneratedAt = lastGeneratedAt;
    }

    public String getLastUsed() {
        return lastUsed;
    }

    public void setLastUsed(String lastUsed) {
        this.lastUsed = lastUsed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TokenTokensTokenOwnerView getOwner() {
        return owner;
    }

    public void setOwner(TokenTokensTokenOwnerView owner) {
        this.owner = owner;
    }

    public java.util.List<String> getScopes() {
        return scopes;
    }

    public void setScopes(java.util.List<String> scopes) {
        this.scopes = scopes;
    }

    public java.util.Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public BigDecimal getUsageCount() {
        return usageCount;
    }

    public void setUsageCount(BigDecimal usageCount) {
        this.usageCount = usageCount;
    }

}
