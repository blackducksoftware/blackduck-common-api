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
package com.synopsys.integration.blackduck.api.generated.response;

import com.synopsys.integration.blackduck.api.core.BlackDuckResponse;
import com.synopsys.integration.blackduck.api.core.BlackDuckView;

@Deprecated
/**
* CustomFieldTypeView is now called TypesView
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public class CustomFieldTypeView extends BlackDuckResponse {
	public static final String mediaType = "application/vnd.blackducksoftware.admin-4+json";

    private Boolean supportsOptions;
    private String name;
    private String type;

    public Boolean getSupportsOptions() {
	return supportsOptions;
    }

    public void setSupportsOptions(Boolean supportsOptions) {
	this.supportsOptions = supportsOptions;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public String getType() {
	return type;
    }

    public void setType(String type) {
	this.type = type;
    }


    public String getMediaType() {
	return mediaType;
    }

}
