/*
 * blackduck-common-api
 *
 * Copyright (c) 2024 Black Duck Software, Inc.
 *
 * Use subject to the terms and conditions of the Black Duck Software End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.blackduck.integration.blackduck.api.generated.component;

import com.blackduck.integration.blackduck.api.core.BlackDuckComponent;

import java.math.BigDecimal;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class OriginCapabilityAnalysisItemsView extends BlackDuckComponent {
    private String capability;
    private String description;
    private BigDecimal endByte;
    private BigDecimal endColumn;
    private BigDecimal endLine;
    private String function;
    private String functionality;
    private String path;
    private BigDecimal startByte;
    private BigDecimal startColumn;
    private BigDecimal startLine;

    public String getCapability() {
        return capability;
    }

    public void setCapability(String capability) {
        this.capability = capability;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getEndByte() {
        return endByte;
    }

    public void setEndByte(BigDecimal endByte) {
        this.endByte = endByte;
    }

    public BigDecimal getEndColumn() {
        return endColumn;
    }

    public void setEndColumn(BigDecimal endColumn) {
        this.endColumn = endColumn;
    }

    public BigDecimal getEndLine() {
        return endLine;
    }

    public void setEndLine(BigDecimal endLine) {
        this.endLine = endLine;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public String getFunctionality() {
        return functionality;
    }

    public void setFunctionality(String functionality) {
        this.functionality = functionality;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public BigDecimal getStartByte() {
        return startByte;
    }

    public void setStartByte(BigDecimal startByte) {
        this.startByte = startByte;
    }

    public BigDecimal getStartColumn() {
        return startColumn;
    }

    public void setStartColumn(BigDecimal startColumn) {
        this.startColumn = startColumn;
    }

    public BigDecimal getStartLine() {
        return startLine;
    }

    public void setStartLine(BigDecimal startLine) {
        this.startLine = startLine;
    }

}
