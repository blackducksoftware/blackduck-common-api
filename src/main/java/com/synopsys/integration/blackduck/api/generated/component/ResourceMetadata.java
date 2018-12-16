package com.synopsys.integration.blackduck.api.generated.component;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.generated.component.ResourceLink;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ResourceMetadata extends BlackDuckComponent {
    private java.util.List<String> allow;
    private String href;
    private java.util.List<ResourceLink> links;

    public java.util.List<String> getAllow() {
        return allow;
    }

    public void setAllow(java.util.List<String> allow) {
        this.allow = allow;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public java.util.List<ResourceLink> getLinks() {
        return links;
    }

    public void setLinks(java.util.List<ResourceLink> links) {
        this.links = links;
    }

}
