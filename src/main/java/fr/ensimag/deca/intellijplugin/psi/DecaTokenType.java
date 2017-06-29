package fr.ensimag.deca.intellijplugin.psi;

import com.intellij.psi.tree.IElementType;
import fr.ensimag.deca.intellijplugin.DecaLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class DecaTokenType extends IElementType{

    public DecaTokenType(@NotNull @NonNls String debugname) {
        super(debugname, DecaLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "DecaTokenType." + super.toString();
    }
}
