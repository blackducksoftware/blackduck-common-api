/**
 * blackduck-common-api
 *
 * Copyright (c) 2021 Synopsys, Inc.
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
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
