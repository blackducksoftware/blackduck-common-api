package com.blackducksoftware.integration.hub.api.generated.view;

import java.util.HashMap;
import java.util.Map;

import com.blackducksoftware.integration.hub.api.core.HubView;
import com.blackducksoftware.integration.hub.api.core.LinkResponse;
import com.blackducksoftware.integration.hub.api.core.LinkStringResponse;
import com.blackducksoftware.integration.hub.api.generated.enumeration.ReportFormatType;
import com.blackducksoftware.integration.hub.api.generated.enumeration.ReportType;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ReportView extends HubView {
    public static final Map<String, LinkResponse> links = new HashMap<>();

    public static final String DOWNLOAD_LINK = "download";
    public static final String CONTENT_LINK = "content";

    public static final LinkStringResponse CONTENT_LINK_RESPONSE = new LinkStringResponse(CONTENT_LINK, String.class);

    static {
            links.put(CONTENT_LINK, CONTENT_LINK_RESPONSE);
    }

    public java.util.Date createdAt;
    public String createdBy;
    public String createdByUser;
    public String fileName;
    public String fileNamePrefix;
    public Long fileSize;
    public java.util.Date finishedAt;
    public String locale;
    public ReportFormatType reportFormat;
    public ReportType reportType;
    public java.util.Date updatedAt;

}
