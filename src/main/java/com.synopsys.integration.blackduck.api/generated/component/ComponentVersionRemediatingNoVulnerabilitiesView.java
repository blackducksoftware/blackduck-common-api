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
package com.synopsys.integration.blackduck.api.generated.component;

import java.math.BigDecimal;
import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import java.util.Optional;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ComponentVersionRemediatingNoVulnerabilitiesView extends BlackDuckComponent {
	public static final String mediaType = "application/vnd.blackducksoftware.component-detail-5+json";

    private BigDecimal vulnerabilityCount;
    private String releasedOn;
    private String name;
    private String componentVersion;

    public BigDecimal getVulnerabilityCount() {
	return vulnerabilityCount;
    }

    public void setVulnerabilityCount(BigDecimal vulnerabilityCount) {
	this.vulnerabilityCount = vulnerabilityCount;
    }

    public String getReleasedOn() {
	return releasedOn;
    }

    public void setReleasedOn(String releasedOn) {
	this.releasedOn = releasedOn;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public String getComponentVersion() {
	return componentVersion;
    }

    public void setComponentVersion(String componentVersion) {
	this.componentVersion = componentVersion;
    }


    public String getMediaType() {
	return mediaType;
    }

}
