/*
 * Copyright (c) 2020-2022 Red Hat, Inc.
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *   Red Hat, Inc. - initial API and implementation
 */
package com.redhat.devworkspace.services.telemetry.amplitude.exception;

public class WoopraCredentialException extends RuntimeException {

    public WoopraCredentialException() {
        super();
    }

    public WoopraCredentialException(String message) {
        super(message);
    }
}
