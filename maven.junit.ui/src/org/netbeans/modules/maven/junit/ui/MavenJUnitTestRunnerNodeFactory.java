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

package org.netbeans.modules.maven.junit.ui;

import org.netbeans.api.project.Project;
import org.netbeans.modules.gsf.testrunner.ui.api.TestRunnerNodeFactory;
import org.netbeans.modules.gsf.testrunner.api.TestSession;
import org.netbeans.modules.gsf.testrunner.api.Testcase;
import org.netbeans.modules.gsf.testrunner.api.CommonUtils;
import org.netbeans.modules.gsf.testrunner.ui.api.TestsuiteNode;
import org.netbeans.modules.junit.ui.api.JUnitCallstackFrameNode;
import org.netbeans.modules.junit.ui.api.JUnitTestsuiteNode;
import org.openide.nodes.Node;

/**
 * mkleint: copied from junit module
 *
 * @author answer
 */
public class MavenJUnitTestRunnerNodeFactory extends TestRunnerNodeFactory {
    private final TestSession session;
    private final Project project;

    public MavenJUnitTestRunnerNodeFactory(TestSession session, Project project) {
        this.session = session;
        this.project = project;
    }

    @Override
    public Node createTestMethodNode(Testcase testcase, Project project) {
        return new MavenJUnitTestMethodNode(testcase, project, CommonUtils.MAVEN_PROJECT_TYPE, CommonUtils.JUNIT_TF);
    }

    @Override
    public Node createCallstackFrameNode(String frameInfo, String dispayName) {
        return new JUnitCallstackFrameNode(frameInfo, dispayName, CommonUtils.MAVEN_PROJECT_TYPE, CommonUtils.JUNIT_TF);
    }

    @Override
    public TestsuiteNode createTestSuiteNode(String suiteName, boolean filtered) {
        return new JUnitTestsuiteNode(suiteName, filtered, CommonUtils.MAVEN_PROJECT_TYPE, CommonUtils.JUNIT_TF);
    }
}
