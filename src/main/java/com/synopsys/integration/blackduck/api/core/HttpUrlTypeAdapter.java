/*
 * blackduck-common-api
 *
 * Copyright (c) 2023 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.synopsys.integration.blackduck.api.core;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.synopsys.integration.exception.IntegrationException;
import com.synopsys.integration.rest.HttpUrl;

import java.io.IOException;

public class HttpUrlTypeAdapter extends TypeAdapter<HttpUrl> {
    @Override
    public void write(JsonWriter jsonWriter, HttpUrl httpUrl) throws IOException {
        jsonWriter.value(httpUrl.string());
    }

    @Override
    public HttpUrl read(JsonReader jsonReader) throws IOException {
        String url = jsonReader.nextString();
        try {
            return new HttpUrl(url);
        } catch (IntegrationException e) {
            return null;
        }
    }

}
