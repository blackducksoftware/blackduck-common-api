package com.blackducksoftware.integration.hub.model.view;

import java.lang.reflect.Type;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.blackducksoftware.integration.hub.model.HubView;
import com.blackducksoftware.integration.hub.model.enumeration.ScanSummaryStatusEnum;
import com.blackducksoftware.integration.hub.model.generated.api.view.CodeLocationView;

public class ScanSummaryView extends HubView {
    public static final Map<String, Type> links = new HashMap<>();

    public static final String CODELOCATION_LINK = "codelocation";

    static {
        links.put(CODELOCATION_LINK, CodeLocationView.class);
    }

    public ScanSummaryStatusEnum status;
    public String statusMessage;
    public Date createdAt;
    public Date updatedAt;

}
