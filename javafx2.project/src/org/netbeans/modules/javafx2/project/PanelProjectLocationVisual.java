/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright 1997-2011 Oracle and/or its affiliates. All rights reserved.
 *
 * Oracle and Java are registered trademarks of Oracle and/or its affiliates.
 * Other names may be trademarks of their respective owners.
 *
 * The contents of this file are subject to the terms of either the GNU
 * General Public License Version 2 only ("GPL") or the Common
 * Development and Distribution License("CDDL") (collectively, the
 * "License"). You may not use this file except in compliance with the
 * License. You can obtain a copy of the License at
 * http://www.netbeans.org/cddl-gplv2.html
 * or nbbuild/licenses/CDDL-GPL-2-CP. See the License for the
 * specific language governing permissions and limitations under the
 * License.  When distributing the software, include this License Header
 * Notice in each file and include the License file at
 * nbbuild/licenses/CDDL-GPL-2-CP.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the GPL Version 2 section of the License file that
 * accompanied this code. If applicable, add the following below the
 * License Header, with the fields enclosed by brackets [] replaced by
 * your own identifying information:
 * "Portions Copyrighted [year] [name of copyright owner]"
 *
 * Contributor(s):
 *
 * The Original Software is NetBeans. The Initial Developer of the Original
 * Software is Sun Microsystems, Inc. Portions Copyright 1997-2010 Sun
 * Microsystems, Inc. All Rights Reserved.
 *
 * If you wish your version of this file to be governed by only the CDDL
 * or only the GPL Version 2, indicate your decision by adding
 * "[Contributor] elects to include this software in this distribution
 * under the [CDDL or GPL Version 2] license." If you do not indicate a
 * single choice of license, a recipient has the option to distribute
 * your version of this file under either the CDDL, the GPL Version 2 or
 * to extend the choice of license to its licensees as provided above.
 * However, if you add GPL Version 2 code and therefore, elected the GPL
 * Version 2 license, then the option applies only if the new code is
 * made subject to such option by the copyright holder.
 */
package org.netbeans.modules.javafx2.project;

import java.io.File;
import java.io.IOException;
import java.text.MessageFormat;
import javax.swing.JFileChooser;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;
import org.netbeans.api.project.Project;
import org.netbeans.api.project.ProjectManager;
import org.netbeans.spi.project.ui.support.ProjectChooser;
import org.openide.WizardDescriptor;
import org.openide.WizardValidationException;
import org.openide.filesystems.FileUtil;
import org.openide.util.NbBundle;
import org.openide.util.Utilities;

/**
 *
 * @author  Petr Hrebejk
 */
public class PanelProjectLocationVisual extends SettingsPanel implements DocumentListener {

    public static final String PROP_PROJECT_NAME = "projectName"; // NOI18N
    public static final String PROP_PROJECT_LOCATION = "projectLocation"; // NOI18N
    private PanelConfigureProject panel;
    private JavaFXProjectWizardIterator.WizardType type;

    PanelProjectLocationVisual(PanelConfigureProject panel, JavaFXProjectWizardIterator.WizardType type) {
        this.panel = panel;
        this.type = type;
        initComponents();
        postInitComponents();
    }

    private void postInitComponents() {
        // Register listener on the textFields to make the automatic updates
        projectNameTextField.getDocument().addDocumentListener(this);
        projectLocationTextField.getDocument().addDocumentListener(this);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        projectNameLabel = new javax.swing.JLabel();
        projectNameTextField = new javax.swing.JTextField();
        projectLocationLabel = new javax.swing.JLabel();
        projectLocationTextField = new javax.swing.JTextField();
        browseButton = new javax.swing.JButton();
        createdFolderLabel = new javax.swing.JLabel();
        createdFolderTextField = new javax.swing.JTextField();

        setLayout(new java.awt.GridBagLayout());

        projectNameLabel.setLabelFor(projectNameTextField);
        org.openide.awt.Mnemonics.setLocalizedText(projectNameLabel, org.openide.util.NbBundle.getMessage(PanelProjectLocationVisual.class, "LBL_NWP1_ProjectName_Label")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 12, 0);
        add(projectNameLabel, gridBagConstraints);
        projectNameLabel.getAccessibleContext().setAccessibleName(org.openide.util.NbBundle.getBundle(PanelProjectLocationVisual.class).getString("ACSN_projectNameLabel")); // NOI18N
        projectNameLabel.getAccessibleContext().setAccessibleDescription(org.openide.util.NbBundle.getBundle(PanelProjectLocationVisual.class).getString("ACSD_projectNameLabel")); // NOI18N

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 12, 12, 0);
        add(projectNameTextField, gridBagConstraints);

