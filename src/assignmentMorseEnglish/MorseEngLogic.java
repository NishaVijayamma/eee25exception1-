package assignmentMorseEnglish;

import java.util.HashMap;

public class MorseEngLogic {
    private static HashMap<String, String> engToMorse = new HashMap<>();
    private static HashMap<String, String> MorseToEng = new HashMap<>();
    private static String[] english = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M",
            "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};

    private static String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
            "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};

    private static void createHashmap() {
        for (int i = 0; i < english.length; i++) {
            String key = english[i];
            String value = morse[i];
            engToMorse.put(key, value);
            MorseToEng.put(value, key);
        }
    }

    public static String engToMorseCode(String text) {
        createHashmap();
        String encryptedText = "";

        for (int i = 0; i < text.length(); i++) {
            // string.value of converts character to String
            String input = String.valueOf(text.charAt(i));
            // Skip the spaces between the words
            if(input.equals(" ")){
               continue;
            }
            // If it’s a valid letter, convert it
             if (engToMorse.containsKey(input)){
                encryptedText += engToMorse.get(input)+" "; // add space between morse code
            }
            // For special characters, numbers, small letters
            else {
                return "Invalid input";
            }
        }
        return encryptedText.trim();// trim removes  last unwanted space

    }

    public static String morseCodeToEnglish(String morseCode) {
        createHashmap();
        String decryptedCode = "";
        // Split the morse input by spaces
        String[] codeLetters = morseCode.split(" ");
        for (int i = 0; i < codeLetters.length; i++) {

            String inputCode = codeLetters[i];
            if (MorseToEng.containsKey(inputCode)) {
                decryptedCode += MorseToEng.get(inputCode);
            }
            // For special characters, numbers, small letters
            else {
                return "Invalid input";
            }
        }
        return decryptedCode;
    }


}
