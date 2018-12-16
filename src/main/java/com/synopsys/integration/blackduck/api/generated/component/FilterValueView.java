package com.synopsys.integration.blackduck.api.generated.component;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.generated.component.FilterValueView;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class FilterValueView extends BlackDuckComponent {
    private String key;
    private String label;
    private java.util.List<FilterValueView> values;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public java.util.List<FilterValueView> getValues() {
        return values;
    }

    public void setValues(java.util.List<FilterValueView> values) {
        this.values = values;
    }

}
