/*
 * blackduck-common-api
 *
 * Copyright (c) 2024 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.synopsys.integration.blackduck.api.manual.temporary.component;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.manual.temporary.enumeration.CryptoAlgorithmKeyLengthsType;

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
