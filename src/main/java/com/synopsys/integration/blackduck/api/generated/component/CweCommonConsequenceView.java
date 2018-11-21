package com.synopsys.integration.blackduck.api.generated.component;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.generated.enumeration.CweCommonConsequenceScopesType;
import com.synopsys.integration.blackduck.api.generated.enumeration.CweCommonConsequenceTechnicalImpactsType;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class CweCommonConsequenceView extends BlackDuckComponent {
    private String note;
    private java.util.List<CweCommonConsequenceScopesType> scopes;
    private java.util.List<CweCommonConsequenceTechnicalImpactsType> technicalImpacts;

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public java.util.List<CweCommonConsequenceScopesType> getScopes() {
        return scopes;
    }

    public void setScopes(java.util.List<CweCommonConsequenceScopesType> scopes) {
        this.scopes = scopes;
    }

    public java.util.List<CweCommonConsequenceTechnicalImpactsType> getTechnicalImpacts() {
        return technicalImpacts;
    }

    public void setTechnicalImpacts(java.util.List<CweCommonConsequenceTechnicalImpactsType> technicalImpacts) {
        this.technicalImpacts = technicalImpacts;
    }

}
