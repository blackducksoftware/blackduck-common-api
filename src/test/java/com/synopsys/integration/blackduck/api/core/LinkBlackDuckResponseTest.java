package com.synopsys.integration.blackduck.api.core;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

import com.synopsys.integration.blackduck.api.core.response.LinkBlackDuckResponse;
import com.synopsys.integration.blackduck.api.core.response.LinkMultipleResponses;
import com.synopsys.integration.blackduck.api.core.response.LinkSingleResponse;
import com.synopsys.integration.blackduck.api.manual.view.ProjectView;

public class LinkBlackDuckResponseTest {
    @Test
    public void testLinkResponseEquality() {
        final LinkBlackDuckResponse linkResponse1 = new LinkSingleResponse<>("uri", ProjectView.class);
        final LinkBlackDuckResponse linkResponse2 = new LinkMultipleResponses<>("uri", ProjectView.class);
        final LinkBlackDuckResponse linkResponse3 = new LinkSingleResponse<>("uri", ProjectView.class);

        assertNotEquals(linkResponse1, linkResponse2);
        assertEquals(linkResponse1, linkResponse3);
    }

}
