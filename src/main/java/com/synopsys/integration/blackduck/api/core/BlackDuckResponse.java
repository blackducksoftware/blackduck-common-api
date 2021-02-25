/*
 * blackduck-common-api
 *
 * Copyright (c) 2021 Synopsys, Inc.
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.synopsys.integration.blackduck.api.core;

import com.fasterxml.jackson.databind.JsonNode;
import com.google.gson.Gson;
import com.google.gson.JsonElement;

/**
 * All Hub API JSON Responses should be marshaled to instances of this class.
 */
public class BlackDuckResponse extends BlackDuckComponent {
    // these are transient to prevent gson serialization
    private transient String json;
    private transient JsonElement jsonElement;
    private transient Gson gson;
    private transient JsonNode patch;

    public boolean hasSubclasses() {
        return false;
    }

    public Class<? extends BlackDuckResponse> getSubclass() {
        throw new UnsupportedOperationException("A subclass must implement this with its specific behavior");
    }

    public String getJson() {
        return json;
    }

    public void setJson(String json) {
        this.json = json;
    }

    public JsonElement getJsonElement() {
        return jsonElement;
    }

    public void setJsonElement(JsonElement jsonElement) {
        this.jsonElement = jsonElement;
    }

    public Gson getGson() {
        return gson;
    }

    public void setGson(Gson gson) {
        this.gson = gson;
    }

    public JsonNode getPatch() {
        return patch;
    }

    public void setPatch(JsonNode patch) {
        this.patch = patch;
    }

}
