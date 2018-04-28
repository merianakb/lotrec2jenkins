/*
 * OpenLogicDialog.java
 *
 * Created on 26 octobre 2007, 11:39
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */
package lotrec.gui.dialogs;

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;
import lotrec.Lotrec;

/**
 *
 * @author said
 */
public class ExportPremodelDialog extends JFileChooser {

    /** Creates a new instance of OpenLogicDialog */
    public ExportPremodelDialog() {
        this.setDialogTitle("Export Premodel");
        this.setDialogType(JFileChooser.SAVE_DIALOG);
        this.setFileView(new ExportPremodelFileView()); 
        this.addChoosableFileFilter(new PngFileFilter());
        this.addChoosableFileFilter(new PsFileFilter());
        this.addChoosableFileFilter(new PdfFileFilter());
        this.setAcceptAllFileFilterUsed(false);
        this.setCurrentDirectory(new File(Lotrec.getPredefLogicsPath()));
    }

    public void setFileName(String fileName) {
        ((javax.swing.plaf.basic.BasicFileChooserUI) this.getUI()).setFileName(fileName);
    }

    public String getCompleteFileName() {
        FileFilter currentFileFilter = this.getFileFilter();
        String extension = Utils.getExtension(currentFileFilter);
        if (extension == null) {
            return this.getSelectedFile().getAbsolutePath();
        }
        if (Utils.getExtension(this.getSelectedFile()) != null &&
                Utils.getExtension(this.getSelectedFile()).equals(extension)) {
            return this.getSelectedFile().getAbsolutePath();
        } else {
            return this.getSelectedFile().getAbsolutePath() + "." + extension;
        }
    }

    public String getFileName() {
        FileFilter currentFileFilter = this.getFileFilter();
        String extension = Utils.getExtension(currentFileFilter);
        if (extension == null) {
            return this.getSelectedFile().getAbsolutePath();
        }
        if (Utils.getExtension(this.getSelectedFile()) != null &&
                Utils.getExtension(this.getSelectedFile()).equals(extension)) {
            return this.getSelectedFile().getName();
        } else {
            return this.getSelectedFile().getName() + "." + extension;
        }
    }
}
