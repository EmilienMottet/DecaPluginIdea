package fr.ensimag.deca.intellijplugin;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import javax.swing.Icon;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class DecaFile extends PsiFileBase{

    public DecaFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider,DecaLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return DecaFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "Deca File";
    }

    @Nullable
    @Override
    public Icon getIcon(int flags) {
        return super.getIcon(flags);
    }
}
