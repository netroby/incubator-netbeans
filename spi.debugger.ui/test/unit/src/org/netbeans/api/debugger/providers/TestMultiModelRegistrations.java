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

package org.netbeans.api.debugger.providers;

import java.util.HashSet;
import java.util.Set;
import org.netbeans.spi.debugger.DebuggerServiceRegistration;
import org.netbeans.spi.debugger.DebuggerServiceRegistrations;
import org.netbeans.spi.viewmodel.ModelListener;
import org.netbeans.spi.viewmodel.NodeModel;
import org.netbeans.spi.viewmodel.TableModel;
import org.netbeans.spi.viewmodel.TreeModel;
import org.netbeans.spi.viewmodel.UnknownTypeException;

/**
 *
 * @author Martin Entlicher
 */
@DebuggerServiceRegistrations({
    @DebuggerServiceRegistration(path="unittest/annotated1", types=TreeModel.class),
    @DebuggerServiceRegistration(path="unittest/annotated2", types={NodeModel.class, TableModel.class}),
    @DebuggerServiceRegistration(path="unittest/annotated3", types={NodeModel.class, TableModel.class})
})
public class TestMultiModelRegistrations implements TreeModel, NodeModel, TableModel {
    
    public static Set<TestMultiModelRegistrations> INSTANCES = new HashSet<TestMultiModelRegistrations>();

    public TestMultiModelRegistrations() {
        INSTANCES.add(this);
    }

    public Object getRoot() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Object[] getChildren(Object parent, int from, int to) throws UnknownTypeException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean isLeaf(Object node) throws UnknownTypeException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int getChildrenCount(Object node) throws UnknownTypeException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void addModelListener(ModelListener l) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void removeModelListener(ModelListener l) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String getDisplayName(Object node) throws UnknownTypeException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String getIconBase(Object node) throws UnknownTypeException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String getShortDescription(Object node) throws UnknownTypeException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Object getValueAt(Object node, String columnID) throws UnknownTypeException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean isReadOnly(Object node, String columnID) throws UnknownTypeException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setValueAt(Object node, String columnID, Object value) throws UnknownTypeException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
