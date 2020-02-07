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
package com.synopsys.integration.blackduck.api.generated.discovery;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;


//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class MediaTypeDiscovery {
    public static final String DEFAULT_MEDIA_TYPE = "application/json";
    public static final String UUID_REGEX = "\\b[a-f0-9]{8}\\b-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-\\b[a-f0-9]{12}\\b";

    public static final String VND_BLACKDUCKSOFTWARE_ADMIN_4_JSON = "application/vnd.blackducksoftware.admin-4+json";
    public static final String VND_BLACKDUCKSOFTWARE_BILL_OF_MATERIALS_4_JSON = "application/vnd.blackducksoftware.bill-of-materials-4+json";
    public static final String VND_BLACKDUCKSOFTWARE_BILL_OF_MATERIALS_5_JSON = "application/vnd.blackducksoftware.bill-of-materials-5+json";
    public static final String VND_BLACKDUCKSOFTWARE_BILL_OF_MATERIALS_6_JSON = "application/vnd.blackducksoftware.bill-of-materials-6+json";
    public static final String VND_BLACKDUCKSOFTWARE_COMPONENT_DETAIL_4_JSON = "application/vnd.blackducksoftware.component-detail-4+json";
    public static final String VND_BLACKDUCKSOFTWARE_COMPONENT_DETAIL_5_JSON = "application/vnd.blackducksoftware.component-detail-5+json";
    public static final String VND_BLACKDUCKSOFTWARE_INTERNAL_1_JSON = "application/vnd.blackducksoftware.internal-1+json";
    public static final String VND_BLACKDUCKSOFTWARE_NOTIFICATION_4_JSON = "application/vnd.blackducksoftware.notification-4+json";
    public static final String VND_BLACKDUCKSOFTWARE_POLICY_4_JSON = "application/vnd.blackducksoftware.policy-4+json";
    public static final String VND_BLACKDUCKSOFTWARE_POLICY_5_JSON = "application/vnd.blackducksoftware.policy-5+json";
    public static final String VND_BLACKDUCKSOFTWARE_PROJECT_DETAIL_4_JSON = "application/vnd.blackducksoftware.project-detail-4+json";
    public static final String VND_BLACKDUCKSOFTWARE_PROJECT_DETAIL_5_JSON = "application/vnd.blackducksoftware.project-detail-5+json";
    public static final String VND_BLACKDUCKSOFTWARE_REPORT_4_JSON = "application/vnd.blackducksoftware.report-4+json";
    public static final String VND_BLACKDUCKSOFTWARE_SCAN_4_JSON = "application/vnd.blackducksoftware.scan-4+json";
    public static final String VND_BLACKDUCKSOFTWARE_STATUS_4_JSON = "application/vnd.blackducksoftware.status-4+json";
    public static final String VND_BLACKDUCKSOFTWARE_USER_4_JSON = "application/vnd.blackducksoftware.user-4+json";
    public static final String VND_BLACKDUCKSOFTWARE_VULNERABILITY_4_JSON = "application/vnd.blackducksoftware.vulnerability-4+json";

    public static final String API_CODELOCATIONS = String.format("/api/codelocations");;
    public static final String API_CODELOCATIONS_SCAN_SUMMARIES = String.format("/api/codelocations/%s/scan-summaries", UUID_REGEX);;
    public static final String API_COMPONENTS = String.format("/api/components");;
    public static final String API_COMPONENTS_CUSTOM_FIELDS = String.format("/api/components/%s/custom-fields", UUID_REGEX);;
    public static final String API_COMPONENTS_TAGS = String.format("/api/components/%s/tags", UUID_REGEX);;
    public static final String API_COMPONENTS_VERSIONS = String.format("/api/components/%s/versions", UUID_REGEX);;
    public static final String API_COMPONENTS_VERSIONS_CUSTOM_FIELDS = String.format("/api/components/%s/versions/%s/custom-fields", UUID_REGEX, UUID_REGEX);;
    public static final String API_COMPONENTS_VERSIONS_ORIGIN_VULNERABILITIES = String.format("/api/components/%s/versions/%s/origin/%s/vulnerabilities", UUID_REGEX, UUID_REGEX, UUID_REGEX);;
    public static final String API_COMPONENTS_VERSIONS_ORIGINS = String.format("/api/components/%s/versions/%s/origins", UUID_REGEX, UUID_REGEX);;
    public static final String API_COMPONENTS_VERSIONS_ORIGINS_DIRECT_DEPENDENCIES = String.format("/api/components/%s/versions/%s/origins/%s/direct-dependencies", UUID_REGEX, UUID_REGEX, UUID_REGEX);;
    public static final String API_COMPONENTS_VERSIONS_VULNERABILITIES = String.format("/api/components/%s/versions/%s/vulnerabilities", UUID_REGEX, UUID_REGEX);;
    public static final String API_COMPONENTS_VULNERABILITIES = String.format("/api/components/%s/vulnerabilities", UUID_REGEX);;
    public static final String API_CUSTOM_FIELDS_OBJECTS_CUSTOMFIELDOBJECT_FIELDS = String.format("/api/custom-fields/objects/customFieldObject/fields");;
    public static final String API_JOBS = String.format("/api/jobs");;
    public static final String API_LICENSE_FAMILIES = String.format("/api/license-families");;
    public static final String API_LICENSE_TERM_CATEGORIES = String.format("/api/license-term-categories");;
    public static final String API_LICENSE_TERMS = String.format("/api/license-terms");;
    public static final String API_LICENSE_TERMS_LICENSES = String.format("/api/license-terms/%s/licenses", UUID_REGEX);;
    public static final String API_LICENSES = String.format("/api/licenses");;
    public static final String API_LICENSES_COMMENTS = String.format("/api/licenses/%s/comments", UUID_REGEX);;
    public static final String API_LICENSES_LICENSE_TERMS = String.format("/api/licenses/%s/license-terms", UUID_REGEX);;
    public static final String API_POLICY_RULES = String.format("/api/policy-rules");;
    public static final String API_PROJECTS = String.format("/api/projects");;
    public static final String API_PROJECTS_ASSIGNABLE_USERGROUPS = String.format("/api/projects/%s/assignable-usergroups", UUID_REGEX);;
    public static final String API_PROJECTS_ASSIGNABLE_USERS = String.format("/api/projects/%s/assignable-users", UUID_REGEX);;
    public static final String API_PROJECTS_CUSTOM_FIELDS = String.format("/api/projects/%s/custom-fields", UUID_REGEX);;
    public static final String API_PROJECTS_PROJECT_MAPPINGS = String.format("/api/projects/%s/project-mappings", UUID_REGEX);;
    public static final String API_PROJECTS_TAGS = String.format("/api/projects/%s/tags", UUID_REGEX);;
    public static final String API_PROJECTS_USERGROUPS = String.format("/api/projects/%s/usergroups", UUID_REGEX);;
    public static final String API_PROJECTS_USERS = String.format("/api/projects/%s/users", UUID_REGEX);;
    public static final String API_PROJECTS_VERSIONS = String.format("/api/projects/%s/versions", UUID_REGEX);;
    public static final String API_PROJECTS_VERSIONS_CODE_LOCATIONS = String.format("/api/projects/%s/versions/%s/code-locations", UUID_REGEX, UUID_REGEX);;
    public static final String API_PROJECTS_VERSIONS_COMPARISON = String.format("/api/projects/%s/versions/%s/comparison", UUID_REGEX, UUID_REGEX);;
    public static final String API_PROJECTS_VERSIONS_COMPONENTS = String.format("/api/projects/%s/versions/%s/components", UUID_REGEX, UUID_REGEX);;
    public static final String API_PROJECTS_VERSIONS_COMPONENTS_COMMENTS = String.format("/api/projects/%s/versions/%s/components/%s/comments", UUID_REGEX, UUID_REGEX, UUID_REGEX);;
    public static final String API_PROJECTS_VERSIONS_COMPONENTS_COMPONENT_VERSIONS_COMMENTS = String.format("/api/projects/%s/versions/%s/components/%s/component-versions/%s/comments", UUID_REGEX, UUID_REGEX, UUID_REGEX, UUID_REGEX);;
    public static final String API_PROJECTS_VERSIONS_COMPONENTS_CUSTOM_FIELDS = String.format("/api/projects/%s/versions/%s/components/%s/custom-fields", UUID_REGEX, UUID_REGEX, UUID_REGEX);;
    public static final String API_PROJECTS_VERSIONS_COMPONENTS_MATCHED_FILES = String.format("/api/projects/%s/versions/%s/components/%s/matched-files", UUID_REGEX, UUID_REGEX, UUID_REGEX);;
    public static final String API_PROJECTS_VERSIONS_COMPONENTS_POLICY_RULES = String.format("/api/projects/%s/versions/%s/components/%s/policy-rules", UUID_REGEX, UUID_REGEX, UUID_REGEX);;
    public static final String API_PROJECTS_VERSIONS_COMPONENTS_VERSIONS_CUSTOM_FIELDS = String.format("/api/projects/%s/versions/%s/components/%s/versions/%s/custom-fields", UUID_REGEX, UUID_REGEX, UUID_REGEX, UUID_REGEX);;
    public static final String API_PROJECTS_VERSIONS_COMPONENTS_VERSIONS_MATCHED_FILES = String.format("/api/projects/%s/versions/%s/components/%s/versions/%s/matched-files", UUID_REGEX, UUID_REGEX, UUID_REGEX, UUID_REGEX);;
    public static final String API_PROJECTS_VERSIONS_COMPONENTS_VERSIONS_ORIGINS_MATCHED_FILES = String.format("/api/projects/%s/versions/%s/components/%s/versions/%s/origins/%s/matched-files", UUID_REGEX, UUID_REGEX, UUID_REGEX, UUID_REGEX, UUID_REGEX);;
    public static final String API_PROJECTS_VERSIONS_COMPONENTS_VERSIONS_POLICY_RULES = String.format("/api/projects/%s/versions/%s/components/%s/versions/%s/policy-rules", UUID_REGEX, UUID_REGEX, UUID_REGEX, UUID_REGEX);;
    public static final String API_PROJECTS_VERSIONS_CUSTOM_FIELDS = String.format("/api/projects/%s/versions/%s/custom-fields", UUID_REGEX, UUID_REGEX);;
    public static final String API_PROJECTS_VERSIONS_ISSUES = String.format("/api/projects/%s/versions/%s/issues", UUID_REGEX, UUID_REGEX);;
    public static final String API_PROJECTS_VERSIONS_LICENSE_REPORTS = String.format("/api/projects/%s/versions/%s/license-reports", UUID_REGEX, UUID_REGEX);;
    public static final String API_PROJECTS_VERSIONS_MATCHED_FILES = String.format("/api/projects/%s/versions/%s/matched-files", UUID_REGEX, UUID_REGEX);;
    public static final String API_PROJECTS_VERSIONS_VULNERABLE_BOM_COMPONENTS = String.format("/api/projects/%s/versions/%s/vulnerable-bom-components", UUID_REGEX, UUID_REGEX);;
    public static final String API_ROLES = String.format("/api/roles");;
    public static final String API_ROLES_INHERITING_USERS = String.format("/api/roles/%s/inheriting-users", UUID_REGEX);;
    public static final String API_ROLES_USERS = String.format("/api/roles/%s/users", UUID_REGEX);;
    public static final String API_USERGROUPS = String.format("/api/usergroups");;
    public static final String API_USERGROUPS_PROJECTS = String.format("/api/usergroups/%s/projects", UUID_REGEX);;
    public static final String API_USERGROUPS_USERS = String.format("/api/usergroups/%s/users", UUID_REGEX);;
    public static final String API_USERS = String.format("/api/users");;
    public static final String API_USERS_INHERITED_ROLES = String.format("/api/users/%s/inherited-roles", UUID_REGEX);;
    public static final String API_USERS_NOTIFICATION_SUBSCRIPTIONS = String.format("/api/users/%s/notification-subscriptions", UUID_REGEX);;
    public static final String API_USERS_NOTIFICATIONS = String.format("/api/users/%s/notifications", UUID_REGEX);;
    public static final String API_USERS_PROJECTS = String.format("/api/users/%s/projects", UUID_REGEX);;
    public static final String API_USERS_ROLES = String.format("/api/users/%s/roles", UUID_REGEX);;
    public static final String API_VERSIONS_LICENSE_REPORTS = String.format("/api/versions/%s/license-reports", UUID_REGEX);;
    public static final String API_VERSIONS_REPORTS = String.format("/api/versions/%s/reports", UUID_REGEX);;
    public static final String API_VULNERABILITIES_AFFECTED_PROJECTS = String.format("/api/vulnerabilities/%s/affected-projects", UUID_REGEX);;
    public static final String API_VULNERABILITY_REMEDIATION_REPORTS = String.format("/api/vulnerability-remediation-reports");;
    public static final String API_VULNERABILITY_STATUS_REPORTS = String.format("/api/vulnerability-status-reports");;
    public static final String API_VULNERABILITY_UPDATE_REPORTS = String.format("/api/vulnerability-update-reports");;

    private List<MediaTypeMatcher> mediaTypeMatchers = new LinkedList<>();

    // This class contains a list of regular expressions to perform matches on the URL path.
    // A URL path should only match one expression in the list.
    // The expressions are sorted in alphabetical order.
    // The forward slash in the path should be escaped to avoid potential errors.
    // The parts of a path that are variable are the UUIDs for the resources.

    // The string to escape forward slash is: \\/
    // The regex pattern for a UUID is: \\b[a-f0-9]{8}\\b-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-\\b[a-f0-9]{12}\\b
    public MediaTypeDiscovery() {
        mediaTypeMatchers.add(new MediaTypeMatcher(API_CODELOCATIONS, VND_BLACKDUCKSOFTWARE_SCAN_4_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_CODELOCATIONS_SCAN_SUMMARIES, VND_BLACKDUCKSOFTWARE_SCAN_4_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_COMPONENTS, VND_BLACKDUCKSOFTWARE_COMPONENT_DETAIL_4_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_COMPONENTS_CUSTOM_FIELDS, VND_BLACKDUCKSOFTWARE_COMPONENT_DETAIL_5_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_COMPONENTS_TAGS, VND_BLACKDUCKSOFTWARE_COMPONENT_DETAIL_5_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_COMPONENTS_VERSIONS, VND_BLACKDUCKSOFTWARE_COMPONENT_DETAIL_5_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_COMPONENTS_VERSIONS_CUSTOM_FIELDS, VND_BLACKDUCKSOFTWARE_COMPONENT_DETAIL_5_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_COMPONENTS_VERSIONS_ORIGINS, VND_BLACKDUCKSOFTWARE_COMPONENT_DETAIL_5_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_COMPONENTS_VERSIONS_ORIGINS_DIRECT_DEPENDENCIES, VND_BLACKDUCKSOFTWARE_COMPONENT_DETAIL_4_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_COMPONENTS_VERSIONS_ORIGIN_VULNERABILITIES, VND_BLACKDUCKSOFTWARE_VULNERABILITY_4_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_COMPONENTS_VERSIONS_VULNERABILITIES, VND_BLACKDUCKSOFTWARE_VULNERABILITY_4_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_COMPONENTS_VULNERABILITIES, VND_BLACKDUCKSOFTWARE_VULNERABILITY_4_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_CUSTOM_FIELDS_OBJECTS_CUSTOMFIELDOBJECT_FIELDS, VND_BLACKDUCKSOFTWARE_ADMIN_4_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_JOBS, VND_BLACKDUCKSOFTWARE_STATUS_4_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_LICENSES, VND_BLACKDUCKSOFTWARE_COMPONENT_DETAIL_5_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_LICENSES_COMMENTS, VND_BLACKDUCKSOFTWARE_PROJECT_DETAIL_4_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_LICENSES_LICENSE_TERMS, VND_BLACKDUCKSOFTWARE_COMPONENT_DETAIL_5_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_LICENSE_FAMILIES, VND_BLACKDUCKSOFTWARE_COMPONENT_DETAIL_5_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_LICENSE_TERMS, VND_BLACKDUCKSOFTWARE_COMPONENT_DETAIL_5_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_LICENSE_TERMS_LICENSES, VND_BLACKDUCKSOFTWARE_COMPONENT_DETAIL_5_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_LICENSE_TERM_CATEGORIES, VND_BLACKDUCKSOFTWARE_COMPONENT_DETAIL_5_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_POLICY_RULES, VND_BLACKDUCKSOFTWARE_POLICY_5_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_PROJECTS, VND_BLACKDUCKSOFTWARE_PROJECT_DETAIL_4_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_PROJECTS_ASSIGNABLE_USERGROUPS, VND_BLACKDUCKSOFTWARE_PROJECT_DETAIL_4_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_PROJECTS_ASSIGNABLE_USERS, VND_BLACKDUCKSOFTWARE_PROJECT_DETAIL_4_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_PROJECTS_CUSTOM_FIELDS, VND_BLACKDUCKSOFTWARE_PROJECT_DETAIL_5_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_PROJECTS_PROJECT_MAPPINGS, VND_BLACKDUCKSOFTWARE_PROJECT_DETAIL_4_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_PROJECTS_TAGS, VND_BLACKDUCKSOFTWARE_PROJECT_DETAIL_5_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_PROJECTS_USERGROUPS, VND_BLACKDUCKSOFTWARE_PROJECT_DETAIL_4_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_PROJECTS_USERS, VND_BLACKDUCKSOFTWARE_PROJECT_DETAIL_4_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_PROJECTS_VERSIONS, VND_BLACKDUCKSOFTWARE_PROJECT_DETAIL_5_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_PROJECTS_VERSIONS_CODE_LOCATIONS, VND_BLACKDUCKSOFTWARE_INTERNAL_1_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_PROJECTS_VERSIONS_COMPARISON, VND_BLACKDUCKSOFTWARE_BILL_OF_MATERIALS_6_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_PROJECTS_VERSIONS_COMPONENTS, VND_BLACKDUCKSOFTWARE_BILL_OF_MATERIALS_6_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_PROJECTS_VERSIONS_COMPONENTS_COMMENTS, VND_BLACKDUCKSOFTWARE_BILL_OF_MATERIALS_6_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_PROJECTS_VERSIONS_COMPONENTS_COMPONENT_VERSIONS_COMMENTS, VND_BLACKDUCKSOFTWARE_BILL_OF_MATERIALS_6_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_PROJECTS_VERSIONS_COMPONENTS_CUSTOM_FIELDS, VND_BLACKDUCKSOFTWARE_BILL_OF_MATERIALS_6_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_PROJECTS_VERSIONS_COMPONENTS_MATCHED_FILES, VND_BLACKDUCKSOFTWARE_BILL_OF_MATERIALS_6_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_PROJECTS_VERSIONS_COMPONENTS_POLICY_RULES, VND_BLACKDUCKSOFTWARE_BILL_OF_MATERIALS_6_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_PROJECTS_VERSIONS_COMPONENTS_VERSIONS_CUSTOM_FIELDS, VND_BLACKDUCKSOFTWARE_BILL_OF_MATERIALS_6_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_PROJECTS_VERSIONS_COMPONENTS_VERSIONS_MATCHED_FILES, VND_BLACKDUCKSOFTWARE_BILL_OF_MATERIALS_6_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_PROJECTS_VERSIONS_COMPONENTS_VERSIONS_ORIGINS_MATCHED_FILES, VND_BLACKDUCKSOFTWARE_BILL_OF_MATERIALS_6_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_PROJECTS_VERSIONS_COMPONENTS_VERSIONS_POLICY_RULES, VND_BLACKDUCKSOFTWARE_BILL_OF_MATERIALS_6_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_PROJECTS_VERSIONS_CUSTOM_FIELDS, VND_BLACKDUCKSOFTWARE_PROJECT_DETAIL_5_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_PROJECTS_VERSIONS_ISSUES, DEFAULT_MEDIA_TYPE));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_PROJECTS_VERSIONS_LICENSE_REPORTS, VND_BLACKDUCKSOFTWARE_REPORT_4_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_PROJECTS_VERSIONS_MATCHED_FILES, VND_BLACKDUCKSOFTWARE_BILL_OF_MATERIALS_6_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_PROJECTS_VERSIONS_VULNERABLE_BOM_COMPONENTS, VND_BLACKDUCKSOFTWARE_BILL_OF_MATERIALS_6_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_ROLES, VND_BLACKDUCKSOFTWARE_USER_4_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_ROLES_INHERITING_USERS, VND_BLACKDUCKSOFTWARE_USER_4_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_ROLES_USERS, VND_BLACKDUCKSOFTWARE_USER_4_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_USERGROUPS, VND_BLACKDUCKSOFTWARE_USER_4_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_USERGROUPS_PROJECTS, VND_BLACKDUCKSOFTWARE_PROJECT_DETAIL_4_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_USERGROUPS_USERS, VND_BLACKDUCKSOFTWARE_USER_4_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_USERS, VND_BLACKDUCKSOFTWARE_USER_4_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_USERS_INHERITED_ROLES, VND_BLACKDUCKSOFTWARE_USER_4_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_USERS_NOTIFICATIONS, VND_BLACKDUCKSOFTWARE_NOTIFICATION_4_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_USERS_NOTIFICATION_SUBSCRIPTIONS, VND_BLACKDUCKSOFTWARE_NOTIFICATION_4_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_USERS_PROJECTS, VND_BLACKDUCKSOFTWARE_PROJECT_DETAIL_4_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_USERS_ROLES, VND_BLACKDUCKSOFTWARE_USER_4_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_VERSIONS_LICENSE_REPORTS, VND_BLACKDUCKSOFTWARE_REPORT_4_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_VERSIONS_REPORTS, VND_BLACKDUCKSOFTWARE_REPORT_4_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_VULNERABILITIES_AFFECTED_PROJECTS, VND_BLACKDUCKSOFTWARE_VULNERABILITY_4_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_VULNERABILITY_REMEDIATION_REPORTS, VND_BLACKDUCKSOFTWARE_REPORT_4_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_VULNERABILITY_STATUS_REPORTS, VND_BLACKDUCKSOFTWARE_REPORT_4_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_VULNERABILITY_UPDATE_REPORTS, VND_BLACKDUCKSOFTWARE_REPORT_4_JSON));
    }

    public String determineMediaType(String url) {
        try {
            URL apiUrl = new URL(url);
            String path = apiUrl.getPath();
            return mediaTypeMatchers.stream()
                       .filter(matcher -> matcher.getPattern().matcher(path).matches())
                       .map(MediaTypeMatcher::getMediaType)
                       .findFirst()
                       .orElse(DEFAULT_MEDIA_TYPE);
        } catch (MalformedURLException ex) {
            return DEFAULT_MEDIA_TYPE;
        }
    }

    private class MediaTypeMatcher {
        private Pattern pattern;
        private String mediaType;

        public MediaTypeMatcher(final String pattern, final String mediaType) {
            this.pattern = createPattern(pattern);
            this.mediaType = mediaType;
        }

        private Pattern createPattern(String pattern) {
            String regexPattern = pattern.replaceAll("/","\\/");
            return Pattern.compile(regexPattern);
        }

        public Pattern getPattern() {
            return pattern;
        }

        public String getMediaType() {
            return mediaType;
        }
    }
}
