/**
 * blackduck-common-api
 *
 * Copyright (c) 2019 Synopsys, Inc.
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
package com.synopsys.integration.blackduck.api.generated.view;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import com.synopsys.integration.blackduck.api.generated.enumeration.LicenseTermResponsibilityType;
import java.util.Optional;
import com.synopsys.integration.blackduck.api.generated.enumeration.LicenseTermAssociationSourceType;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class LicenseTermViewV5 extends BlackDuckView {
	public static final String mediaType = "application/vnd.blackducksoftware.component-detail-5+json";

    private LicenseTermResponsibilityType responsibility;
    private String description;
    private String name;
    private Boolean fulfillmentRequired;
    private LicenseTermAssociationSourceType associationSource;
    private Boolean deactivated;

    public LicenseTermResponsibilityType getResponsibility() {
	return responsibility;
    }

    public void setResponsibility(LicenseTermResponsibilityType responsibility) {
	this.responsibility = responsibility;
    }

    public String getDescription() {
	return description;
    }

    public void setDescription(String description) {
	this.description = description;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public Boolean getFulfillmentRequired() {
	return fulfillmentRequired;
    }

    public void setFulfillmentRequired(Boolean fulfillmentRequired) {
	this.fulfillmentRequired = fulfillmentRequired;
    }

    public LicenseTermAssociationSourceType getAssociationSource() {
	return associationSource;
    }

    public void setAssociationSource(LicenseTermAssociationSourceType associationSource) {
	this.associationSource = associationSource;
    }

    public Boolean getDeactivated() {
	return deactivated;
    }

    public void setDeactivated(Boolean deactivated) {
	this.deactivated = deactivated;
    }


    public String getMediaType() {
	return mediaType;
    }

}
