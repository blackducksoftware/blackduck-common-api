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
import java.util.Optional;
import java.util.regex.Pattern;


//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class MediaTypeDiscovery {
    public static final String DEFAULT_MEDIA_TYPE = "application/json";
    private List<MediaTypeMatcher> mediaTypeMatchers = new LinkedList<>();

    public MediaTypeDiscovery() {
        mediaTypeMatchers.add(new MediaTypeMatcher("/api/codelocations", "application/vnd.blackducksoftware.scan-4+json"));
        mediaTypeMatchers.add(new MediaTypeMatcher("/api/codelocations/\\b[a-f0-9]{8}\\b-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-\\b[a-f0-9]{12}\\b/scan-summaries", "application/vnd.blackducksoftware.scan-4+json"));
        mediaTypeMatchers.add(new MediaTypeMatcher("/api/components", "application/vnd.blackducksoftware.component-detail-4+json"));
        mediaTypeMatchers.add(new MediaTypeMatcher("/api/components/\\b[a-f0-9]{8}\\b-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-\\b[a-f0-9]{12}\\b/custom-fields", "application/vnd.blackducksoftware.component-detail-5+json"));
        mediaTypeMatchers.add(new MediaTypeMatcher("/api/components/\\b[a-f0-9]{8}\\b-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-\\b[a-f0-9]{12}\\b/tags", "application/vnd.blackducksoftware.component-detail-5+json"));
        mediaTypeMatchers.add(new MediaTypeMatcher("/api/components/\\b[a-f0-9]{8}\\b-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-\\b[a-f0-9]{12}\\b/versions", "application/vnd.blackducksoftware.component-detail-5+json"));
        mediaTypeMatchers.add(new MediaTypeMatcher("/api/components/\\b[a-f0-9]{8}\\b-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-\\b[a-f0-9]{12}\\b/versions/\\b[a-f0-9]{8}\\b-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-\\b[a-f0-9]{12}\\b/custom-fields", "application/vnd.blackducksoftware.component-detail-5+json"));
        mediaTypeMatchers.add(new MediaTypeMatcher("/api/components/\\b[a-f0-9]{8}\\b-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-\\b[a-f0-9]{12}\\b/versions/\\b[a-f0-9]{8}\\b-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-\\b[a-f0-9]{12}\\b/origin/\\b[a-f0-9]{8}\\b-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-\\b[a-f0-9]{12}\\b/vulnerabilities", "application/vnd.blackducksoftware.vulnerability-4+json"));
        mediaTypeMatchers.add(new MediaTypeMatcher("/api/components/\\b[a-f0-9]{8}\\b-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-\\b[a-f0-9]{12}\\b/versions/\\b[a-f0-9]{8}\\b-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-\\b[a-f0-9]{12}\\b/origins", "application/vnd.blackducksoftware.component-detail-5+json"));
        mediaTypeMatchers.add(new MediaTypeMatcher("/api/components/\\b[a-f0-9]{8}\\b-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-\\b[a-f0-9]{12}\\b/versions/\\b[a-f0-9]{8}\\b-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-\\b[a-f0-9]{12}\\b/origins/\\b[a-f0-9]{8}\\b-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-\\b[a-f0-9]{12}\\b/direct-dependencies", "application/vnd.blackducksoftware.component-detail-4+json"));
        mediaTypeMatchers.add(new MediaTypeMatcher("/api/components/\\b[a-f0-9]{8}\\b-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-\\b[a-f0-9]{12}\\b/versions/\\b[a-f0-9]{8}\\b-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-\\b[a-f0-9]{12}\\b/vulnerabilities", "application/vnd.blackducksoftware.vulnerability-4+json"));
        mediaTypeMatchers.add(new MediaTypeMatcher("/api/components/\\b[a-f0-9]{8}\\b-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-\\b[a-f0-9]{12}\\b/vulnerabilities", "application/vnd.blackducksoftware.vulnerability-4+json"));
        mediaTypeMatchers.add(new MediaTypeMatcher("/api/custom-fields/objects/customFieldObject/fields", "application/vnd.blackducksoftware.admin-4+json"));
        mediaTypeMatchers.add(new MediaTypeMatcher("/api/jobs", "application/vnd.blackducksoftware.status-4+json"));
        mediaTypeMatchers.add(new MediaTypeMatcher("/api/license-families", "application/vnd.blackducksoftware.component-detail-5+json"));
        mediaTypeMatchers.add(new MediaTypeMatcher("/api/license-term-categories", "application/vnd.blackducksoftware.component-detail-5+json"));
        mediaTypeMatchers.add(new MediaTypeMatcher("/api/license-terms", "application/vnd.blackducksoftware.component-detail-5+json"));
        mediaTypeMatchers.add(new MediaTypeMatcher("/api/license-terms/\\b[a-f0-9]{8}\\b-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-\\b[a-f0-9]{12}\\b/licenses", "application/vnd.blackducksoftware.component-detail-5+json"));
        mediaTypeMatchers.add(new MediaTypeMatcher("/api/licenses", "application/vnd.blackducksoftware.component-detail-5+json"));
        mediaTypeMatchers.add(new MediaTypeMatcher("/api/licenses/\\b[a-f0-9]{8}\\b-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-\\b[a-f0-9]{12}\\b/comments", "application/vnd.blackducksoftware.project-detail-4+json"));
        mediaTypeMatchers.add(new MediaTypeMatcher("/api/licenses/\\b[a-f0-9]{8}\\b-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-\\b[a-f0-9]{12}\\b/license-terms", "application/vnd.blackducksoftware.component-detail-5+json"));
        mediaTypeMatchers.add(new MediaTypeMatcher("/api/policy-rules", "application/vnd.blackducksoftware.policy-5+json"));
        mediaTypeMatchers.add(new MediaTypeMatcher("/api/projects", "application/vnd.blackducksoftware.project-detail-4+json"));
        mediaTypeMatchers.add(new MediaTypeMatcher("/api/projects/\\b[a-f0-9]{8}\\b-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-\\b[a-f0-9]{12}\\b/assignable-usergroups", "application/vnd.blackducksoftware.project-detail-4+json"));
        mediaTypeMatchers.add(new MediaTypeMatcher("/api/projects/\\b[a-f0-9]{8}\\b-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-\\b[a-f0-9]{12}\\b/assignable-users", "application/vnd.blackducksoftware.project-detail-4+json"));
        mediaTypeMatchers.add(new MediaTypeMatcher("/api/projects/\\b[a-f0-9]{8}\\b-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-\\b[a-f0-9]{12}\\b/custom-fields", "application/vnd.blackducksoftware.project-detail-5+json"));
        mediaTypeMatchers.add(new MediaTypeMatcher("/api/projects/\\b[a-f0-9]{8}\\b-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-\\b[a-f0-9]{12}\\b/project-mappings", "application/vnd.blackducksoftware.project-detail-4+json"));
        mediaTypeMatchers.add(new MediaTypeMatcher("/api/projects/\\b[a-f0-9]{8}\\b-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-\\b[a-f0-9]{12}\\b/tags", "application/vnd.blackducksoftware.project-detail-5+json"));
        mediaTypeMatchers.add(new MediaTypeMatcher("/api/projects/\\b[a-f0-9]{8}\\b-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-\\b[a-f0-9]{12}\\b/usergroups", "application/vnd.blackducksoftware.project-detail-4+json"));
        mediaTypeMatchers.add(new MediaTypeMatcher("/api/projects/\\b[a-f0-9]{8}\\b-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-\\b[a-f0-9]{12}\\b/users", "application/vnd.blackducksoftware.project-detail-4+json"));
        mediaTypeMatchers.add(new MediaTypeMatcher("/api/projects/\\b[a-f0-9]{8}\\b-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-\\b[a-f0-9]{12}\\b/versions", "application/vnd.blackducksoftware.project-detail-5+json"));
        mediaTypeMatchers.add(new MediaTypeMatcher("/api/projects/\\b[a-f0-9]{8}\\b-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-\\b[a-f0-9]{12}\\b/versions/\\b[a-f0-9]{8}\\b-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-\\b[a-f0-9]{12}\\b/code-locations", "application/vnd.blackducksoftware.internal-1+json"));
        mediaTypeMatchers.add(new MediaTypeMatcher("/api/projects/\\b[a-f0-9]{8}\\b-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-\\b[a-f0-9]{12}\\b/versions/\\b[a-f0-9]{8}\\b-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-\\b[a-f0-9]{12}\\b/comparison", "application/vnd.blackducksoftware.bill-of-materials-6+json"));
        mediaTypeMatchers.add(new MediaTypeMatcher("/api/projects/\\b[a-f0-9]{8}\\b-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-\\b[a-f0-9]{12}\\b/versions/\\b[a-f0-9]{8}\\b-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-\\b[a-f0-9]{12}\\b/components", "application/vnd.blackducksoftware.bill-of-materials-6+json"));
        mediaTypeMatchers.add(new MediaTypeMatcher("/api/projects/\\b[a-f0-9]{8}\\b-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-\\b[a-f0-9]{12}\\b/versions/\\b[a-f0-9]{8}\\b-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-\\b[a-f0-9]{12}\\b/components/\\b[a-f0-9]{8}\\b-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-\\b[a-f0-9]{12}\\b/comments", "application/vnd.blackducksoftware.bill-of-materials-6+json"));
        mediaTypeMatchers.add(new MediaTypeMatcher("/api/projects/\\b[a-f0-9]{8}\\b-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-\\b[a-f0-9]{12}\\b/versions/\\b[a-f0-9]{8}\\b-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-\\b[a-f0-9]{12}\\b/components/\\b[a-f0-9]{8}\\b-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-\\b[a-f0-9]{12}\\b/component-versions/\\b[a-f0-9]{8}\\b-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-\\b[a-f0-9]{12}\\b/comments", "application/vnd.blackducksoftware.bill-of-materials-6+json"));
        mediaTypeMatchers.add(new MediaTypeMatcher("/api/projects/\\b[a-f0-9]{8}\\b-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-\\b[a-f0-9]{12}\\b/versions/\\b[a-f0-9]{8}\\b-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-\\b[a-f0-9]{12}\\b/components/\\b[a-f0-9]{8}\\b-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-\\b[a-f0-9]{12}\\b/custom-fields", "application/vnd.blackducksoftware.bill-of-materials-6+json"));
        mediaTypeMatchers.add(new MediaTypeMatcher("/api/projects/\\b[a-f0-9]{8}\\b-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-\\b[a-f0-9]{12}\\b/versions/\\b[a-f0-9]{8}\\b-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-\\b[a-f0-9]{12}\\b/components/\\b[a-f0-9]{8}\\b-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-\\b[a-f0-9]{12}\\b/matched-files", "application/vnd.blackducksoftware.bill-of-materials-6+json"));
        mediaTypeMatchers.add(new MediaTypeMatcher("/api/projects/\\b[a-f0-9]{8}\\b-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-\\b[a-f0-9]{12}\\b/versions/\\b[a-f0-9]{8}\\b-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-\\b[a-f0-9]{12}\\b/components/\\b[a-f0-9]{8}\\b-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-\\b[a-f0-9]{12}\\b/policy-rules", "application/vnd.blackducksoftware.bill-of-materials-6+json"));
        mediaTypeMatchers.add(new MediaTypeMatcher("/api/projects/\\b[a-f0-9]{8}\\b-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-\\b[a-f0-9]{12}\\b/versions/\\b[a-f0-9]{8}\\b-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-\\b[a-f0-9]{12}\\b/components/\\b[a-f0-9]{8}\\b-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-\\b[a-f0-9]{12}\\b/versions/\\b[a-f0-9]{8}\\b-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-\\b[a-f0-9]{12}\\b/custom-fields", "application/vnd.blackducksoftware.bill-of-materials-6+json"));
        mediaTypeMatchers.add(new MediaTypeMatcher("/api/projects/\\b[a-f0-9]{8}\\b-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-\\b[a-f0-9]{12}\\b/versions/\\b[a-f0-9]{8}\\b-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-\\b[a-f0-9]{12}\\b/components/\\b[a-f0-9]{8}\\b-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-\\b[a-f0-9]{12}\\b/versions/\\b[a-f0-9]{8}\\b-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-\\b[a-f0-9]{12}\\b/matched-files", "application/vnd.blackducksoftware.bill-of-materials-6+json"));
        mediaTypeMatchers.add(new MediaTypeMatcher("/api/projects/\\b[a-f0-9]{8}\\b-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-\\b[a-f0-9]{12}\\b/versions/\\b[a-f0-9]{8}\\b-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-\\b[a-f0-9]{12}\\b/components/\\b[a-f0-9]{8}\\b-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-\\b[a-f0-9]{12}\\b/versions/\\b[a-f0-9]{8}\\b-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-\\b[a-f0-9]{12}\\b/origins/\\b[a-f0-9]{8}\\b-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-\\b[a-f0-9]{12}\\b/matched-files", "application/vnd.blackducksoftware.bill-of-materials-6+json"));
        mediaTypeMatchers.add(new MediaTypeMatcher("/api/projects/\\b[a-f0-9]{8}\\b-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-\\b[a-f0-9]{12}\\b/versions/\\b[a-f0-9]{8}\\b-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-\\b[a-f0-9]{12}\\b/components/\\b[a-f0-9]{8}\\b-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-\\b[a-f0-9]{12}\\b/versions/\\b[a-f0-9]{8}\\b-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-\\b[a-f0-9]{12}\\b/policy-rules", "application/vnd.blackducksoftware.bill-of-materials-6+json"));
        mediaTypeMatchers.add(new MediaTypeMatcher("/api/projects/\\b[a-f0-9]{8}\\b-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-\\b[a-f0-9]{12}\\b/versions/\\b[a-f0-9]{8}\\b-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-\\b[a-f0-9]{12}\\b/custom-fields", "application/vnd.blackducksoftware.project-detail-5+json"));
        mediaTypeMatchers.add(new MediaTypeMatcher("/api/projects/\\b[a-f0-9]{8}\\b-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-\\b[a-f0-9]{12}\\b/versions/\\b[a-f0-9]{8}\\b-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-\\b[a-f0-9]{12}\\b/issues", "application/json"));
        mediaTypeMatchers.add(new MediaTypeMatcher("/api/projects/\\b[a-f0-9]{8}\\b-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-\\b[a-f0-9]{12}\\b/versions/\\b[a-f0-9]{8}\\b-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-\\b[a-f0-9]{12}\\b/license-reports", "application/vnd.blackducksoftware.report-4+json"));
        mediaTypeMatchers.add(new MediaTypeMatcher("/api/projects/\\b[a-f0-9]{8}\\b-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-\\b[a-f0-9]{12}\\b/versions/\\b[a-f0-9]{8}\\b-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-\\b[a-f0-9]{12}\\b/matched-files", "application/vnd.blackducksoftware.bill-of-materials-6+json"));
        mediaTypeMatchers.add(new MediaTypeMatcher("/api/projects/\\b[a-f0-9]{8}\\b-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-\\b[a-f0-9]{12}\\b/versions/\\b[a-f0-9]{8}\\b-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-\\b[a-f0-9]{12}\\b/vulnerable-bom-components", "application/vnd.blackducksoftware.bill-of-materials-6+json"));
        mediaTypeMatchers.add(new MediaTypeMatcher("/api/roles", "application/vnd.blackducksoftware.user-4+json"));
        mediaTypeMatchers.add(new MediaTypeMatcher("/api/roles/\\b[a-f0-9]{8}\\b-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-\\b[a-f0-9]{12}\\b/inheriting-users", "application/vnd.blackducksoftware.user-4+json"));
        mediaTypeMatchers.add(new MediaTypeMatcher("/api/roles/\\b[a-f0-9]{8}\\b-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-\\b[a-f0-9]{12}\\b/users", "application/vnd.blackducksoftware.user-4+json"));
        mediaTypeMatchers.add(new MediaTypeMatcher("/api/usergroups", "application/vnd.blackducksoftware.user-4+json"));
        mediaTypeMatchers.add(new MediaTypeMatcher("/api/usergroups/\\b[a-f0-9]{8}\\b-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-\\b[a-f0-9]{12}\\b/projects", "application/vnd.blackducksoftware.project-detail-4+json"));
        mediaTypeMatchers.add(new MediaTypeMatcher("/api/usergroups/\\b[a-f0-9]{8}\\b-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-\\b[a-f0-9]{12}\\b/users", "application/vnd.blackducksoftware.user-4+json"));
        mediaTypeMatchers.add(new MediaTypeMatcher("/api/users", "application/vnd.blackducksoftware.user-4+json"));
        mediaTypeMatchers.add(new MediaTypeMatcher("/api/users/\\b[a-f0-9]{8}\\b-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-\\b[a-f0-9]{12}\\b/inherited-roles", "application/vnd.blackducksoftware.user-4+json"));
        mediaTypeMatchers.add(new MediaTypeMatcher("/api/users/\\b[a-f0-9]{8}\\b-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-\\b[a-f0-9]{12}\\b/notification-subscriptions", "application/vnd.blackducksoftware.notification-4+json"));
        mediaTypeMatchers.add(new MediaTypeMatcher("/api/users/\\b[a-f0-9]{8}\\b-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-\\b[a-f0-9]{12}\\b/notifications", "application/vnd.blackducksoftware.notification-4+json"));
        mediaTypeMatchers.add(new MediaTypeMatcher("/api/users/\\b[a-f0-9]{8}\\b-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-\\b[a-f0-9]{12}\\b/projects", "application/vnd.blackducksoftware.project-detail-4+json"));
        mediaTypeMatchers.add(new MediaTypeMatcher("/api/users/\\b[a-f0-9]{8}\\b-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-\\b[a-f0-9]{12}\\b/roles", "application/vnd.blackducksoftware.user-4+json"));
        mediaTypeMatchers.add(new MediaTypeMatcher("/api/versions/\\b[a-f0-9]{8}\\b-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-\\b[a-f0-9]{12}\\b/license-reports", "application/vnd.blackducksoftware.report-4+json"));
        mediaTypeMatchers.add(new MediaTypeMatcher("/api/versions/\\b[a-f0-9]{8}\\b-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-\\b[a-f0-9]{12}\\b/reports", "application/vnd.blackducksoftware.report-4+json"));
        mediaTypeMatchers.add(new MediaTypeMatcher("/api/vulnerabilities/\\b[a-f0-9]{8}\\b-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-\\b[a-f0-9]{12}\\b/affected-projects", "application/vnd.blackducksoftware.vulnerability-4+json"));
        mediaTypeMatchers.add(new MediaTypeMatcher("/api/vulnerability-remediation-reports", "application/vnd.blackducksoftware.report-4+json"));
        mediaTypeMatchers.add(new MediaTypeMatcher("/api/vulnerability-status-reports", "application/vnd.blackducksoftware.report-4+json"));
        mediaTypeMatchers.add(new MediaTypeMatcher("/api/vulnerability-update-reports", "application/vnd.blackducksoftware.report-4+json"));
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
            this.pattern = Pattern.compile(pattern);
            this.mediaType = mediaType;
        }

        public Pattern getPattern() {
            return pattern;
        }

        public String getMediaType() {
            return mediaType;
        }
    }
}
