/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.codebuild.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum BuildPhaseType {

    SUBMITTED("SUBMITTED"),
    PROVISIONING("PROVISIONING"),
    DOWNLOAD_SOURCE("DOWNLOAD_SOURCE"),
    INSTALL("INSTALL"),
    PRE_BUILD("PRE_BUILD"),
    BUILD("BUILD"),
    POST_BUILD("POST_BUILD"),
    UPLOAD_ARTIFACTS("UPLOAD_ARTIFACTS"),
    FINALIZING("FINALIZING"),
    COMPLETED("COMPLETED");

    private String value;

    private BuildPhaseType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value
     *        real value
     * @return BuildPhaseType corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static BuildPhaseType fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (BuildPhaseType enumEntry : BuildPhaseType.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