        projectLocationLabel.setLabelFor(projectLocationTextField);
        org.openide.awt.Mnemonics.setLocalizedText(projectLocationLabel, org.openide.util.NbBundle.getMessage(PanelProjectLocationVisual.class, "LBL_NWP1_ProjectLocation_Label")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 0);
        add(projectLocationLabel, gridBagConstraints);
        projectLocationLabel.getAccessibleContext().setAccessibleName(org.openide.util.NbBundle.getBundle(PanelProjectLocationVisual.class).getString("ACSN_projectLocationLabel")); // NOI18N
        projectLocationLabel.getAccessibleContext().setAccessibleDescription(org.openide.util.NbBundle.getBundle(PanelProjectLocationVisual.class).getString("ACSD_projectLocationLabel")); // NOI18N

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 12, 5, 0);
        add(projectLocationTextField, gridBagConstraints);

        org.openide.awt.Mnemonics.setLocalizedText(browseButton, org.openide.util.NbBundle.getMessage(PanelProjectLocationVisual.class, "LBL_NWP1_BrowseLocation_Button")); // NOI18N
        browseButton.setActionCommand("BROWSE");
        browseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseLocationAction(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.insets = new java.awt.Insets(0, 6, 5, 0);
        add(browseButton, gridBagConstraints);
        browseButton.getAccessibleContext().setAccessibleName(org.openide.util.NbBundle.getBundle(PanelProjectLocationVisual.class).getString("ACSN_browseButton")); // NOI18N
        browseButton.getAccessibleContext().setAccessibleDescription(org.openide.util.NbBundle.getBundle(PanelProjectLocationVisual.class).getString("ACSD_browseButton")); // NOI18N

        createdFolderLabel.setLabelFor(createdFolderTextField);
        org.openide.awt.Mnemonics.setLocalizedText(createdFolderLabel, org.openide.util.NbBundle.getMessage(PanelProjectLocationVisual.class, "LBL_NWP1_CreatedProjectFolder_Lablel")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridheight = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        add(createdFolderLabel, gridBagConstraints);
        createdFolderLabel.getAccessibleContext().setAccessibleName(org.openide.util.NbBundle.getBundle(PanelProjectLocationVisual.class).getString("ACSN_createdFolderLabel")); // NOI18N
        createdFolderLabel.getAccessibleContext().setAccessibleDescription(org.openide.util.NbBundle.getBundle(PanelProjectLocationVisual.class).getString("ACSD_createdFolderLabel")); // NOI18N

        createdFolderTextField.setEditable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridheight = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 12, 0, 0);
        add(createdFolderTextField, gridBagConstraints);

        getAccessibleContext().setAccessibleName(org.openide.util.NbBundle.getMessage(PanelProjectLocationVisual.class, "ACSN_PanelProjectLocationVisual")); // NOI18N
        getAccessibleContext().setAccessibleDescription(org.openide.util.NbBundle.getMessage(PanelProjectLocationVisual.class, "ACSD_PanelProjectLocationVisual")); // NOI18N
    }// </editor-fold>//GEN-END:initComponents

    private void browseLocationAction(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseLocationAction
        String command = evt.getActionCommand();
        if ("BROWSE".equals(command)) { // NOI18N
            JFileChooser chooser = new JFileChooser();
            chooser.setDialogTitle(NbBundle.getMessage(PanelSourceFolders.class, "LBL_NWP1_SelectProjectLocation")); // NOI18N
            chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            String path = this.projectLocationTextField.getText();
            if (path.length() > 0) {
                File f = new File(path);
                if (f.exists()) {
                    chooser.setSelectedFile(f);
                }
            }
            if (JFileChooser.APPROVE_OPTION == chooser.showOpenDialog(this)) {
                File projectDir = chooser.getSelectedFile();
                projectLocationTextField.setText(FileUtil.normalizeFile(projectDir).getAbsolutePath());
            }
            panel.fireChangeEvent();
        }
    }//GEN-LAST:event_browseLocationAction

    @Override
    public void addNotify() {
        super.addNotify();
        //same problem as in 31086, initial focus on Cancel button
        projectNameTextField.requestFocus();
    }

    @Override
    boolean valid(WizardDescriptor wizardDescriptor) {
        if (JavaFXProjectWizardIterator.isIllegalProjectName(projectNameTextField.getText())) {
            wizardDescriptor.putProperty(WizardDescriptor.PROP_ERROR_MESSAGE,
                    NbBundle.getMessage(PanelProjectLocationVisual.class, "MSG_IllegalProjectName")); // NOI18N
            return false; // Display name not specified
        }

        File f = new File(projectLocationTextField.getText()).getAbsoluteFile();
        if (JavaFXProjectWizardIterator.getCanonicalFile(f) == null) {
            String message = NbBundle.getMessage(PanelProjectLocationVisual.class, "MSG_IllegalProjectLocation"); // NOI18N
            wizardDescriptor.putProperty(WizardDescriptor.PROP_ERROR_MESSAGE, message);
            return false;
        }
        
        // not allow to create project on unix root folder, see #82339
        File cfl = JavaFXProjectWizardIterator.getCanonicalFile(new File(createdFolderTextField.getText()));
        if (Utilities.isUnix() && cfl != null && cfl.getParentFile().getParent() == null) {
            String message = NbBundle.getMessage(PanelProjectLocationVisual.class, "MSG_ProjectInRootNotSupported"); // NOI18N
            wizardDescriptor.putProperty(WizardDescriptor.PROP_ERROR_MESSAGE, message);
            return false;
        }

        final File destFolder = new File(createdFolderTextField.getText()).getAbsoluteFile();
        if (JavaFXProjectWizardIterator.getCanonicalFile(destFolder) == null) {
            String message = NbBundle.getMessage(PanelProjectLocationVisual.class, "MSG_IllegalProjectLocation"); // NOI18N
            wizardDescriptor.putProperty(WizardDescriptor.PROP_ERROR_MESSAGE, message);
            return false;
        }

        File projLoc = FileUtil.normalizeFile(destFolder);
        while (projLoc != null && !projLoc.exists()) {
            projLoc = projLoc.getParentFile();
        }
        if (projLoc == null || !projLoc.canWrite()) {
            wizardDescriptor.putProperty(WizardDescriptor.PROP_ERROR_MESSAGE,
                    NbBundle.getMessage(PanelProjectLocationVisual.class, "MSG_ProjectFolderReadOnly")); // NOI18N
            return false;
        }

        if (FileUtil.toFileObject(projLoc) == null) {
            String message = NbBundle.getMessage(PanelProjectLocationVisual.class, "MSG_IllegalProjectLocation"); // NOI18N
            wizardDescriptor.putProperty(WizardDescriptor.PROP_ERROR_MESSAGE, message);
            return false;
        }

        File[] kids = destFolder.listFiles();
        if (destFolder.exists() && kids != null && kids.length > 0) {
            // Folder exists and is not empty
            wizardDescriptor.putProperty(WizardDescriptor.PROP_ERROR_MESSAGE,
                    NbBundle.getMessage(PanelProjectLocationVisual.class, "MSG_ProjectFolderExists")); // NOI18N
            return false;
        }

        Project prj = null;
        boolean foundButBroken = false;
        try {
            prj = ProjectManager.getDefault().findProject(FileUtil.toFileObject(FileUtil.normalizeFile(destFolder)));
        } catch (IOException ex) {
            foundButBroken = true;
        } catch (IllegalArgumentException ex) {
            // we have passed non-folder - should be already handled
        }
        
        if (prj != null || foundButBroken) {
            wizardDescriptor.putProperty(WizardDescriptor.PROP_ERROR_MESSAGE,
                    NbBundle.getMessage(PanelProjectLocationVisual.class, "MSG_ProjectMightAlreadyExists")); // NOI18N
            return false;
        }

        return true;
    }

    @Override
    void store(WizardDescriptor d) {

        String name = projectNameTextField.getText().trim();
        String location = projectLocationTextField.getText().trim();
        String folder = createdFolderTextField.getText().trim();

        d.putProperty( /*XXX Define somewhere */"projdir", new File(folder)); // NOI18N
        d.putProperty( /*XXX Define somewhere */"name", name); // NOI18N
    }

    @Override
    void read(WizardDescriptor settings) {
        File projectLocation = (File) settings.getProperty("projdir");  //NOI18N
        if (projectLocation == null || projectLocation.getParentFile() == null || !projectLocation.getParentFile().isDirectory()) {
            projectLocation = ProjectChooser.getProjectsFolder();
        } else {
            projectLocation = projectLocation.getParentFile();
        }
        this.projectLocationTextField.setText(projectLocation.getAbsolutePath());

        String projectName = (String) settings.getProperty("name"); //NOI18N
        if (projectName == null) {
            switch (type) {
                case APPLICATION:
                case FXML:
                    int baseCount = WizardSettings.getNewApplicationCount() + 1;
                    String formatter = NbBundle.getMessage(PanelSourceFolders.class, "TXT_JavaFXApplication"); // NOI18N
                    while ((projectName = validFreeProjectName(projectLocation, formatter, baseCount)) == null) {
                        baseCount++;
                    }
                    settings.putProperty(JavaFXProjectWizardIterator.PROP_NAME_INDEX, new Integer(baseCount));
                    break;
                case PRELOADER:
                    baseCount = WizardSettings.getNewPreloaderCount() + 1;
                    formatter = NbBundle.getMessage(PanelSourceFolders.class, "TXT_JavaFXPreloaderApplication"); // NOI18N
                    while ((projectName = validFreeProjectName(projectLocation, formatter, baseCount)) == null) {
                        baseCount++;
                    }
                    settings.putProperty(JavaFXProjectWizardIterator.PROP_NAME_INDEX, new Integer(baseCount));
                    break;
                case SWING:
                    baseCount = WizardSettings.getNewFxSwingCount() + 1;
                    formatter = NbBundle.getMessage(PanelSourceFolders.class, "TXT_JavaFXSwingApplication"); // NOI18N
                    while ((projectName = validFreeProjectName(projectLocation, formatter, baseCount)) == null) {
                        baseCount++;
                    }
                    settings.putProperty(JavaFXProjectWizardIterator.PROP_NAME_INDEX, new Integer(baseCount));
                    break;
                default:
                    baseCount = WizardSettings.getNewLibraryCount() + 1;
                    formatter = NbBundle.getMessage(PanelSourceFolders.class, "TXT_JavaLibrary"); // NOI18N
                    while ((projectName = validFreeProjectName(projectLocation, formatter, baseCount)) == null) {
                        baseCount++;
                    }
                    settings.putProperty(JavaFXProjectWizardIterator.PROP_NAME_INDEX, new Integer(baseCount));
            }
        }
        this.projectNameTextField.setText(projectName);
        this.projectNameTextField.selectAll();
    }

    @Override
    void validate(WizardDescriptor d) throws WizardValidationException {
        // nothing to validate
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton browseButton;
    private javax.swing.JLabel createdFolderLabel;
    private javax.swing.JTextField createdFolderTextField;
    private javax.swing.JLabel projectLocationLabel;
    private javax.swing.JTextField projectLocationTextField;
    private javax.swing.JLabel projectNameLabel;
    private javax.swing.JTextField projectNameTextField;
    // End of variables declaration//GEN-END:variables

    // Private methods ---------------------------------------------------------
    private String validFreeProjectName(final File parentFolder, final String formater, final int index) {
        String name = MessageFormat.format(formater, new Object[]{new Integer(index)});
        File file = new File(parentFolder, name);
        return file.exists() ? null : name;
    }

    // Implementation of DocumentListener --------------------------------------
    @Override
    public void changedUpdate(DocumentEvent e) {
        updateTexts(e);
    }

    @Override
    public void insertUpdate(DocumentEvent e) {
        updateTexts(e);
    }

    @Override
    public void removeUpdate(DocumentEvent e) {
        updateTexts(e);
    }

    /** Handles changes in the Project name and project directory
     */
    private void updateTexts(DocumentEvent e) {
        Document doc = e.getDocument();
        if (doc.equals(projectNameTextField.getDocument()) || doc.equals(projectLocationTextField.getDocument())) {
            // Change in the project name
            String projectName = projectNameTextField.getText();
            String projectFolder = projectLocationTextField.getText();
            String projFolderPath = FileUtil.normalizeFile(new File(projectFolder)).getAbsolutePath();
            if (projFolderPath.endsWith(File.separator)) {
                createdFolderTextField.setText(projFolderPath + projectName);
            } else {
                createdFolderTextField.setText(projFolderPath + File.separator + projectName);
            }
        }
        
        panel.fireChangeEvent(); // Notify that the panel changed        
        
        if (this.projectNameTextField.getDocument().equals(e.getDocument())) {
            firePropertyChange(PROP_PROJECT_NAME, null, this.projectNameTextField.getText());
        }
        if (this.projectLocationTextField.getDocument().equals(e.getDocument())) {
            firePropertyChange(PROP_PROJECT_LOCATION, null, this.projectLocationTextField.getText());
        }
    }

}