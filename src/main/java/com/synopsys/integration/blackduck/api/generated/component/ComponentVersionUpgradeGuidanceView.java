/**
 * blackduck-common-api
 *
 * Copyright (c) 2020 Synopsys, Inc.
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
package com.synopsys.integration.blackduck.api.generated.component;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.generated.component.ComponentVersionUpgradeGuidanceLongTermView;
import com.synopsys.integration.blackduck.api.generated.component.ComponentVersionUpgradeGuidanceShortTermView;

/**
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public class ComponentVersionUpgradeGuidanceView extends BlackDuckComponent {
    private String component;
    private String origin;
    private String version;
    private String originName;
    private ComponentVersionUpgradeGuidanceLongTermView longTerm;
    private ComponentVersionUpgradeGuidanceShortTermView shortTerm;
    private String originExternalId;
    private String componentName;
    private String versionName;
    private String originExternalNamespace;

    public String getComponent() {
	    return component;
    }

    public void setComponent(String component) {
	    this.component = component;
    }

    public String getOrigin() {
	    return origin;
    }

    public void setOrigin(String origin) {
	    this.origin = origin;
    }

    public String getVersion() {
	    return version;
    }

    public void setVersion(String version) {
	    this.version = version;
    }

    public String getOriginName() {
	    return originName;
    }

    public void setOriginName(String originName) {
	    this.originName = originName;
    }

    public ComponentVersionUpgradeGuidanceLongTermView getLongTerm() {
	    return longTerm;
    }

    public void setLongTerm(ComponentVersionUpgradeGuidanceLongTermView longTerm) {
	    this.longTerm = longTerm;
    }

    public ComponentVersionUpgradeGuidanceShortTermView getShortTerm() {
	    return shortTerm;
    }

    public void setShortTerm(ComponentVersionUpgradeGuidanceShortTermView shortTerm) {
	    this.shortTerm = shortTerm;
    }

    public String getOriginExternalId() {
	    return originExternalId;
    }

    public void setOriginExternalId(String originExternalId) {
	    this.originExternalId = originExternalId;
    }

    public String getComponentName() {
	    return componentName;
    }

    public void setComponentName(String componentName) {
	    this.componentName = componentName;
    }

    public String getVersionName() {
	    return versionName;
    }

    public void setVersionName(String versionName) {
	    this.versionName = versionName;
    }

    public String getOriginExternalNamespace() {
	    return originExternalNamespace;
    }

    public void setOriginExternalNamespace(String originExternalNamespace) {
	    this.originExternalNamespace = originExternalNamespace;
    }

}
