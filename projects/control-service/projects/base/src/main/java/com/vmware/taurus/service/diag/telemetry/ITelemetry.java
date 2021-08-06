/*
 * Copyright (c) 2021 VMware, Inc.
 * SPDX-License-Identifier: Apache-2.0
 */

package com.vmware.taurus.service.diag.telemetry;

public interface ITelemetry {
    /**
     * @param payload json to be sent as payload.
     */
    void sendAsync(String payload);
}
