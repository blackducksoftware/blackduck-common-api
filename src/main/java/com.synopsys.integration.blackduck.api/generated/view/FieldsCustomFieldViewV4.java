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

import java.math.BigDecimal;
import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.core.LinkResponse;
import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import java.util.Optional;
import com.synopsys.integration.blackduck.api.generated.enumeration.FieldsCustomFieldTypeType;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class FieldsCustomFieldViewV4 extends BlackDuckView {
	public static final String mediaType = "application/vnd.blackducksoftware.admin-4+json";

    private String label;
    private String updatedAt;
    private BigDecimal position;
    private Object createdBy;
    private Object updatedBy;
    private String description;
    private FieldsCustomFieldTypeType type;
    private Boolean active;
    private String createdAt;

    public String getLabel() {
	return label;
    }

    public void setLabel(String label) {
	this.label = label;
    }

    public String getUpdatedAt() {
	return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
	this.updatedAt = updatedAt;
    }

    public BigDecimal getPosition() {
	return position;
    }

    public void setPosition(BigDecimal position) {
	this.position = position;
    }

    public Object getCreatedBy() {
	return createdBy;
    }

    public void setCreatedBy(Object createdBy) {
	this.createdBy = createdBy;
    }

    public Object getUpdatedBy() {
	return updatedBy;
    }

    public void setUpdatedBy(Object updatedBy) {
	this.updatedBy = updatedBy;
    }

    public String getDescription() {
	return description;
    }

    public void setDescription(String description) {
	this.description = description;
    }

    public FieldsCustomFieldTypeType getType() {
	return type;
    }

    public void setType(FieldsCustomFieldTypeType type) {
	this.type = type;
    }

    public Boolean getActive() {
	return active;
    }

    public void setActive(Boolean active) {
	this.active = active;
    }

    public String getCreatedAt() {
	return createdAt;
    }

    public void setCreatedAt(String createdAt) {
	this.createdAt = createdAt;
    }


    public String getMediaType() {
	return mediaType;
    }

}
