/*
 * blackduck-common-api
 *
 * Copyright (c) 2021 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.synopsys.integration.blackduck.api.manual.temporary.component;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.manual.temporary.enumeration.SignaturePairSignatureType;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class SignaturePair extends BlackDuckComponent {
    private SignaturePairSignatureType signatureType;
    private String signatureValue;

    public SignaturePairSignatureType getSignatureType() {
        return signatureType;
    }

    public void setSignatureType(SignaturePairSignatureType signatureType) {
        this.signatureType = signatureType;
    }

    public String getSignatureValue() {
        return signatureValue;
    }

    public void setSignatureValue(String signatureValue) {
        this.signatureValue = signatureValue;
    }

}
