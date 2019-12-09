package com.synopsys.integration.blackduck.api.generated.response;

import java.util.List;
import com.synopsys.integration.blackduck.api.core.BlackDuckResponse;
import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import java.util.Optional;
import com.synopsys.integration.blackduck.api.generated.component.CweCommonConsequencesView;

/**
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public class CweViewV4 extends BlackDuckResponse {
	public static final String mediaType = "application/vnd.blackducksoftware.vulnerability-4+json";

    private String id;
    private String description;
    private String name;
    private String extendedDescription;
    private java.util.List<CweCommonConsequencesView> commonConsequences;

    public String getId() {
	return id;
    }

    public void setId(String id) {
	this.id = id;
    }

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

    public String getExtendedDescription() {
	return extendedDescription;
    }

    public void setExtendedDescription(String extendedDescription) {
	this.extendedDescription = extendedDescription;
    }

    public java.util.List<CweCommonConsequencesView> getCommonConsequences() {
	return commonConsequences;
    }

    public void setCommonConsequences(java.util.List<CweCommonConsequencesView> commonConsequences) {
	this.commonConsequences = commonConsequences;
    }


    public String getMediaType() {
	return mediaType;
    }

}
