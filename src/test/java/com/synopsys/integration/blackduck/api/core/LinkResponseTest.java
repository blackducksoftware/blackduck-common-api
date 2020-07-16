package com.synopsys.integration.blackduck.api.core;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import com.synopsys.integration.blackduck.api.core.response.LinkMultipleResponses;
import com.synopsys.integration.blackduck.api.core.response.LinkResponse;
import com.synopsys.integration.blackduck.api.core.response.LinkSingleResponse;
import org.junit.jupiter.api.Test;

import com.synopsys.integration.blackduck.api.generated.view.ProjectView;

public class LinkResponseTest {
    @Test
    public void testLinkResponseEquality() {
        final LinkResponse linkResponse1 = new LinkSingleResponse<>("uri", ProjectView.class);
        final LinkResponse linkResponse2 = new LinkMultipleResponses<>("uri", ProjectView.class);
        final LinkResponse linkResponse3 = new LinkSingleResponse<>("uri", ProjectView.class);

        assertNotEquals(linkResponse1, linkResponse2);
        assertEquals(linkResponse1, linkResponse3);
    }

}
