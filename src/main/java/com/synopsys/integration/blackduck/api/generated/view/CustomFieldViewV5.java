/**
 * blackduck-common-api
 *
 * Copyright (c) 2020 Synopsys, Inc.
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

import java.math.BigDecimal;
import java.util.List;
import com.synopsys.integration.blackduck.api.generated.enumeration.CustomFieldTypeType;
import com.synopsys.integration.blackduck.api.core.LinkResponse;
import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import java.util.Optional;

/**
* CustomFieldViewV5 is now called FieldsCustomFieldView
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public class CustomFieldViewV5 extends BlackDuckView {
	public static final String mediaType = "application/vnd.blackducksoftware.project-detail-5+json";

    private java.util.List<String> values;
    private CustomFieldTypeType type;
    private BigDecimal position;
    private String description;
    private Boolean active;
    private String label;

    public java.util.List<String> getValues() {
	return values;
    }

    public void setValues(java.util.List<String> values) {
	this.values = values;
    }

    public CustomFieldTypeType getType() {
	return type;
    }

    public void setType(CustomFieldTypeType type) {
	this.type = type;
    }

    public BigDecimal getPosition() {
	return position;
    }

    public void setPosition(BigDecimal position) {
	this.position = position;
    }

    public String getDescription() {
	return description;
    }

    public void setDescription(String description) {
	this.description = description;
    }

    public Boolean getActive() {
	return active;
    }

    public void setActive(Boolean active) {
	this.active = active;
    }

    public String getLabel() {
	return label;
    }

    public void setLabel(String label) {
	this.label = label;
    }


    public String getMediaType() {
	return mediaType;
    }

}
