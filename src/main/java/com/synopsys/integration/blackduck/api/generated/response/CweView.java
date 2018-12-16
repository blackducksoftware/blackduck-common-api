package com.synopsys.integration.blackduck.api.generated.response;

import com.synopsys.integration.blackduck.api.core.BlackDuckResponse;
import com.synopsys.integration.blackduck.api.generated.component.CweCommonConsequenceView;

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
