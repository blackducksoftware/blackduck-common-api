/*
 * blackduck-common-api
 *
 * Copyright (c) 2024 Black Duck Software, Inc.
 *
 * Use subject to the terms and conditions of the Black Duck Software End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.blackduck.integration.blackduck.api.core;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.blackduck.integration.exception.IntegrationException;
import com.blackduck.integration.rest.HttpUrl;

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
