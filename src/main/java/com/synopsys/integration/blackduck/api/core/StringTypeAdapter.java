/*
 * blackduck-common-api
 *
 * Copyright (c) 2021 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.synopsys.integration.blackduck.api.core;

import java.io.IOException;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.synopsys.integration.exception.IntegrationException;
import com.synopsys.integration.rest.HttpUrl;

public class BlackDuckStringResponseTypeAdapter extends TypeAdapter<BlackDuckStringResponse> {
    @Override
    public void write(JsonWriter jsonWriter, BlackDuckStringResponse blackDuckStringResponse) throws IOException {
        jsonWriter.value(blackDuckStringResponse.string());
    }

    @Override
    public BlackDuckStringResponse read(JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return new BlackDuckStringResponse(value);
    }

}
