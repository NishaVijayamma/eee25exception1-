package assignmentMorseEnglish;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MorseEngTest {
    @Test
    public void engAlphabet(){
        assertEquals(".-",MorseEngLogic.engToMorseCode("A"));

    }
    @Test
    public void morseCode(){
        assertEquals("A",MorseEngLogic.morseCodeToEnglish(".-"));

    }

    @Test
    public void engToMorseWord(){
        assertEquals(".... . .-.. .-.. ---",MorseEngLogic.engToMorseCode("HELLO"));

    }
    @Test
    public void engToMorseWithTwoWords(){
        assertEquals(".... . .-.. .-.. --- .-- --- .-. .-.. -..",MorseEngLogic.engToMorseCode("HELLO WORLD"));

    }
    @Test
    public void engToMorseWithSentence(){
        assertEquals(".... .. -- -.-- -. .- -- . .. ... -. .. ... .... .-",MorseEngLogic.engToMorseCode("HI MY NAME IS NISHA"));

    }
    @Test
    public void morseToEngWord(){
        assertEquals("HELLO",MorseEngLogic.morseCodeToEnglish(".... . .-.. .-.. ---"));
        assertEquals("HEJ",MorseEngLogic.morseCodeToEnglish(".... . .---"));

    }
    @Test
    public void morseToEngWithNoSpaceWords(){
        assertEquals("HELLOWORLD",MorseEngLogic.morseCodeToEnglish(".... . .-.. .-.. --- .-- --- .-. .-.. -.."));

    }
    @Test
    public void engToMorseWithInvalidInputs(){
        assertEquals("Invalid input",MorseEngLogic.engToMorseCode("1235*"));
        assertEquals("Invalid input",MorseEngLogic.engToMorseCode("*/0llhh"));

    }
    @Test
    public void morseToEngWithInvalidInputs(){
        assertEquals("Invalid input",MorseEngLogic.morseCodeToEnglish("1235*"));
        assertEquals("Invalid input",MorseEngLogic.morseCodeToEnglish("null"));
        assertEquals("Invalid input",MorseEngLogic.morseCodeToEnglish(".,;'¨!"));

    }
}
