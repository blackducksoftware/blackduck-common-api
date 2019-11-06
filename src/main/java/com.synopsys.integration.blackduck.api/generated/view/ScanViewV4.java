package com.synopsys.integration.blackduck.api.generated.view;

import java.math.BigDecimal;
import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.core.LinkResponse;
import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import java.util.Optional;
import com.synopsys.integration.blackduck.api.generated.enumeration.ScanStatusType;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ScanViewV4 extends BlackDuckView {
	public static final String mediaType = "application/vnd.blackducksoftware.scan-4+json";

    private BigDecimal scanSize;
    private String serverVersion;
    private String statusMessage;
    private String updatedAt;
    private String createdAt;
    private ScanStatusType status;

    public BigDecimal getScanSize() {
	return scanSize;
    }

    public void setScanSize(BigDecimal scanSize) {
	this.scanSize = scanSize;
    }

    public String getServerVersion() {
	return serverVersion;
    }

    public void setServerVersion(String serverVersion) {
	this.serverVersion = serverVersion;
    }

    public String getStatusMessage() {
	return statusMessage;
    }

    public void setStatusMessage(String statusMessage) {
	this.statusMessage = statusMessage;
    }

    public String getUpdatedAt() {
	return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
	this.updatedAt = updatedAt;
    }

    public String getCreatedAt() {
	return createdAt;
    }

    public void setCreatedAt(String createdAt) {
	this.createdAt = createdAt;
    }

    public ScanStatusType getStatus() {
	return status;
    }

    public void setStatus(ScanStatusType status) {
	this.status = status;
    }


    public String getMediaType() {
	return mediaType;
    }

}
