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
package com.synopsys.integration.blackduck.api.generated.enumeration;

import com.synopsys.integration.util.EnumUtils;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public enum MatchType {
    BINARY,
	FILE_DEPENDENCY,
	FILE_DEPENDENCY_DIRECT,
	FILE_DEPENDENCY_TRANSITIVE,
	FILE_EXACT,
	FILE_EXACT_FILE_MATCH,
	FILE_FILES_ADDED_DELETED_AND_MODIFIED,
	FILE_SOME_FILES_MODIFIED,
	MANUAL_BOM_COMPONENT,
	MANUAL_BOM_FILE,
	PARTIAL_FILE,
	SNIPPET;

    public String prettyPrint() {
        return EnumUtils.prettyPrint(this);
    }

}
