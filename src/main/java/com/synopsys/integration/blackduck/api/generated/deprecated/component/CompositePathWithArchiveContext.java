package com.synopsys.integration.blackduck.api.generated.deprecated.component;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;

@Deprecated
/**
* CompositePathWithArchiveContext from the previous API is now called ComponentMatchedFilesItemsFilePathView
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public class CompositePathWithArchiveContext extends BlackDuckComponent {
    private String path;
    private String fileName;
    private String archiveContext;
    private String compositePathContext;

    public String getPath() {
	    return path;
    }

    public void setPath(String path) {
	    this.path = path;
    }

    public String getFileName() {
	    return fileName;
    }

    public void setFileName(String fileName) {
	    this.fileName = fileName;
    }

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

}