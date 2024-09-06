/*
 * blackduck-common-api
 *
 * Copyright (c) 2024 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.blackduck.integration.blackduck.api.generated.component;

import com.blackduck.integration.blackduck.api.core.BlackDuckComponent;
import com.blackduck.integration.blackduck.api.generated.enumeration.SettingsUnmatchedFileRetentionPurgeUnmatchedFilesEnabledType;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class SettingsUnmatchedFileRetentionView extends BlackDuckComponent {
    private SettingsUnmatchedFileRetentionPurgeUnmatchedFilesEnabledType purgeUnmatchedFilesEnabled;
    private Boolean unmatchedFileRetentionEnabled;

    public SettingsUnmatchedFileRetentionPurgeUnmatchedFilesEnabledType getPurgeUnmatchedFilesEnabled() {
        return purgeUnmatchedFilesEnabled;
    }

    public void setPurgeUnmatchedFilesEnabled(SettingsUnmatchedFileRetentionPurgeUnmatchedFilesEnabledType purgeUnmatchedFilesEnabled) {
        this.purgeUnmatchedFilesEnabled = purgeUnmatchedFilesEnabled;
    }

    public Boolean getUnmatchedFileRetentionEnabled() {
        return unmatchedFileRetentionEnabled;
    }

    public void setUnmatchedFileRetentionEnabled(Boolean unmatchedFileRetentionEnabled) {
        this.unmatchedFileRetentionEnabled = unmatchedFileRetentionEnabled;
    }

}
