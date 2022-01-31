/*
 * blackduck-common-api
 *
 * Copyright (c) 2022 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.synopsys.integration.blackduck.api.generated.component;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.generated.component.ProjectVersionMatchedFilesItemsMatchesView;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ProjectVersionMatchedFilesView extends BlackDuckComponent {
    private String declaredComponentPath;
    private java.util.List<ProjectVersionMatchedFilesItemsMatchesView> matches;
    private String sha1;
    private String uri;

    public String getDeclaredComponentPath() {
        return declaredComponentPath;
    }

    public void setDeclaredComponentPath(String declaredComponentPath) {
        this.declaredComponentPath = declaredComponentPath;
    }

    public java.util.List<ProjectVersionMatchedFilesItemsMatchesView> getMatches() {
        return matches;
    }

    public void setMatches(java.util.List<ProjectVersionMatchedFilesItemsMatchesView> matches) {
        this.matches = matches;
    }

    public String getSha1() {
        return sha1;
    }

    public void setSha1(String sha1) {
        this.sha1 = sha1;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

}
