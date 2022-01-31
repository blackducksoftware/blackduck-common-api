/*
 * blackduck-common-api
 *
 * Copyright (c) 2022 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.synopsys.integration.blackduck.api.manual.temporary.view;

import com.synopsys.integration.blackduck.api.core.BlackDuckView;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ExternalExtensionUserView extends BlackDuckView {
    private String extensionOptions;
    private String user;

    public String getExtensionOptions() {
        return extensionOptions;
    }

    public void setExtensionOptions(String extensionOptions) {
        this.extensionOptions = extensionOptions;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

}
