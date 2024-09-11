/*
 * blackduck-common-api
 *
 * Copyright (c) 2024 Black Duck Software, Inc.
 *
 * Use subject to the terms and conditions of the Black Duck Software End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.blackduck.integration.blackduck.api.manual.view;

import java.math.BigDecimal;

import com.blackduck.integration.blackduck.api.core.BlackDuckView;
import com.blackduck.integration.blackduck.api.generated.component.DeveloperScansScanItemsComponentViolatingPoliciesView;
import com.blackduck.integration.blackduck.api.generated.component.DeveloperScansScanItemsFailedEvaluationPoliciesView;
import com.blackduck.integration.blackduck.api.generated.component.DeveloperScansScanItemsLongTermUpgradeGuidanceView;
import com.blackduck.integration.blackduck.api.generated.component.DeveloperScansScanItemsPolicyViolationLicensesView;
import com.blackduck.integration.blackduck.api.generated.component.DeveloperScansScanItemsPolicyViolationVulnerabilitiesView;
import com.blackduck.integration.blackduck.api.generated.component.DeveloperScansScanItemsShortTermUpgradeGuidanceView;
import com.blackduck.integration.blackduck.api.generated.component.DeveloperScansScanItemsTransitiveUpgradeGuidanceView;
import com.blackduck.integration.blackduck.api.generated.component.DeveloperScansScanItemsViolatingPoliciesView;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class DeveloperScansScanView extends BlackDuckView {
    private String componentIdentifier;
    private String componentName;
    private java.util.List<DeveloperScansScanItemsComponentViolatingPoliciesView> componentViolatingPolicies;
    private java.util.List<java.util.List<String>> dependencyTrees;
    private String externalId;
    private java.util.List<DeveloperScansScanItemsFailedEvaluationPoliciesView> failedEvaluationPolicies;
    private String filePath;
    private DeveloperScansScanItemsLongTermUpgradeGuidanceView longTermUpgradeGuidance;
    private BigDecimal matchConfidence;
    private String originId;
    private java.util.List<String> policyStatuses;
    private java.util.List<DeveloperScansScanItemsPolicyViolationLicensesView> policyViolationLicenses;
    private java.util.List<DeveloperScansScanItemsPolicyViolationVulnerabilitiesView> policyViolationVulnerabilities;
    private DeveloperScansScanItemsShortTermUpgradeGuidanceView shortTermUpgradeGuidance;
    private java.util.List<DeveloperScansScanItemsTransitiveUpgradeGuidanceView> transitiveUpgradeGuidance;
    private String versionName;
    private java.util.List<DeveloperScansScanItemsViolatingPoliciesView> violatingPolicies;

    public String getComponentIdentifier() {
        return componentIdentifier;
    }

    public void setComponentIdentifier(String componentIdentifier) {
        this.componentIdentifier = componentIdentifier;
    }

    public String getComponentName() {
        return componentName;
    }

    public void setComponentName(String componentName) {
        this.componentName = componentName;
    }

    public java.util.List<DeveloperScansScanItemsComponentViolatingPoliciesView> getComponentViolatingPolicies() {
        return componentViolatingPolicies;
    }

    public void setComponentViolatingPolicies(java.util.List<DeveloperScansScanItemsComponentViolatingPoliciesView> componentViolatingPolicies) {
        this.componentViolatingPolicies = componentViolatingPolicies;
    }

    public java.util.List<java.util.List<String>> getDependencyTrees() {
        return dependencyTrees;
    }

    public void setDependencyTrees(java.util.List<java.util.List<String>> dependencyTrees) {
        this.dependencyTrees = dependencyTrees;
    }

    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    public java.util.List<DeveloperScansScanItemsFailedEvaluationPoliciesView> getFailedEvaluationPolicies() {
        return failedEvaluationPolicies;
    }

    public void setFailedEvaluationPolicies(java.util.List<DeveloperScansScanItemsFailedEvaluationPoliciesView> failedEvaluationPolicies) {
        this.failedEvaluationPolicies = failedEvaluationPolicies;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public DeveloperScansScanItemsLongTermUpgradeGuidanceView getLongTermUpgradeGuidance() {
        return longTermUpgradeGuidance;
    }

    public void setLongTermUpgradeGuidance(DeveloperScansScanItemsLongTermUpgradeGuidanceView longTermUpgradeGuidance) {
        this.longTermUpgradeGuidance = longTermUpgradeGuidance;
    }

    public BigDecimal getMatchConfidence() {
        return matchConfidence;
    }

    public void setMatchConfidence(BigDecimal matchConfidence) {
        this.matchConfidence = matchConfidence;
    }

    public String getOriginId() {
        return originId;
    }

    public void setOriginId(String originId) {
        this.originId = originId;
    }

    public java.util.List<String> getPolicyStatuses() {
        return policyStatuses;
    }

    public void setPolicyStatuses(java.util.List<String> policyStatuses) {
        this.policyStatuses = policyStatuses;
    }

    public java.util.List<DeveloperScansScanItemsPolicyViolationLicensesView> getPolicyViolationLicenses() {
        return policyViolationLicenses;
    }

    public void setPolicyViolationLicenses(java.util.List<DeveloperScansScanItemsPolicyViolationLicensesView> policyViolationLicenses) {
        this.policyViolationLicenses = policyViolationLicenses;
    }

    public java.util.List<DeveloperScansScanItemsPolicyViolationVulnerabilitiesView> getPolicyViolationVulnerabilities() {
        return policyViolationVulnerabilities;
    }

    public void setPolicyViolationVulnerabilities(java.util.List<DeveloperScansScanItemsPolicyViolationVulnerabilitiesView> policyViolationVulnerabilities) {
        this.policyViolationVulnerabilities = policyViolationVulnerabilities;
    }

    public DeveloperScansScanItemsShortTermUpgradeGuidanceView getShortTermUpgradeGuidance() {
        return shortTermUpgradeGuidance;
    }

    public void setShortTermUpgradeGuidance(DeveloperScansScanItemsShortTermUpgradeGuidanceView shortTermUpgradeGuidance) {
        this.shortTermUpgradeGuidance = shortTermUpgradeGuidance;
    }

    public java.util.List<DeveloperScansScanItemsTransitiveUpgradeGuidanceView> getTransitiveUpgradeGuidance() {
        return transitiveUpgradeGuidance;
    }

    public void setTransitiveUpgradeGuidance(java.util.List<DeveloperScansScanItemsTransitiveUpgradeGuidanceView> transitiveUpgradeGuidance) {
        this.transitiveUpgradeGuidance = transitiveUpgradeGuidance;
    }

    public String getVersionName() {
        return versionName;
    }

    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

    public java.util.List<DeveloperScansScanItemsViolatingPoliciesView> getViolatingPolicies() {
        return violatingPolicies;
    }

    public void setViolatingPolicies(java.util.List<DeveloperScansScanItemsViolatingPoliciesView> violatingPolicies) {
        this.violatingPolicies = violatingPolicies;
    }

}
