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
package com.synopsys.integration.blackduck.api.generated.component;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.generated.enumeration.CweCommonConsequencesScopesType;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class CweCommonConsequencesView extends BlackDuckComponent {
    private String note;
    private java.util.List<CweCommonConsequencesScopesType> scopes;
    private java.util.List<String> technicalImpacts;

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public java.util.List<CweCommonConsequencesScopesType> getScopes() {
        return scopes;
    }

    public void setScopes(java.util.List<CweCommonConsequencesScopesType> scopes) {
        this.scopes = scopes;
    }

    public java.util.List<String> getTechnicalImpacts() {
        return technicalImpacts;
    }

    public void setTechnicalImpacts(java.util.List<String> technicalImpacts) {
        this.technicalImpacts = technicalImpacts;
    }

}
