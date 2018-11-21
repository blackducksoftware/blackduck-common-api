package com.synopsys.integration.blackduck.api.generated.response;

import com.synopsys.integration.blackduck.api.core.BlackDuckResponse;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class DashboardSummaryView extends BlackDuckResponse {
    private String catalogRiskProfile;
    private String dashboardFacts;
    private String dashboardOverall;
    private String dashboardPolicyViolationByTier;
    private String dashboardTopPolicyViolation;
    private String dashboardTopSecurityRisk;
    private String riskProfile;

    public String getCatalogRiskProfile() {
        return catalogRiskProfile;
    }

    public void setCatalogRiskProfile(String catalogRiskProfile) {
        this.catalogRiskProfile = catalogRiskProfile;
    }

    public String getDashboardFacts() {
        return dashboardFacts;
    }

    public void setDashboardFacts(String dashboardFacts) {
        this.dashboardFacts = dashboardFacts;
    }

    public String getDashboardOverall() {
        return dashboardOverall;
    }

    public void setDashboardOverall(String dashboardOverall) {
        this.dashboardOverall = dashboardOverall;
    }

    public String getDashboardPolicyViolationByTier() {
        return dashboardPolicyViolationByTier;
    }

    public void setDashboardPolicyViolationByTier(String dashboardPolicyViolationByTier) {
        this.dashboardPolicyViolationByTier = dashboardPolicyViolationByTier;
    }

    public String getDashboardTopPolicyViolation() {
        return dashboardTopPolicyViolation;
    }

    public void setDashboardTopPolicyViolation(String dashboardTopPolicyViolation) {
        this.dashboardTopPolicyViolation = dashboardTopPolicyViolation;
    }

    public String getDashboardTopSecurityRisk() {
        return dashboardTopSecurityRisk;
    }

    public void setDashboardTopSecurityRisk(String dashboardTopSecurityRisk) {
        this.dashboardTopSecurityRisk = dashboardTopSecurityRisk;
    }

    public String getRiskProfile() {
        return riskProfile;
    }

    public void setRiskProfile(String riskProfile) {
        this.riskProfile = riskProfile;
    }

}
