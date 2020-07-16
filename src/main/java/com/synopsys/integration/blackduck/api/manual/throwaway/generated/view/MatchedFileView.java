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
package com.synopsys.integration.blackduck.api.manual.throwaway.generated.view;

import java.util.HashMap;
import java.util.Map;

import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import com.synopsys.integration.blackduck.api.core.response.LinkResponse;
import com.synopsys.integration.blackduck.api.core.response.LinkSingleResponse;
import com.synopsys.integration.blackduck.api.manual.throwaway.generated.component.CompositePathWithArchiveContext;
import com.synopsys.integration.blackduck.api.generated.enumeration.LicenseFamilyLicenseFamilyRiskRulesUsageType;
import com.synopsys.integration.blackduck.api.generated.view.CodeLocationView;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class MatchedFileView extends BlackDuckView {
    public static final Map<String, LinkResponse> links = new HashMap<>();

    public static final String CODELOCATIONS_LINK = "codelocations";

    public static final LinkSingleResponse<CodeLocationView> CODELOCATIONS_LINK_RESPONSE = new LinkSingleResponse<CodeLocationView>(CODELOCATIONS_LINK, CodeLocationView.class);

    static {
        links.put(CODELOCATIONS_LINK, CODELOCATIONS_LINK_RESPONSE);
    }

    private CompositePathWithArchiveContext filePath;
    private java.util.List<LicenseFamilyLicenseFamilyRiskRulesUsageType> usages;

    public CompositePathWithArchiveContext getFilePath() {
        return filePath;
    }

    public void setFilePath(CompositePathWithArchiveContext filePath) {
        this.filePath = filePath;
    }

    public java.util.List<LicenseFamilyLicenseFamilyRiskRulesUsageType> getUsages() {
        return usages;
    }

    public void setUsages(java.util.List<LicenseFamilyLicenseFamilyRiskRulesUsageType> usages) {
        this.usages = usages;
    }

}
