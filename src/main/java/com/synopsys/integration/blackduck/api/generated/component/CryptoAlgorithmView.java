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
package com.synopsys.integration.blackduck.api.generated.component;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.generated.enumeration.CryptoAlgorithmKeyLengthsType;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class CryptoAlgorithmView extends BlackDuckComponent {
    private String description;
    private java.util.List<Integer> keyLengths;
    private CryptoAlgorithmKeyLengthsType keyLengthsType;
    private String knownWeaknesses;
    private String label;
    private String licensingInfo;
    private String name;
    private String originator;
    private String patentInfo;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public java.util.List<Integer> getKeyLengths() {
        return keyLengths;
    }

    public void setKeyLengths(java.util.List<Integer> keyLengths) {
        this.keyLengths = keyLengths;
    }

    public CryptoAlgorithmKeyLengthsType getKeyLengthsType() {
        return keyLengthsType;
    }

    public void setKeyLengthsType(CryptoAlgorithmKeyLengthsType keyLengthsType) {
        this.keyLengthsType = keyLengthsType;
    }

    public String getKnownWeaknesses() {
        return knownWeaknesses;
    }

    public void setKnownWeaknesses(String knownWeaknesses) {
        this.knownWeaknesses = knownWeaknesses;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getLicensingInfo() {
        return licensingInfo;
    }

    public void setLicensingInfo(String licensingInfo) {
        this.licensingInfo = licensingInfo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOriginator() {
        return originator;
    }

    public void setOriginator(String originator) {
        this.originator = originator;
    }

    public String getPatentInfo() {
        return patentInfo;
    }

    public void setPatentInfo(String patentInfo) {
        this.patentInfo = patentInfo;
    }

}
