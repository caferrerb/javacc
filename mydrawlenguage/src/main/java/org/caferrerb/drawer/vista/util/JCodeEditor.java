/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.caferrerb.drawer.vista.util;

import javax.swing.JPanel;
import javax.swing.ToolTipManager;
import org.fife.rsta.ac.LanguageSupportFactory;
import org.fife.ui.rsyntaxtextarea.RSyntaxTextArea;
import org.fife.ui.rsyntaxtextarea.SyntaxConstants;
import org.fife.ui.rtextarea.RTextArea;
import org.fife.ui.rtextarea.RTextScrollPane;

/**
 *
 * @author user
 */
public class JCodeEditor extends JPanel {

    static {
        LanguageSupportFactory lsf = LanguageSupportFactory.get();
        //LanguageSupport support = lsf.getSupportFor("text/java");
        //JavaLanguageSupport jls = (JavaLanguageSupport) support;
        // TODO: This API will change!  It will be easier to do per-editor
        // changes to the build path.
        try {
            //jls.getJarManager().addCurrentJreClassFileSource();
            //jls.getJarManager().addClassFileSource(new DirLibraryInfo(new File("C:/Users/user/Dropbox/compartidocamilo/entrenador JPA/VideoTienda/src")));
            //jsls.getJarManager().addClassFileSource(ji);
        } catch (Exception ioe) {
            ioe.printStackTrace();
        }
    }
    private RSyntaxTextArea textArea;
    private String lenguaje;

    

    public JCodeEditor() {

        textArea = new RSyntaxTextArea(20, 60);
      textArea.setSyntaxEditingStyle(SyntaxConstants.SYNTAX_STYLE_JAVA);
      textArea.setCodeFoldingEnabled(true);
      RTextScrollPane sp = new RTextScrollPane(textArea);
      add(sp);


        //
        // getGutter().setBookmarkingEnabled(true);
    }

    /**
     * Creates the text area for this application.
     *
     * @return The text area.
     */
    private RSyntaxTextArea createTextArea() {

        RSyntaxTextArea textArea = new RSyntaxTextArea();
        textArea.setSyntaxEditingStyle(SyntaxConstants.SYNTAX_STYLE_JAVA);
        textArea.setCodeFoldingEnabled(true);
        RTextScrollPane rs = new RTextScrollPane(textArea);
        LanguageSupportFactory.get().register(textArea);
        textArea.setCaretPosition(0);
        textArea.requestFocusInWindow();
        textArea.setMarkOccurrences(true);
        textArea.setCodeFoldingEnabled(true);
        textArea.setTabsEmulated(true);
        textArea.setTabSize(3);
        ToolTipManager.sharedInstance().registerComponent(textArea);
        return textArea;
    }

    public String getCodigo() {
        return textArea.getText();
    }

    public void setCodigo(String codigo) {
        textArea.setText(codigo);
    }

    
    public RTextArea getTextArea() {
        return textArea; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
