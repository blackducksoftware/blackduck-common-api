/**
 * blackduck-common-api
 *
 * Copyright (c) 2019 Synopsys, Inc.
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
package com.synopsys.integration.blackduck.api.manual.throwaway.generated.enumeration;

import com.synopsys.integration.util.EnumUtils;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public enum CweCommonConsequenceTechnicalImpactsType {
    ALTER_EXECUTION_LOGIC,
    BYPASS_PROTECTION,
    DOS_AMPLIFICATION,
    DOS_CRASH_EXIT_RESTART,
    DOS_INSTABILITY,
    DOS_RESOURCE_CONSUMPTION_CPU,
    DOS_RESOURCE_CONSUMPTION_MEM,
    DOS_RESOURCE_CONSUMPTION_OTHER,
    EXECUTE_UNAUTHORIZED_CODE,
    GAIN_PRIVILEGES,
    HIDE_ACTIVITIES,
    MODIFY_APPLICATION_DATA,
    MODIFY_FILES_OR_DIRECTORIES,
    MODIFY_MEMORY,
    OTHER,
    QUALITY_DEGREDATION,
    READ_APPLICATION_DATA,
    READ_FILES_OR_DIRECTORIES,
    READ_MEMORY,
    UNEXPECTED_STATE,
    VARIES_BY_CONTEXT;

    public String prettyPrint() {
        return EnumUtils.prettyPrint(this);
    }

}
