/*
 * blackduck-common-api
 *
 * Copyright (c) 2023 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.synopsys.integration.blackduck.api.generated.deprecated.component;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.generated.enumeration.CweCommonConsequencesScopesType;

// CweCommonConsequenceView from the previous API is now called CweCommonConsequencesView
// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
@Deprecated
public class CweCommonConsequenceView extends BlackDuckComponent {
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
