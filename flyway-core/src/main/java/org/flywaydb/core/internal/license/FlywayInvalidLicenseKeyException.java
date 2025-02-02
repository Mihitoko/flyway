/*
 * Copyright (C) Red Gate Software Ltd 2010-2023
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.flywaydb.core.internal.license;

public class FlywayInvalidLicenseKeyException extends FlywayLicensingException {
    public FlywayInvalidLicenseKeyException() {
        super("An invalid Flyway license key was provided; fell back to Community Edition. " +
                      "Remove license key and run auth to authorize online. Please contact sales at sales@flywaydb.org for license information.");
    }

    public FlywayInvalidLicenseKeyException(String message, Exception e) {
        super(message, e);
    }
}