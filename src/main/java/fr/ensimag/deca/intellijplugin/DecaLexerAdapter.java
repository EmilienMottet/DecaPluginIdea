package fr.ensimag.deca.intellijplugin;

import com.intellij.lexer.FlexAdapter;
import java.io.Reader;

public class DecaLexerAdapter extends FlexAdapter{

    public DecaLexerAdapter() {
        super(new DecaLexer((Reader) null));
    }
}
