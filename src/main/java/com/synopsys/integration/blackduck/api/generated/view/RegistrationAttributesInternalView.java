/**
 * blackduck-common-api
 *
 * Copyright (C) 2018 Black Duck Software, Inc.
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
package com.synopsys.integration.blackduck.api.generated.view;

import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import com.synopsys.integration.blackduck.api.generated.component.RegistrationAttributeView;
import com.synopsys.integration.blackduck.api.generated.component.ResourceMetadata;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class RegistrationAttributesInternalView extends BlackDuckView {
    private ResourceMetadata _meta;
    private java.util.List<RegistrationAttributeView> attributes;

    public ResourceMetadata get_meta() {
        return _meta;
    }

    public void set_meta(ResourceMetadata _meta) {
        this._meta = _meta;
    }

    public java.util.List<RegistrationAttributeView> getAttributes() {
        return attributes;
    }

    public void setAttributes(java.util.List<RegistrationAttributeView> attributes) {
        this.attributes = attributes;
    }

}
