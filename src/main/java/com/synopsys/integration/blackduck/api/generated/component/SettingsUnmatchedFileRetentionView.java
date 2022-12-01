/*
 * blackduck-common-api
 *
 * Copyright (c) 2022 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.synopsys.integration.blackduck.api.generated.component;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class SettingsUnmatchedFileRetentionView extends BlackDuckComponent {
    private Boolean purgeUnmatchedFilesEnabled;
    private Boolean unmatchedFileRetentionEnabled;

    public Boolean getPurgeUnmatchedFilesEnabled() {
        return purgeUnmatchedFilesEnabled;
    }

    public void setPurgeUnmatchedFilesEnabled(Boolean purgeUnmatchedFilesEnabled) {
        this.purgeUnmatchedFilesEnabled = purgeUnmatchedFilesEnabled;
    }

    public Boolean getUnmatchedFileRetentionEnabled() {
        return unmatchedFileRetentionEnabled;
    }

    public void setUnmatchedFileRetentionEnabled(Boolean unmatchedFileRetentionEnabled) {
        this.unmatchedFileRetentionEnabled = unmatchedFileRetentionEnabled;
    }

}