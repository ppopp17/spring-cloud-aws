/*
 * Copyright 2013-2014 the original author or authors.
 *
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

package org.springframework.cloud.aws.core.env;

/**
 * Provides support for resolving logical resource ids to physical resource ids.
 *
 * @author Christian Stettler
 */
public interface ResourceIdResolver {

    /**
     * Resolves the provided logical resource id to the corresponding physical resource id. If the implementation is
     * unable to resolve the logical resource id to a physical one based on the specific resource information available,
     * the logical resource id is returned as the physical one.
     * <p>
     * This resolving mechanism provides no guarantees on existence of the resource denoted by the resolved physical
     * resource id.
     * </p>
     *
     * @param logicalResourceId
     *         the logical resource id to be resolved
     * @return the physical resource id
     */
    String resolveToPhysicalResourceId(String logicalResourceId);

}
