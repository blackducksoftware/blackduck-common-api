package com.blackducksoftware.integration.hub.model;

import java.util.List;

import com.blackducksoftware.integration.util.Stringable;

public class Meta extends Stringable {
    public List<HttpAllow> allow;
    public String href;
    public List<HubLink> links;

}
