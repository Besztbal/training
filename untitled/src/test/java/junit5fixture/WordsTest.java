package junit5fixture;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordsTest {

    Words words;

    @BeforeEach
    void init(){
        words=new Words();
        words.addWord("Ablak");
        words.addWord("Ajtó");
        words.addWord("Alhambra");
        words.addWord("Aladár");
        words.addWord("Antal");
        words.addWord("BAndroid");

    }

    @Test
    void testGetWordsStartWith(){
        List<String> expected = Arrays.asList("Ablak","Ajtó","Alhambra","Aladár", "Antal");
        words.getWordsStartWith("A");

        assertEquals(expected,words.getWords());
    }

    @Test
    void testGetWordsWithLength(){
        List<String> expected=Arrays.asList("Ablak","Antal");
        words.getWordsWithLength(5);

        assertEquals(expected,words.getWords());
    }
}
