package com.synopsys.integration.blackduck.api.core;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import com.synopsys.integration.blackduck.api.generated.view.ProjectView;
import org.junit.jupiter.api.Test;

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
