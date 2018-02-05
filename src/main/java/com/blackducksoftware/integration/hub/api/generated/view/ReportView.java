package com.blackducksoftware.integration.hub.api.generated.view;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import com.blackducksoftware.integration.hub.api.HubView;
import com.blackducksoftware.integration.hub.api.generated.enumeration.Report;
import com.blackducksoftware.integration.hub.api.generated.enumeration.ReportFormat;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ReportView extends HubView {
    public static final Map<String, Type> links = new HashMap<>();

    public static final String DOWNLOAD_LINK = "download";
    public static final String CONTENT_LINK = "content";

    static {
            links.put(CONTENT_LINK, String.class);
    }

    public java.util.Date createdAt;
    public String createdBy;
    public String createdByUser;
    public String fileName;
    public String fileNamePrefix;
    public Long fileSize;
    public java.util.Date finishedAt;
    public String locale;
    public ReportFormat reportFormat;
    public Report reportType;
    public java.util.Date updatedAt;

}
