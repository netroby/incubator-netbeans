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

package org.netbeans.modules.db.sql.editor.ui.actions;

import java.awt.Toolkit;
import org.netbeans.api.db.explorer.ConnectionManager;
import org.netbeans.api.db.explorer.DatabaseConnection;
import org.netbeans.modules.db.api.sql.execute.SQLExecution;
import org.openide.util.NbBundle;

/**
 *
 * @author Andrei Badea
 */
public class SelectInExplorerAction extends SQLExecutionBaseAction {

    private static final String ICON_PATH = "org/netbeans/modules/db/sql/editor/resources/showinexplorer.gif"; // NOI18N

    protected String getIconBase() {
        return ICON_PATH;
    }

    protected String getDisplayName(SQLExecution sqlExecution) {
        return NbBundle.getMessage(SelectInExplorerAction.class, "LBL_SelectInExplorerAction");
    }

    protected boolean enable(SQLExecution sqlExecution) {
        return true;
    }

    protected void actionPerformed(SQLExecution sqlExecution) {
        DatabaseConnection dbconn = sqlExecution.getDatabaseConnection();
        if (dbconn != null) {
            ConnectionManager.getDefault().selectConnectionInExplorer(dbconn);
        } else {
            notifyNoDatabaseConnection();
        }
    }
}
