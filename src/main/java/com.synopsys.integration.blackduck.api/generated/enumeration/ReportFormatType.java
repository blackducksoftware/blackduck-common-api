package com.synopsys.integration.blackduck.api.generated.enumeration;

import com.synopsys.integration.util.EnumUtils;

@Deprecated
/**
* ReportFormatType is now called LicenseReportsReportReportFormatType
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public enum ReportFormatType {
	CSV,
	JSON,
	TEXT;

	private String mediaType = "application/vnd.blackducksoftware.report-4+json";

	public String getMediaType() {
	return mediaType;
	}

	public String prettyPrint() {
	return EnumUtils.prettyPrint(this);
	}

} 