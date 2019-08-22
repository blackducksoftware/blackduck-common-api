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
package com.synopsys.integration.blackduck.api.manual.throwaway.generated.response;

import com.synopsys.integration.blackduck.api.core.BlackDuckResponse;
import com.synopsys.integration.blackduck.api.manual.throwaway.generated.component.CweCommonConsequenceView;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class CweView extends BlackDuckResponse {
    public static final String SOURCES_LINK = "sources";


    private java.util.List<CweCommonConsequenceView> commonConsequences;
    private String description;
    private String extendedDescription;
    private String id;
    private String name;

    public java.util.List<CweCommonConsequenceView> getCommonConsequences() {
        return commonConsequences;
    }

    public void setCommonConsequences(java.util.List<CweCommonConsequenceView> commonConsequences) {
        this.commonConsequences = commonConsequences;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getExtendedDescription() {
        return extendedDescription;
    }

    public void setExtendedDescription(String extendedDescription) {
        this.extendedDescription = extendedDescription;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
