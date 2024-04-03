/*
 * blackduck-common-api
 *
 * Copyright (c) 2024 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.synopsys.integration.blackduck.api.manual.response;

import java.io.Closeable;
import java.io.IOException;

import com.synopsys.integration.blackduck.api.core.BlackDuckResponse;
import com.synopsys.integration.rest.response.Response;

public class BlackDuckResponseResponse extends BlackDuckResponse implements Closeable {
    private Response response;

    public BlackDuckResponseResponse(Response response) {
        this.response = response;
    }

    @Override
    public void close() throws IOException {
        if (null != response) {
            response.close();
        }
    }

    public Response getActualResponse() {
        return response;
    }

    public void setActualResponse(Response response) {
        this.response = response;
    }

}
