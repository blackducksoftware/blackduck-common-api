/*
 * blackduck-common-api
 *
 * Copyright (c) 2023 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.synopsys.integration.blackduck.api.generated.component;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ComponentOriginMatchedFilesItemsFilePathView extends BlackDuckComponent {
    private String archiveContext;
    private String compositePathContext;
    private String fileName;
    private String path;

    public String getArchiveContext() {
        return archiveContext;
    }

    public void setArchiveContext(String archiveContext) {
        this.archiveContext = archiveContext;
    }

    public String getCompositePathContext() {
        return compositePathContext;
    }

    public void setCompositePathContext(String compositePathContext) {
        this.compositePathContext = compositePathContext;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

}
