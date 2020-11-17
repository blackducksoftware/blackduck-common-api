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
package com.synopsys.integration.blackduck.api.manual.temporary.view;

import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import com.synopsys.integration.blackduck.api.manual.temporary.component.ConfigOptionView;
import com.synopsys.integration.blackduck.api.manual.temporary.enumeration.ExternalExtensionConfigValueOptionType;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ExternalExtensionConfigValueView extends BlackDuckView {
    private String description;
    private String name;
    private ExternalExtensionConfigValueOptionType optionType;
    private java.util.List<ConfigOptionView> options;
    private Boolean required;
    private Boolean singleValue;
    private String title;
    private java.util.List<String> value;

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

    public ExternalExtensionConfigValueOptionType getOptionType() {
        return optionType;
    }

    public void setOptionType(ExternalExtensionConfigValueOptionType optionType) {
        this.optionType = optionType;
    }

    public java.util.List<ConfigOptionView> getOptions() {
        return options;
    }

    public void setOptions(java.util.List<ConfigOptionView> options) {
        this.options = options;
    }

    public Boolean getRequired() {
        return required;
    }

    public void setRequired(Boolean required) {
        this.required = required;
    }

    public Boolean getSingleValue() {
        return singleValue;
    }

    public void setSingleValue(Boolean singleValue) {
        this.singleValue = singleValue;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public java.util.List<String> getValue() {
        return value;
    }

    public void setValue(java.util.List<String> value) {
        this.value = value;
    }

}
