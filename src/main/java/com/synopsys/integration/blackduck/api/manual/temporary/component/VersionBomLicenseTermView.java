/*
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
package com.synopsys.integration.blackduck.api.manual.temporary.component;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.generated.component.ComponentVersionLicenseLicensesLicenseFamilySummaryView;
import com.synopsys.integration.blackduck.api.generated.enumeration.LicenseResponsibilityType;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class VersionBomLicenseTermView extends BlackDuckComponent {
    private ComponentVersionLicenseLicensesLicenseFamilySummaryView category;
    private Boolean fulfilled;
    private String name;
    private LicenseResponsibilityType responsibility;

    public ComponentVersionLicenseLicensesLicenseFamilySummaryView getCategory() {
        return category;
    }

    public void setCategory(ComponentVersionLicenseLicensesLicenseFamilySummaryView category) {
        this.category = category;
    }

    public Boolean getFulfilled() {
        return fulfilled;
    }

    public void setFulfilled(Boolean fulfilled) {
        this.fulfilled = fulfilled;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LicenseResponsibilityType getResponsibility() {
        return responsibility;
    }

    public void setResponsibility(LicenseResponsibilityType responsibility) {
        this.responsibility = responsibility;
    }

}
