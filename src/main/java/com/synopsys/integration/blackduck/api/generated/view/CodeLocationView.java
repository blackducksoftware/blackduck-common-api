package com.synopsys.integration.blackduck.api.generated.view;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import com.synopsys.integration.blackduck.api.core.response.LinkBlackDuckResponse;
import com.synopsys.integration.blackduck.api.core.response.LinkSingleResponse;
import com.synopsys.integration.blackduck.api.core.response.UrlSingleResponse;
import com.synopsys.integration.blackduck.api.manual.response.BlackDuckStringResponse;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class CodeLocationView extends BlackDuckView {
    public static final Map<String, LinkBlackDuckResponse> links = new HashMap<>();

    public static final String SCANS_LINK = "scans";

    public static final LinkSingleResponse<BlackDuckStringResponse> SCANS_LINK_RESPONSE = new LinkSingleResponse<BlackDuckStringResponse>(SCANS_LINK, BlackDuckStringResponse.class);

    static {
        links.put(SCANS_LINK, SCANS_LINK_RESPONSE);
    }

    private java.util.Date createdAt;
    private String mappedProjectVersion;
    private String name;
    private BigDecimal scanSize;
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

    public BigDecimal getScanSize() {
        return scanSize;
    }

    public void setScanSize(BigDecimal scanSize) {
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

    public UrlSingleResponse<BlackDuckStringResponse> metaScansLink() {
        return metaSingleResponse(SCANS_LINK_RESPONSE);
    }

    public Optional<UrlSingleResponse<BlackDuckStringResponse>> metaScansLinkSafely() {
        return metaSingleResponseSafely(SCANS_LINK_RESPONSE);
    }

}
