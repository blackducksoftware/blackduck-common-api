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

import com.synopsys.integration.rest.HttpUrl;

import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class BlackDuckMediaTypeDiscovery {
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

    public static final String API_CODELOCATIONS_WITH_ID = String.format("/api/codelocations/%s", UUID_REGEX);
    public static final String API_COMPONENTS = String.format("/api/components");
    public static final String API_COMPONENTS_WITH_ID = String.format("/api/components/%s", UUID_REGEX);
    public static final String API_COMPONENTS_CUSTOM_FIELDS_WITH_ID = String.format("/api/components/%s/custom-fields/%s", UUID_REGEX, UUID_REGEX);
    public static final String API_COMPONENTS_TAGS_WITH_ID = String.format("/api/components/%s/tags/%s", UUID_REGEX, UUID_REGEX);
    public static final String API_COMPONENTS_VERSIONS_WITH_ID = String.format("/api/components/%s/versions/%s", UUID_REGEX, UUID_REGEX);
    public static final String API_COMPONENTS_VERSIONS_CUSTOM_FIELDS_WITH_ID = String.format("/api/components/%s/versions/%s/custom-fields/%s", UUID_REGEX, UUID_REGEX, UUID_REGEX);
    public static final String API_COMPONENTS_VERSIONS_LICENSES_WITH_ID = String.format("/api/components/%s/versions/%s/licenses/%s", UUID_REGEX, UUID_REGEX, UUID_REGEX);
    public static final String API_COMPONENTS_VERSIONS_LICENSES_TEXT = String.format("/api/components/%s/versions/%s/licenses/%s/text", UUID_REGEX, UUID_REGEX, UUID_REGEX);
    public static final String API_COMPONENTS_VERSIONS_ORIGINS_WITH_ID = String.format("/api/components/%s/versions/%s/origins/%s", UUID_REGEX, UUID_REGEX, UUID_REGEX);
    public static final String API_COMPONENTS_VERSIONS_REMEDIATING = String.format("/api/components/%s/versions/%s/remediating", UUID_REGEX, UUID_REGEX);
    public static final String API_COMPONENTS_VERSIONS_RISK_PROFILE = String.format("/api/components/%s/versions/%s/risk-profile", UUID_REGEX, UUID_REGEX);
    public static final String API_CURRENT_USER = String.format("/api/current-user");
    public static final String API_CURRENT_VERSION = String.format("/api/current-version");
    public static final String API_CUSTOM_FIELDS_OBJECTS_CUSTOMFIELDOBJECT = String.format("/api/custom-fields/objects/customFieldObject");
    public static final String API_CUSTOM_FIELDS_OBJECTS_CUSTOMFIELDOBJECT_FIELDS_WITH_ID = String.format("/api/custom-fields/objects/customFieldObject/fields/%s", UUID_REGEX);
    public static final String API_CUSTOM_FIELDS_OBJECTS_CUSTOMFIELDOBJECT_FIELDS_OPTIONS = String.format("/api/custom-fields/objects/customFieldObject/fields/%s/options", UUID_REGEX);
    public static final String API_CUSTOM_FIELDS_TYPES = String.format("/api/custom-fields/types");
    public static final String API_CWES_WITH_ID = String.format("/api/cwes/%s", UUID_REGEX);
    public static final String API_JOBS_WITH_ID = String.format("/api/jobs/%s", UUID_REGEX);
    public static final String API_LICENSE_FAMILIES_WITH_ID = String.format("/api/license-families/%s", UUID_REGEX);
    public static final String API_LICENSE_TERMS_WITH_ID = String.format("/api/license-terms/%s", UUID_REGEX);
    public static final String API_LICENSE_TERMS_LICENSES_WITH_ID = String.format("/api/license-terms/%s/licenses/%s", UUID_REGEX, UUID_REGEX);
    public static final String API_LICENSES_WITH_ID = String.format("/api/licenses/%s", UUID_REGEX);
    public static final String API_LICENSES_COMMENTS_WITH_ID = String.format("/api/licenses/%s/comments/%s", UUID_REGEX, UUID_REGEX);
    public static final String API_LICENSES_LICENSE_TERMS_WITH_ID = String.format("/api/licenses/%s/license-terms/%s", UUID_REGEX, UUID_REGEX);
    public static final String API_LICENSES_TEXT = String.format("/api/licenses/%s/text", UUID_REGEX);
    public static final String API_POLICY_RULES_WITH_ID = String.format("/api/policy-rules/%s", UUID_REGEX);
    public static final String API_PROJECTS_WITH_ID = String.format("/api/projects/%s", UUID_REGEX);
    public static final String API_PROJECTS_CUSTOM_FIELDS_WITH_ID = String.format("/api/projects/%s/custom-fields/%s", UUID_REGEX, UUID_REGEX);
    public static final String API_PROJECTS_PROJECT_MAPPINGS = String.format("/api/projects/%s/project-mappings", UUID_REGEX);
    public static final String API_PROJECTS_TAGS_WITH_ID = String.format("/api/projects/%s/tags/%s", UUID_REGEX, UUID_REGEX);
    public static final String API_PROJECTS_USERGROUPS_WITH_ID = String.format("/api/projects/%s/usergroups/%s", UUID_REGEX, UUID_REGEX);
    public static final String API_PROJECTS_USERS_WITH_ID = String.format("/api/projects/%s/users/%s", UUID_REGEX, UUID_REGEX);
    public static final String API_PROJECTS_VERSIONS_WITH_ID = String.format("/api/projects/%s/versions/%s", UUID_REGEX, UUID_REGEX);
    public static final String API_PROJECTS_VERSIONS_CODE_LOCATIONS = String.format("/api/projects/%s/versions/%s/code-locations", UUID_REGEX, UUID_REGEX);
    public static final String API_PROJECTS_VERSIONS_COMPONENTS_WITH_ID = String.format("/api/projects/%s/versions/%s/components/%s", UUID_REGEX, UUID_REGEX, UUID_REGEX);
    public static final String API_PROJECTS_VERSIONS_COMPONENTS_COMMENTS_WITH_ID = String.format("/api/projects/%s/versions/%s/components/%s/comments/%s", UUID_REGEX, UUID_REGEX, UUID_REGEX, UUID_REGEX);
    public static final String API_PROJECTS_VERSIONS_COMPONENTS_COMPONENT_VERSIONS_COMMENTS_WITH_ID = String.format("/api/projects/%s/versions/%s/components/%s/component-versions/%s/comments/%s", UUID_REGEX, UUID_REGEX, UUID_REGEX, UUID_REGEX, UUID_REGEX);
    public static final String API_PROJECTS_VERSIONS_COMPONENTS_CUSTOM_FIELDS_WITH_ID = String.format("/api/projects/%s/versions/%s/components/%s/custom-fields/%s", UUID_REGEX, UUID_REGEX, UUID_REGEX, UUID_REGEX);
    public static final String API_PROJECTS_VERSIONS_COMPONENTS_MATCHED_FILES = String.format("/api/projects/%s/versions/%s/components/%s/matched-files", UUID_REGEX, UUID_REGEX, UUID_REGEX);
    public static final String API_PROJECTS_VERSIONS_COMPONENTS_POLICY_RULES = String.format("/api/projects/%s/versions/%s/components/%s/policy-rules", UUID_REGEX, UUID_REGEX, UUID_REGEX);
    public static final String API_PROJECTS_VERSIONS_COMPONENTS_POLICY_STATUS = String.format("/api/projects/%s/versions/%s/components/%s/policy-status", UUID_REGEX, UUID_REGEX, UUID_REGEX);
    public static final String API_PROJECTS_VERSIONS_COMPONENTS_VERSIONS_CUSTOM_FIELDS_WITH_ID = String.format("/api/projects/%s/versions/%s/components/%s/versions/%s/custom-fields/%s", UUID_REGEX, UUID_REGEX, UUID_REGEX, UUID_REGEX, UUID_REGEX);
    public static final String API_PROJECTS_VERSIONS_COMPONENTS_VERSIONS_MATCHED_FILES = String.format("/api/projects/%s/versions/%s/components/%s/versions/%s/matched-files", UUID_REGEX, UUID_REGEX, UUID_REGEX, UUID_REGEX);
    public static final String API_PROJECTS_VERSIONS_COMPONENTS_VERSIONS_ORIGINS_MATCHED_FILES = String.format("/api/projects/%s/versions/%s/components/%s/versions/%s/origins/%s/matched-files", UUID_REGEX, UUID_REGEX, UUID_REGEX, UUID_REGEX, UUID_REGEX);
    public static final String API_PROJECTS_VERSIONS_COMPONENTS_VERSIONS_POLICY_STATUS = String.format("/api/projects/%s/versions/%s/components/%s/versions/%s/policy-status", UUID_REGEX, UUID_REGEX, UUID_REGEX, UUID_REGEX);
    public static final String API_PROJECTS_VERSIONS_CUSTOM_FIELDS_WITH_ID = String.format("/api/projects/%s/versions/%s/custom-fields/%s", UUID_REGEX, UUID_REGEX, UUID_REGEX);
    public static final String API_PROJECTS_VERSIONS_ISSUES = String.format("/api/projects/%s/versions/%s/issues", UUID_REGEX, UUID_REGEX);
    public static final String API_PROJECTS_VERSIONS_LICENSE_REPORTS = String.format("/api/projects/%s/versions/%s/license-reports", UUID_REGEX, UUID_REGEX);
    public static final String API_PROJECTS_VERSIONS_MATCHED_FILES = String.format("/api/projects/%s/versions/%s/matched-files", UUID_REGEX, UUID_REGEX);
    public static final String API_PROJECTS_VERSIONS_POLICY_STATUS = String.format("/api/projects/%s/versions/%s/policy-status", UUID_REGEX, UUID_REGEX);
    public static final String API_PROJECTS_VERSIONS_VULNERABLE_BOM_COMPONENTS = String.format("/api/projects/%s/versions/%s/vulnerable-bom-components", UUID_REGEX, UUID_REGEX);
    public static final String API_REGISTRATION = String.format("/api/registration");
    public static final String API_REPORTS_CONTENTS = String.format("/api/reports/%s/contents", UUID_REGEX);
    public static final String API_ROLES_WITH_ID = String.format("/api/roles/%s", UUID_REGEX);
    public static final String API_SCAN_SUMMARIES_WITH_ID = String.format("/api/scan-summaries/%s", UUID_REGEX);
    public static final String API_USERGROUPS_WITH_ID = String.format("/api/usergroups/%s", UUID_REGEX);
    public static final String API_USERGROUPS_PROJECTS = String.format("/api/usergroups/%s/projects", UUID_REGEX);
    public static final String API_USERGROUPS_USERS = String.format("/api/usergroups/%s/users", UUID_REGEX);
    public static final String API_USERS_WITH_ID = String.format("/api/users/%s", UUID_REGEX);
    public static final String API_USERS_NOTIFICATION_SUBSCRIPTIONS_WITH_ID = String.format("/api/users/%s/notification-subscriptions/%s", UUID_REGEX, UUID_REGEX);
    public static final String API_USERS_NOTIFICATIONS = String.format("/api/users/%s/notifications", UUID_REGEX);
    public static final String API_USERS_PROJECTS = String.format("/api/users/%s/projects", UUID_REGEX);
    public static final String API_USERS_ROLES_WITH_ID = String.format("/api/users/%s/roles/%s", UUID_REGEX, UUID_REGEX);
    public static final String API_VERSIONS_LICENSE_REPORTS_WITH_ID = String.format("/api/versions/%s/license-reports/%s", UUID_REGEX, UUID_REGEX);
    public static final String API_VERSIONS_REPORTS_WITH_ID = String.format("/api/versions/%s/reports/%s", UUID_REGEX, UUID_REGEX);
    public static final String API_VULNERABILITIES_WITH_ID = String.format("/api/vulnerabilities/%s", UUID_REGEX);
    public static final String API_VULNERABILITIES_AFFECTED_PROJECTS = String.format("/api/vulnerabilities/%s/affected-projects", UUID_REGEX);
    public static final String API_VULNERABILITY_REPORTS_WITH_ID = String.format("/api/vulnerability-reports/%s", UUID_REGEX);

    private List<MediaTypeMatcher> mediaTypeMatchers = new LinkedList<>();

    // This class contains a list of regular expressions to perform matches on the URL path.
    // A URL path should only match one expression in the list.
    // The expressions are sorted in alphabetical order.
    // The forward slash in the path should be escaped to avoid potential errors.
    // The parts of a path that are variable are the UUIDs for the resources.

    // The string to escape forward slash is: \\/
    // The regex pattern for a UUID is: \\b[a-f0-9]{8}\\b-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-\\b[a-f0-9]{12}\\b
    public BlackDuckMediaTypeDiscovery() {
        mediaTypeMatchers.add(new MediaTypeMatcher(API_CODELOCATIONS_WITH_ID, VND_BLACKDUCKSOFTWARE_SCAN_4_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_COMPONENTS, VND_BLACKDUCKSOFTWARE_COMPONENT_DETAIL_4_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_COMPONENTS_CUSTOM_FIELDS_WITH_ID, VND_BLACKDUCKSOFTWARE_COMPONENT_DETAIL_5_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_COMPONENTS_TAGS_WITH_ID, VND_BLACKDUCKSOFTWARE_COMPONENT_DETAIL_5_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_COMPONENTS_VERSIONS_CUSTOM_FIELDS_WITH_ID, VND_BLACKDUCKSOFTWARE_COMPONENT_DETAIL_5_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_COMPONENTS_VERSIONS_LICENSES_TEXT, VND_BLACKDUCKSOFTWARE_COMPONENT_DETAIL_5_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_COMPONENTS_VERSIONS_LICENSES_WITH_ID, VND_BLACKDUCKSOFTWARE_COMPONENT_DETAIL_5_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_COMPONENTS_VERSIONS_ORIGINS_WITH_ID, VND_BLACKDUCKSOFTWARE_COMPONENT_DETAIL_5_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_COMPONENTS_VERSIONS_REMEDIATING, VND_BLACKDUCKSOFTWARE_COMPONENT_DETAIL_5_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_COMPONENTS_VERSIONS_RISK_PROFILE, VND_BLACKDUCKSOFTWARE_COMPONENT_DETAIL_5_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_COMPONENTS_VERSIONS_WITH_ID, VND_BLACKDUCKSOFTWARE_COMPONENT_DETAIL_5_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_COMPONENTS_WITH_ID, VND_BLACKDUCKSOFTWARE_COMPONENT_DETAIL_4_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_CURRENT_USER, VND_BLACKDUCKSOFTWARE_USER_4_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_CURRENT_VERSION, VND_BLACKDUCKSOFTWARE_STATUS_4_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_CUSTOM_FIELDS_OBJECTS_CUSTOMFIELDOBJECT, VND_BLACKDUCKSOFTWARE_ADMIN_4_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_CUSTOM_FIELDS_OBJECTS_CUSTOMFIELDOBJECT_FIELDS_OPTIONS, VND_BLACKDUCKSOFTWARE_ADMIN_4_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_CUSTOM_FIELDS_OBJECTS_CUSTOMFIELDOBJECT_FIELDS_WITH_ID, VND_BLACKDUCKSOFTWARE_ADMIN_4_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_CUSTOM_FIELDS_TYPES, VND_BLACKDUCKSOFTWARE_ADMIN_4_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_CWES_WITH_ID, VND_BLACKDUCKSOFTWARE_VULNERABILITY_4_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_JOBS_WITH_ID, VND_BLACKDUCKSOFTWARE_STATUS_4_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_LICENSES_COMMENTS_WITH_ID, VND_BLACKDUCKSOFTWARE_PROJECT_DETAIL_4_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_LICENSES_LICENSE_TERMS_WITH_ID, VND_BLACKDUCKSOFTWARE_COMPONENT_DETAIL_5_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_LICENSES_TEXT, VND_BLACKDUCKSOFTWARE_COMPONENT_DETAIL_5_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_LICENSES_WITH_ID, VND_BLACKDUCKSOFTWARE_COMPONENT_DETAIL_5_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_LICENSE_FAMILIES_WITH_ID, VND_BLACKDUCKSOFTWARE_COMPONENT_DETAIL_5_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_LICENSE_TERMS_LICENSES_WITH_ID, VND_BLACKDUCKSOFTWARE_COMPONENT_DETAIL_5_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_LICENSE_TERMS_WITH_ID, VND_BLACKDUCKSOFTWARE_COMPONENT_DETAIL_5_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_POLICY_RULES_WITH_ID, VND_BLACKDUCKSOFTWARE_POLICY_5_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_PROJECTS_CUSTOM_FIELDS_WITH_ID, VND_BLACKDUCKSOFTWARE_PROJECT_DETAIL_5_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_PROJECTS_PROJECT_MAPPINGS, VND_BLACKDUCKSOFTWARE_PROJECT_DETAIL_4_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_PROJECTS_TAGS_WITH_ID, VND_BLACKDUCKSOFTWARE_PROJECT_DETAIL_5_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_PROJECTS_USERGROUPS_WITH_ID, VND_BLACKDUCKSOFTWARE_PROJECT_DETAIL_4_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_PROJECTS_USERS_WITH_ID, VND_BLACKDUCKSOFTWARE_PROJECT_DETAIL_4_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_PROJECTS_VERSIONS_CODE_LOCATIONS, VND_BLACKDUCKSOFTWARE_INTERNAL_1_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_PROJECTS_VERSIONS_COMPONENTS_COMMENTS_WITH_ID, VND_BLACKDUCKSOFTWARE_BILL_OF_MATERIALS_6_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_PROJECTS_VERSIONS_COMPONENTS_COMPONENT_VERSIONS_COMMENTS_WITH_ID, VND_BLACKDUCKSOFTWARE_BILL_OF_MATERIALS_6_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_PROJECTS_VERSIONS_COMPONENTS_CUSTOM_FIELDS_WITH_ID, VND_BLACKDUCKSOFTWARE_BILL_OF_MATERIALS_6_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_PROJECTS_VERSIONS_COMPONENTS_MATCHED_FILES, VND_BLACKDUCKSOFTWARE_BILL_OF_MATERIALS_6_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_PROJECTS_VERSIONS_COMPONENTS_POLICY_RULES, VND_BLACKDUCKSOFTWARE_BILL_OF_MATERIALS_6_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_PROJECTS_VERSIONS_COMPONENTS_POLICY_STATUS, VND_BLACKDUCKSOFTWARE_BILL_OF_MATERIALS_6_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_PROJECTS_VERSIONS_COMPONENTS_VERSIONS_CUSTOM_FIELDS_WITH_ID, VND_BLACKDUCKSOFTWARE_BILL_OF_MATERIALS_6_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_PROJECTS_VERSIONS_COMPONENTS_VERSIONS_MATCHED_FILES, VND_BLACKDUCKSOFTWARE_BILL_OF_MATERIALS_6_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_PROJECTS_VERSIONS_COMPONENTS_VERSIONS_ORIGINS_MATCHED_FILES, VND_BLACKDUCKSOFTWARE_BILL_OF_MATERIALS_6_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_PROJECTS_VERSIONS_COMPONENTS_VERSIONS_POLICY_STATUS, VND_BLACKDUCKSOFTWARE_BILL_OF_MATERIALS_6_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_PROJECTS_VERSIONS_COMPONENTS_WITH_ID, VND_BLACKDUCKSOFTWARE_BILL_OF_MATERIALS_6_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_PROJECTS_VERSIONS_CUSTOM_FIELDS_WITH_ID, VND_BLACKDUCKSOFTWARE_PROJECT_DETAIL_5_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_PROJECTS_VERSIONS_ISSUES, DEFAULT_MEDIA_TYPE));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_PROJECTS_VERSIONS_LICENSE_REPORTS, VND_BLACKDUCKSOFTWARE_REPORT_4_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_PROJECTS_VERSIONS_MATCHED_FILES, VND_BLACKDUCKSOFTWARE_BILL_OF_MATERIALS_6_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_PROJECTS_VERSIONS_POLICY_STATUS, VND_BLACKDUCKSOFTWARE_BILL_OF_MATERIALS_6_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_PROJECTS_VERSIONS_VULNERABLE_BOM_COMPONENTS, VND_BLACKDUCKSOFTWARE_BILL_OF_MATERIALS_6_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_PROJECTS_VERSIONS_WITH_ID, VND_BLACKDUCKSOFTWARE_PROJECT_DETAIL_5_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_PROJECTS_WITH_ID, VND_BLACKDUCKSOFTWARE_PROJECT_DETAIL_4_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_REGISTRATION, VND_BLACKDUCKSOFTWARE_STATUS_4_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_REPORTS_CONTENTS, VND_BLACKDUCKSOFTWARE_REPORT_4_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_ROLES_WITH_ID, VND_BLACKDUCKSOFTWARE_USER_4_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_SCAN_SUMMARIES_WITH_ID, VND_BLACKDUCKSOFTWARE_SCAN_4_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_USERGROUPS_PROJECTS, VND_BLACKDUCKSOFTWARE_PROJECT_DETAIL_4_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_USERGROUPS_USERS, VND_BLACKDUCKSOFTWARE_USER_4_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_USERGROUPS_WITH_ID, VND_BLACKDUCKSOFTWARE_USER_4_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_USERS_NOTIFICATIONS, VND_BLACKDUCKSOFTWARE_NOTIFICATION_4_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_USERS_NOTIFICATION_SUBSCRIPTIONS_WITH_ID, VND_BLACKDUCKSOFTWARE_NOTIFICATION_4_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_USERS_PROJECTS, VND_BLACKDUCKSOFTWARE_PROJECT_DETAIL_4_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_USERS_ROLES_WITH_ID, VND_BLACKDUCKSOFTWARE_USER_4_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_USERS_WITH_ID, VND_BLACKDUCKSOFTWARE_USER_4_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_VERSIONS_LICENSE_REPORTS_WITH_ID, VND_BLACKDUCKSOFTWARE_REPORT_4_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_VERSIONS_REPORTS_WITH_ID, VND_BLACKDUCKSOFTWARE_REPORT_4_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_VULNERABILITIES_AFFECTED_PROJECTS, VND_BLACKDUCKSOFTWARE_VULNERABILITY_4_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_VULNERABILITIES_WITH_ID, VND_BLACKDUCKSOFTWARE_VULNERABILITY_4_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_VULNERABILITY_REPORTS_WITH_ID, VND_BLACKDUCKSOFTWARE_REPORT_4_JSON));
    }

    public String determineMediaType(HttpUrl url) {
        String path = url.url().getPath();
        return mediaTypeMatchers.stream()
                .filter(matcher -> matcher.getPattern().matcher(path).matches())
                .map(MediaTypeMatcher::getMediaType)
                .findFirst()
                .orElse(DEFAULT_MEDIA_TYPE);
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
