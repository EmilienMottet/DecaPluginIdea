package fr.ensimag.deca.intellijplugin;

import com.intellij.lang.Language;

public class DecaLanguage extends Language {

    public static final DecaLanguage INSTANCE = new DecaLanguage();

    private DecaLanguage() {
        super("Deca");
    }
}
