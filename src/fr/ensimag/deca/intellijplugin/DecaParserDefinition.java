package fr.ensimag.deca.intellijplugin;

import com.intellij.lang.ASTNode;
import com.intellij.lang.ParserDefinition;
import com.intellij.lang.PsiParser;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.TokenSet;
import fr.ensimag.deca.intellijplugin.parser.DecaParser;
import fr.ensimag.deca.intellijplugin.psi.DecaType;
import fr.ensimag.deca.intellijplugin.psi.DecaTypes;
import org.jetbrains.annotations.NotNull;

public class DecaParserDefinition implements ParserDefinition {

    public static final TokenSet WHITE_SPACES = TokenSet.create(TokenType.WHITE_SPACE);
    public static final TokenSet COMMENTS = TokenSet.create(DecaTypes.COMMENT,DecaTypes.COMMENT_LINE);

    public static final IFileElementType FILE = new IFileElementType(DecaLanguage.INSTANCE);


    @NotNull
    @Override
    public Lexer createLexer(Project project) {
        return new DecaLexerAdapter();
    }

    @NotNull
    @Override
    public PsiParser createParser(Project project) {
        return new DecaParser();
    }

    @Override
    public IFileElementType getFileNodeType() {
        return FILE;
    }

    @NotNull
    @Override
    public TokenSet getWhitespaceTokens() {
        return WHITE_SPACES;
    }

    @NotNull
    @Override
    public TokenSet getCommentTokens() {
        return COMMENTS;
    }

    @NotNull
    @Override
    public TokenSet getStringLiteralElements() {
        return TokenSet.EMPTY;
    }

    @NotNull
    @Override
    public PsiElement createElement(ASTNode astNode) {
        return DecaTypes.Factory.createElement(astNode);
    }

    @Override
    public PsiFile createFile(FileViewProvider fileViewProvider) {
        return new DecaFile(fileViewProvider);
    }

    @Override
    public SpaceRequirements spaceExistanceTypeBetweenTokens(ASTNode astNode, ASTNode astNode1) {
        return SpaceRequirements.MAY;
    }
}
