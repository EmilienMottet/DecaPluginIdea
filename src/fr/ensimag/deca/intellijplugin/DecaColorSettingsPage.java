package fr.ensimag.deca.intellijplugin;

import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.options.colors.AttributesDescriptor;
import com.intellij.openapi.options.colors.ColorDescriptor;
import com.intellij.openapi.options.colors.ColorSettingsPage;
import java.util.Map;
import javax.swing.Icon;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class DecaColorSettingsPage implements ColorSettingsPage {

    private static final AttributesDescriptor[] DESCRIPTORS = new AttributesDescriptor[]{
            new AttributesDescriptor("Keyword", DecaSyntaxHighlighter.KEYWORD),
            new AttributesDescriptor("Operator", DecaSyntaxHighlighter.OPERATOR),
            new AttributesDescriptor("Brace", DecaSyntaxHighlighter.BRACE),
            new AttributesDescriptor("String", DecaSyntaxHighlighter.STRING),
            new AttributesDescriptor("Parentheses", DecaSyntaxHighlighter.PARENTHESES),
    };

    @Nullable
    @Override
    public Icon getIcon() {
        return DecaIcons.FILE;
    }

    @NotNull
    @Override
    public SyntaxHighlighter getHighlighter() {
        return new DecaSyntaxHighlighter();
    }

    @NotNull
    @Override
    public String getDemoText() {
        return "{\n"
                + "\tprintln();\n"
                + "}" ;
    }

    @Nullable
    @Override
    public Map<String, TextAttributesKey> getAdditionalHighlightingTagToDescriptorMap() {
        return null;
    }

    @NotNull
    @Override
    public AttributesDescriptor[] getAttributeDescriptors() {
        return DESCRIPTORS;
    }

    @NotNull
    @Override
    public ColorDescriptor[] getColorDescriptors() {
        return ColorDescriptor.EMPTY_ARRAY;
    }

    @NotNull
    @Override
    public String getDisplayName() {
        return "Deca";
    }
}
