package com.synopsys.integration.blackduck.api.generated.component;

import java.util.List;
import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import java.util.Optional;
import com.synopsys.integration.blackduck.api.generated.enumeration.CweCommonConsequencesScopesType;

/**
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public class CweCommonConsequencesView extends BlackDuckComponent {
	public static final String mediaType = "application/vnd.blackducksoftware.vulnerability-4+json";

    private String note;
    private java.util.List<String> technicalImpacts;
    private java.util.List<CweCommonConsequencesScopesType> scopes;

    public String getNote() {
	return note;
    }

    public void setNote(String note) {
	this.note = note;
    }

    public java.util.List<String> getTechnicalImpacts() {
	return technicalImpacts;
    }

    public void setTechnicalImpacts(java.util.List<String> technicalImpacts) {
	this.technicalImpacts = technicalImpacts;
    }

    public java.util.List<CweCommonConsequencesScopesType> getScopes() {
	return scopes;
    }

    public void setScopes(java.util.List<CweCommonConsequencesScopesType> scopes) {
	this.scopes = scopes;
    }


    public String getMediaType() {
	return mediaType;
    }

}
