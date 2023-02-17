/*
 * blackduck-common-api
 *
 * Copyright (c) 2023 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.synopsys.integration.blackduck.api.generated.component;

import java.math.BigDecimal;
import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.generated.component.ScanFullResultItemsAllLicensesView;
import com.synopsys.integration.blackduck.api.generated.component.ScanFullResultItemsAllVulnerabilitiesView;
import com.synopsys.integration.blackduck.api.generated.component.ScanFullResultItemsComponentViolatingPoliciesView;
import com.synopsys.integration.blackduck.api.generated.component.ScanFullResultItemsFailedEvaluationPoliciesView;
import com.synopsys.integration.blackduck.api.generated.component.ScanFullResultItemsLongTermUpgradeGuidanceView;
import com.synopsys.integration.blackduck.api.generated.component.ScanFullResultItemsOverriddenPoliciesPartialView;
import com.synopsys.integration.blackduck.api.generated.component.ScanFullResultItemsOverriddenPoliciesView;
import com.synopsys.integration.blackduck.api.generated.component.ScanFullResultItemsPolicyViolationLicensesView;
import com.synopsys.integration.blackduck.api.generated.component.ScanFullResultItemsPolicyViolationVulnerabilitiesView;
import com.synopsys.integration.blackduck.api.generated.component.ScanFullResultItemsShortTermUpgradeGuidanceView;
import com.synopsys.integration.blackduck.api.generated.component.ScanFullResultItemsViolatingPoliciesView;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ScanFullResultView extends BlackDuckComponent {
    private java.util.List<ScanFullResultItemsAllLicensesView> allLicenses;
    private java.util.List<ScanFullResultItemsAllVulnerabilitiesView> allVulnerabilities;
    private String componentIdentifier;
    private String componentName;
    private java.util.List<ScanFullResultItemsComponentViolatingPoliciesView> componentViolatingPolicies;
    private java.util.List<java.util.List<String>> dependencyTrees;
    private String externalId;
    private java.util.List<ScanFullResultItemsFailedEvaluationPoliciesView> failedEvaluationPolicies;
    private String filePath;
    private ScanFullResultItemsLongTermUpgradeGuidanceView longTermUpgradeGuidance;
    private BigDecimal matchConfidence;
    private java.util.List<String> nonEvaluatedPolicies;
    private java.util.List<ScanFullResultItemsOverriddenPoliciesView> overriddenPolicies;
    private java.util.List<ScanFullResultItemsOverriddenPoliciesPartialView> overriddenPoliciesPartial;
    private java.util.List<String> partiallyEvaluatedPolicies;
    private java.util.List<ScanFullResultItemsPolicyViolationLicensesView> policyViolationLicenses;
    private java.util.List<ScanFullResultItemsPolicyViolationVulnerabilitiesView> policyViolationVulnerabilities;
    private ScanFullResultItemsShortTermUpgradeGuidanceView shortTermUpgradeGuidance;
    private String versionName;
    private java.util.List<ScanFullResultItemsViolatingPoliciesView> violatingPolicies;

    public java.util.List<ScanFullResultItemsAllLicensesView> getAllLicenses() {
        return allLicenses;
    }

    public void setAllLicenses(java.util.List<ScanFullResultItemsAllLicensesView> allLicenses) {
        this.allLicenses = allLicenses;
    }

    public java.util.List<ScanFullResultItemsAllVulnerabilitiesView> getAllVulnerabilities() {
        return allVulnerabilities;
    }

    public void setAllVulnerabilities(java.util.List<ScanFullResultItemsAllVulnerabilitiesView> allVulnerabilities) {
        this.allVulnerabilities = allVulnerabilities;
    }

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

    public java.util.List<ScanFullResultItemsComponentViolatingPoliciesView> getComponentViolatingPolicies() {
        return componentViolatingPolicies;
    }

    public void setComponentViolatingPolicies(java.util.List<ScanFullResultItemsComponentViolatingPoliciesView> componentViolatingPolicies) {
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

    public java.util.List<ScanFullResultItemsFailedEvaluationPoliciesView> getFailedEvaluationPolicies() {
        return failedEvaluationPolicies;
    }

    public void setFailedEvaluationPolicies(java.util.List<ScanFullResultItemsFailedEvaluationPoliciesView> failedEvaluationPolicies) {
        this.failedEvaluationPolicies = failedEvaluationPolicies;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public ScanFullResultItemsLongTermUpgradeGuidanceView getLongTermUpgradeGuidance() {
        return longTermUpgradeGuidance;
    }

    public void setLongTermUpgradeGuidance(ScanFullResultItemsLongTermUpgradeGuidanceView longTermUpgradeGuidance) {
        this.longTermUpgradeGuidance = longTermUpgradeGuidance;
    }

    public BigDecimal getMatchConfidence() {
        return matchConfidence;
    }

    public void setMatchConfidence(BigDecimal matchConfidence) {
        this.matchConfidence = matchConfidence;
    }

    public java.util.List<String> getNonEvaluatedPolicies() {
        return nonEvaluatedPolicies;
    }

    public void setNonEvaluatedPolicies(java.util.List<String> nonEvaluatedPolicies) {
        this.nonEvaluatedPolicies = nonEvaluatedPolicies;
    }

    public java.util.List<ScanFullResultItemsOverriddenPoliciesView> getOverriddenPolicies() {
        return overriddenPolicies;
    }

    public void setOverriddenPolicies(java.util.List<ScanFullResultItemsOverriddenPoliciesView> overriddenPolicies) {
        this.overriddenPolicies = overriddenPolicies;
    }

    public java.util.List<ScanFullResultItemsOverriddenPoliciesPartialView> getOverriddenPoliciesPartial() {
        return overriddenPoliciesPartial;
    }

    public void setOverriddenPoliciesPartial(java.util.List<ScanFullResultItemsOverriddenPoliciesPartialView> overriddenPoliciesPartial) {
        this.overriddenPoliciesPartial = overriddenPoliciesPartial;
    }

    public java.util.List<String> getPartiallyEvaluatedPolicies() {
        return partiallyEvaluatedPolicies;
    }

    public void setPartiallyEvaluatedPolicies(java.util.List<String> partiallyEvaluatedPolicies) {
        this.partiallyEvaluatedPolicies = partiallyEvaluatedPolicies;
    }

    public java.util.List<ScanFullResultItemsPolicyViolationLicensesView> getPolicyViolationLicenses() {
        return policyViolationLicenses;
    }

    public void setPolicyViolationLicenses(java.util.List<ScanFullResultItemsPolicyViolationLicensesView> policyViolationLicenses) {
        this.policyViolationLicenses = policyViolationLicenses;
    }

    public java.util.List<ScanFullResultItemsPolicyViolationVulnerabilitiesView> getPolicyViolationVulnerabilities() {
        return policyViolationVulnerabilities;
    }

    public void setPolicyViolationVulnerabilities(java.util.List<ScanFullResultItemsPolicyViolationVulnerabilitiesView> policyViolationVulnerabilities) {
        this.policyViolationVulnerabilities = policyViolationVulnerabilities;
    }

    public ScanFullResultItemsShortTermUpgradeGuidanceView getShortTermUpgradeGuidance() {
        return shortTermUpgradeGuidance;
    }

    public void setShortTermUpgradeGuidance(ScanFullResultItemsShortTermUpgradeGuidanceView shortTermUpgradeGuidance) {
        this.shortTermUpgradeGuidance = shortTermUpgradeGuidance;
    }

    public String getVersionName() {
        return versionName;
    }

    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

    public java.util.List<ScanFullResultItemsViolatingPoliciesView> getViolatingPolicies() {
        return violatingPolicies;
    }

    public void setViolatingPolicies(java.util.List<ScanFullResultItemsViolatingPoliciesView> violatingPolicies) {
        this.violatingPolicies = violatingPolicies;
    }

}
