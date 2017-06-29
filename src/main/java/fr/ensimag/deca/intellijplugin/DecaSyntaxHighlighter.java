package fr.ensimag.deca.intellijplugin;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.HighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import fr.ensimag.deca.intellijplugin.psi.DecaTypes;
import org.jetbrains.annotations.NotNull;

public class DecaSyntaxHighlighter extends SyntaxHighlighterBase{
    public static final TextAttributesKey OPERATOR =
            createTextAttributesKey("SIMPLE_OPERATOR", DefaultLanguageHighlighterColors.OPERATION_SIGN);
    public static final TextAttributesKey KEYWORD =
            createTextAttributesKey("SIMPLE_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey STRING =
            createTextAttributesKey("SIMPLE_STRING", DefaultLanguageHighlighterColors.STRING);
    public static final TextAttributesKey COMMENT =
            createTextAttributesKey("SIMPLE_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT);
    public static final TextAttributesKey BAD_CHARACTER =
            createTextAttributesKey("SIMPLE_BAD_CHARACTER", HighlighterColors.BAD_CHARACTER);
    public static final TextAttributesKey BRACE =
            createTextAttributesKey("SIMPLE_BRACE", DefaultLanguageHighlighterColors.BRACES);
    public static final TextAttributesKey PARENTHESES =
            createTextAttributesKey("SIMPLE_PARENTHESES", DefaultLanguageHighlighterColors.PARENTHESES);

    private static final TextAttributesKey[] BAD_CHAR_KEYS = new TextAttributesKey[]{BAD_CHARACTER};
    private static final TextAttributesKey[] OPERATOR_KEYS = new TextAttributesKey[]{OPERATOR};
    private static final TextAttributesKey[] KEYWORD_KEYS = new TextAttributesKey[]{KEYWORD};
    private static final TextAttributesKey[] STRING_KEYS = new TextAttributesKey[]{STRING};
    private static final TextAttributesKey[] COMMENT_KEYS = new TextAttributesKey[]{COMMENT};
    private static final TextAttributesKey[] EMPTY_KEYS = new TextAttributesKey[0];
    private static final TextAttributesKey[] BRACE_KEYS = new TextAttributesKey[]{BRACE};
    private static final TextAttributesKey[] PARENTHESES_KEYS = new TextAttributesKey[]{PARENTHESES};


    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new DecaLexerAdapter();
    }

    @NotNull
    @Override
    public TextAttributesKey[] getTokenHighlights(IElementType iElementType) {

        if (iElementType.equals(DecaTypes.EQUALS)) {
            return OPERATOR_KEYS;
        } else if (iElementType.equals(DecaTypes.OBRACE) || iElementType.equals(DecaTypes.CBRACE)) {
            return BRACE_KEYS;
        } else if (iElementType.equals(DecaTypes.PRINT) || iElementType.equals(DecaTypes.PRINTLN)) {
            return KEYWORD_KEYS;
        } else if (iElementType.equals(DecaTypes.STRING)) {
            return STRING_KEYS;
        } else if (iElementType.equals(DecaTypes.OPARENT) || iElementType.equals(DecaTypes.OPARENT)) {
            return PARENTHESES_KEYS;
        } else if (iElementType.equals(DecaTypes.COMMENT) || iElementType.equals(DecaTypes.COMMENT_LINE)) {
            return COMMENT_KEYS;
        } else if (iElementType.equals(TokenType.BAD_CHARACTER)) {
            return BAD_CHAR_KEYS;
        } else {
            return EMPTY_KEYS;
        }
    }
}
