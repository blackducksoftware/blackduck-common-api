package com.blackducksoftware.integration.hub.api.core;

import org.junit.Assert;
import org.junit.Test;

import com.blackducksoftware.integration.hub.api.generated.view.ProjectView;

public class LinkResponseTest {
    @Test
    public void testLinkResponseEquality() {
        final LinkResponse linkResponse1 = new LinkSingleResponse<>("uri", ProjectView.class);
        final LinkResponse linkResponse2 = new LinkMultipleResponses<>("uri", ProjectView.class);
        final LinkResponse linkResponse3 = new LinkSingleResponse<>("uri", ProjectView.class);

        Assert.assertNotEquals(linkResponse1, linkResponse2);
        Assert.assertEquals(linkResponse1, linkResponse3);
    }

}
