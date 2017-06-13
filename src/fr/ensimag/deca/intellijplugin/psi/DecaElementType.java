package fr.ensimag.deca.intellijplugin.psi;

import com.intellij.psi.tree.IElementType;
import fr.ensimag.deca.intellijplugin.DecaLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class DecaElementType extends IElementType{

    public DecaElementType(@NotNull @NonNls String debugName) {
        super(debugName, DecaLanguage.INSTANCE);
    }
}
