package com.myoung;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.w3c.dom.ls.LSOutput;

import java.nio.file.Paths;

@ExtendWith(MockitoExtension.class)
public class SuggestionEngineTest {

    private SuggestionEngine suggestionEngine = new SuggestionEngine();


    @Test
    public void exampleTest() {

    boolean tester = true;

    Assertions.assertTrue(tester);
    }

    @Test
    public void testGenerateSuggestions() throws Exception {
        suggestionEngine.loadDictionaryData(Paths.get(ClassLoader.getSystemResource("words.txt").getPath()));

        Assertions.assertTrue(suggestionEngine.generateSuggestions("hellw").contains("hello"));
    }


}
