/**
 * blackduck-common-api
 *
 * Copyright (C) 2019 Black Duck Software, Inc.
 * http://www.blackducksoftware.com/
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

public class LinkMultipleResponses<T extends BlackDuckResponse> extends LinkResponse {
    private final String link;
    private final Class<T> responseClass;

    public LinkMultipleResponses(final String link, final Class<T> responseClass) {
        this.link = link;
        this.responseClass = responseClass;
    }

    public String getLink() {
        return link;
    }

    public Class<T> getResponseClass() {
        return responseClass;
    }

}
