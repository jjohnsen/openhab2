/*
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
 */
package org.openhab.io.rest.docs.swagger.model;

import java.util.List;

/* Data Objects for JSON, as defined in the spec: https://github.com/wordnik/swagger-core/wiki */
public class SwaggerAPIPath {
    public final String path;
    public final String description;
    public final List<SwaggerOperation> operations;

    public SwaggerAPIPath(String path, String description, List<SwaggerOperation> operations) {
        this.path = path;
        this.description = description;
        this.operations = operations;
    }
}