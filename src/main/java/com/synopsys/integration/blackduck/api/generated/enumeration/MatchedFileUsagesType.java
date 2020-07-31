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

@Deprecated
/**
* MatchedFileUsagesType is now called LicenseFamilyLicenseFamilyRiskRulesUsageType
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public enum MatchedFileUsagesType {
	SOURCE_CODE,
	STATICALLY_LINKED,
	DYNAMICALLY_LINKED,
	SEPARATE_WORK,
	MERELY_AGGREGATED,
	IMPLEMENTATION_OF_STANDARD,
	PREREQUISITE,
	DEV_TOOL_EXCLUDED;

	public String prettyPrint() {
	    return EnumUtils.prettyPrint(this);
	}

}
