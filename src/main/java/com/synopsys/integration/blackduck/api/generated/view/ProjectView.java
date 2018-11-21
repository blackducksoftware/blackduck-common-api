package com.synopsys.integration.blackduck.api.generated.view;

import java.util.HashMap;
import java.util.Map;

import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import com.synopsys.integration.blackduck.api.core.LinkMultipleResponses;
import com.synopsys.integration.blackduck.api.core.LinkResponse;
import com.synopsys.integration.blackduck.api.core.LinkSingleResponse;
import com.synopsys.integration.blackduck.api.generated.enumeration.OriginSourceType;
import com.synopsys.integration.blackduck.api.generated.enumeration.ProjectCloneCategoriesType;
import com.synopsys.integration.blackduck.api.generated.response.AssignedUserGroupView;
import com.synopsys.integration.blackduck.api.generated.view.AssignedUserView;
import com.synopsys.integration.blackduck.api.generated.view.ProjectVersionView;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ProjectView extends BlackDuckView {
    public static final Map<String, LinkResponse> links = new HashMap<>();

    public static final String VERSIONS_LINK = "versions";
    public static final String USERGROUPS_LINK = "usergroups";
    public static final String CANONICALVERSION_LINK = "canonicalVersion";
    public static final String USERS_LINK = "users";

    public static final LinkMultipleResponses<ProjectVersionView> VERSIONS_LINK_RESPONSE = new LinkMultipleResponses<ProjectVersionView>(VERSIONS_LINK, ProjectVersionView.class);
    public static final LinkMultipleResponses<AssignedUserGroupView> USERGROUPS_LINK_RESPONSE = new LinkMultipleResponses<AssignedUserGroupView>(USERGROUPS_LINK, AssignedUserGroupView.class);
    public static final LinkSingleResponse<ProjectVersionView> CANONICALVERSION_LINK_RESPONSE = new LinkSingleResponse<ProjectVersionView>(CANONICALVERSION_LINK, ProjectVersionView.class);
    public static final LinkMultipleResponses<AssignedUserView> USERS_LINK_RESPONSE = new LinkMultipleResponses<AssignedUserView>(USERS_LINK, AssignedUserView.class);

    static {
        links.put(VERSIONS_LINK, VERSIONS_LINK_RESPONSE);
        links.put(USERGROUPS_LINK, USERGROUPS_LINK_RESPONSE);
        links.put(CANONICALVERSION_LINK, CANONICALVERSION_LINK_RESPONSE);
        links.put(USERS_LINK, USERS_LINK_RESPONSE);
    }

    private java.util.List<ProjectCloneCategoriesType> cloneCategories;
    private java.util.Date createdAt;
    private String createdBy;
    private String createdByUser;
    private String description;
    private String name;
    private Boolean projectLevelAdjustments;
    private String projectOwner;
    private Integer projectTier;
    private OriginSourceType source;
    private java.util.Date updatedAt;
    private String updatedBy;
    private String updatedByUser;

    public java.util.List<ProjectCloneCategoriesType> getCloneCategories() {
        return cloneCategories;
    }

    public void setCloneCategories(java.util.List<ProjectCloneCategoriesType> cloneCategories) {
        this.cloneCategories = cloneCategories;
    }

    public java.util.Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getCreatedByUser() {
        return createdByUser;
    }

    public void setCreatedByUser(String createdByUser) {
        this.createdByUser = createdByUser;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getProjectLevelAdjustments() {
        return projectLevelAdjustments;
    }

    public void setProjectLevelAdjustments(Boolean projectLevelAdjustments) {
        this.projectLevelAdjustments = projectLevelAdjustments;
    }

    public String getProjectOwner() {
        return projectOwner;
    }

    public void setProjectOwner(String projectOwner) {
        this.projectOwner = projectOwner;
    }

    public Integer getProjectTier() {
        return projectTier;
    }

    public void setProjectTier(Integer projectTier) {
        this.projectTier = projectTier;
    }

    public OriginSourceType getSource() {
        return source;
    }

    public void setSource(OriginSourceType source) {
        this.source = source;
    }

    public java.util.Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public String getUpdatedByUser() {
        return updatedByUser;
    }

    public void setUpdatedByUser(String updatedByUser) {
        this.updatedByUser = updatedByUser;
    }

}
