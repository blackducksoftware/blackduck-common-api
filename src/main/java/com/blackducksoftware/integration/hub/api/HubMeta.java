package com.blackducksoftware.integration.hub.api;

import java.util.List;

import com.blackducksoftware.integration.util.Stringable;

public class HubMeta extends Stringable {
    public List<HttpAllow> allow;
    public String href;
    public List<HubLink> links;

}
