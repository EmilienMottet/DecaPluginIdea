package fr.ensimag.deca.intellijplugin.parser;

import com.intellij.testFramework.ParsingTestCase;
import fr.ensimag.deca.intellijplugin.DecaParserDefinition;

public class DecaParserTest extends ParsingTestCase{

    public DecaParserTest() {
        super("", "deca", new DecaParserDefinition());
    }

    public void testcomplete() {
        doTest(true);
    }

    @Override
    protected String getTestDataPath() {
        return "src/test/resources/";
    }

    @Override
    protected boolean skipSpaces() {
        return false;
    }

    @Override
    protected boolean includeRanges() {
        return true;
    }
}