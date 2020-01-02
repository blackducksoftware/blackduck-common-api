package com.synopsys.integration.blackduck.api.generated.view;

import com.synopsys.integration.blackduck.api.core.BlackDuckView;

/**
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public class LicenseTextViewV5 extends BlackDuckView {
	public static final String mediaType = "application/vnd.blackducksoftware.component-detail-5+json";

    private String text;

    public String getText() {
	return text;
    }

    public void setText(String text) {
	this.text = text;
    }


    public String getMediaType() {
	return mediaType;
    }

}
