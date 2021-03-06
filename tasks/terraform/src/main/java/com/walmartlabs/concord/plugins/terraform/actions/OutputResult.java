package com.walmartlabs.concord.plugins.terraform.actions;

/*-
 * *****
 * Concord
 * -----
 * Copyright (C) 2017 - 2019 Walmart Inc.
 * -----
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * =====
 */

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import java.io.Serializable;
import java.util.Map;

@JsonInclude(Include.NON_EMPTY)
public class OutputResult implements Serializable {

    public static OutputResult ok(Map<String, Object> data) {
        return new OutputResult(true, null, data);
    }

    public static OutputResult error(String error) {
        return new OutputResult(false, error, null);
    }

    private final boolean ok;
    private final String error;
    private final Map<String, Object> data;

    public OutputResult(boolean ok, String error, Map<String, Object> data) {
        this.ok = ok;
        this.error = error;
        this.data = data;
    }

    public boolean isOk() {
        return ok;
    }

    public String getError() {
        return error;
    }

    public Map<String, Object> getData() {
        return data;
    }
}
