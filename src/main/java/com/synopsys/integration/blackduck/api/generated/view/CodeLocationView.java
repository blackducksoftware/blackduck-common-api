package com.synopsys.integration.blackduck.api.generated.view;

import java.util.HashMap;
import java.util.Map;

import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import com.synopsys.integration.blackduck.api.core.LinkResponse;
import com.synopsys.integration.blackduck.api.core.LinkStringResponse;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class CodeLocationView extends BlackDuckView {
    public static final Map<String, LinkResponse> links = new HashMap<>();

    public static final String SCANS_LINK = "scans";

    public static final LinkStringResponse SCANS_LINK_RESPONSE = new LinkStringResponse(SCANS_LINK, String.class);

    static {
        links.put(SCANS_LINK, SCANS_LINK_RESPONSE);
    }

    private java.util.Date createdAt;
    private String mappedProjectVersion;
    private String name;
    private Long scanSize;
    private java.util.Date updatedAt;
    private String url;

    public java.util.Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getMappedProjectVersion() {
        return mappedProjectVersion;
    }

    public void setMappedProjectVersion(String mappedProjectVersion) {
        this.mappedProjectVersion = mappedProjectVersion;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getScanSize() {
        return scanSize;
    }

    public void setScanSize(Long scanSize) {
        this.scanSize = scanSize;
    }

    public java.util.Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
