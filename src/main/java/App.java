//
// Utilisation nominale des classes td3.Buffer, Killring et td3.Editor
//
////////////////////////////////////////////////////////////////

import fr.einfolearning.tp2.metiers.EmacsKillRing;
import fr.einfolearning.tp2.metiers.TextBuffer;
import fr.einfolearning.tp2.metiers.TextEditor;
import fr.einfolearning.tp2.metiers.exceptions.EmacsKillRingOverflowException;

public class App {

    public static void main(String[] args) throws IllegalAccessException, EmacsKillRingOverflowException {
        // A completer
        TextEditor textEditor = new TextEditor("je suis un editeur de texte");

        System.out.println(textEditor.getTextBuffer());

        textEditor.setCursor(3);
        textEditor.setMark(7);
        textEditor.killSection();
        textEditor.getTextBuffer().del(0,4);
        System.out.println(textEditor.getTextBuffer());
        System.out.println(textEditor.getBuffer() + textEditor.getCursor() + textEditor.getMark());



    }


}
