package fr.ensimag.deca.intellijplugin;

import com.intellij.codeInsight.completion.*;
import com.intellij.codeInsight.lookup.LookupElementBuilder;
import com.intellij.patterns.PlatformPatterns;
import com.intellij.util.ProcessingContext;
import com.intellij.util.ProcessingContext;
import fr.ensimag.deca.intellijplugin.psi.DecaTypes;
import org.jetbrains.annotations.NotNull;

public class DecaCompletionContributor extends CompletionContributor {

//    public DecaCompletionContributor() {
//        extend(CompletionType.BASIC,
//                PlatformPatterns.psiElement().withLanguage(DecaLanguage.INSTANCE).afterLeaf(DecaTypes.INST),
////                PlatformPatterns.psiElement(DecaTypes.INST).withLanguage(DecaLanguage.INSTANCE),
//                new CompletionProvider<CompletionParameters>() {
//                    public void addCompletions(@NotNull CompletionParameters parameters,
//                            ProcessingContext context,
//                            @NotNull CompletionResultSet resultSet) {
//                        System.out.println("ici");
//                        resultSet.addElement(LookupElementBuilder.create("print"));
//                    }
//                }
//        );
//    }
}
