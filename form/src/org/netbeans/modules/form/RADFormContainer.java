/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */


package org.netbeans.modules.form;

/**
 *
 * @author Ian Formanek
 */
public class RADFormContainer extends RADContainer implements FormContainer {

    /** Getter for the Name property of the component - overriden to provide non-null value,
     * as the top-level component does not have a variable
     * @return current value of the Name property
     */
    @Override
    public String getName() {
        return FormUtils.getBundleString("CTL_FormTopContainerName"); // NOI18N
    }

    /** Setter for the Name property of the component - usually maps to variable declaration for holding the
     * instance of the component
     * @param value new value of the Name property
     */
    @Override
    public void setName(String value) {
        // noop in forms
    }

}
