/*
 * blackduck-common-api
 *
 * Copyright (c) 2022 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.synopsys.integration.blackduck.api.manual.component;

import com.synopsys.integration.blackduck.api.manual.enumeration.LicenseLimitType;

public class LicenseLimitNotificationContent extends NotificationContentComponent {
    private LicenseLimitType licenseViolationType;
    private String message;
    private String marketingPageUrl;
    private Long usedCodeSize;
    private Long hardLimit;
    private Long softLimit;

    public LicenseLimitType getLicenseViolationType() {
        return licenseViolationType;
    }

    public void setLicenseViolationType(LicenseLimitType licenseViolationType) {
        this.licenseViolationType = licenseViolationType;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMarketingPageUrl() {
        return marketingPageUrl;
    }

    public void setMarketingPageUrl(String marketingPageUrl) {
        this.marketingPageUrl = marketingPageUrl;
    }

    public Long getUsedCodeSize() {
        return usedCodeSize;
    }

    public void setUsedCodeSize(Long usedCodeSize) {
        this.usedCodeSize = usedCodeSize;
    }

    public Long getHardLimit() {
        return hardLimit;
    }

    public void setHardLimit(Long hardLimit) {
        this.hardLimit = hardLimit;
    }

    public Long getSoftLimit() {
        return softLimit;
    }

    public void setSoftLimit(Long softLimit) {
        this.softLimit = softLimit;
    }

}
