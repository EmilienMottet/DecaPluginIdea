package fr.ensimag.deca.intellijplugin;

import com.intellij.openapi.fileTypes.LanguageFileType;
import javax.swing.Icon;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class DecaFileType extends LanguageFileType{

    public static final DecaFileType INSTANCE = new DecaFileType();

    private DecaFileType() {
        super(DecaLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "Deca file";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Deca language file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "deca";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return DecaIcons.FILE;
    }
}
