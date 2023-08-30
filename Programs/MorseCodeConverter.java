package Programs;

import java.util.HashMap;
import java.util.Scanner;

public class MorseCodeConverter {
    private static final HashMap<Character, String> morseCodeMap = new HashMap<>();

    static {
        morseCodeMap.put('A', ".-");
        morseCodeMap.put('B', "-...");
        morseCodeMap.put('C', "-.-.");
        morseCodeMap.put('D', "-..");
        morseCodeMap.put('E', ".");
        morseCodeMap.put('F', "..-.");
        morseCodeMap.put('G', "--.");
        morseCodeMap.put('H', "....");
        morseCodeMap.put('I', "..");
        morseCodeMap.put('J', ".---");
        morseCodeMap.put('K', "-.-");
        morseCodeMap.put('L', ".-..");
        morseCodeMap.put('M', "--");
        morseCodeMap.put('N', "-.");
        morseCodeMap.put('O', "---");
        morseCodeMap.put('P', ".--.");
        morseCodeMap.put('Q', "---");
        morseCodeMap.put('R', ".-.");
        morseCodeMap.put('S', "...");
        morseCodeMap.put('T', "-");
        morseCodeMap.put('U', "..-");
        morseCodeMap.put('V', "...-");
        morseCodeMap.put('W', ".--");
        morseCodeMap.put('X', "-..-");
        morseCodeMap.put('Y', "-.--");
        morseCodeMap.put('Z', "--..");

        morseCodeMap.put('0', "-----");
        morseCodeMap.put('1', ".----");
        morseCodeMap.put('2', "..---");
        morseCodeMap.put('3', "...--");
        morseCodeMap.put('4', "....-");
        morseCodeMap.put('5', ".....");
        morseCodeMap.put('6', "-....");
        morseCodeMap.put('7', "--...");
        morseCodeMap.put('8', "---..");
        morseCodeMap.put('9', "----.");

        morseCodeMap.put(' ', " "); // Space
    }

    public static String convertToMorseCode(String sentence) {
        StringBuilder morseCode = new StringBuilder();

        for (char c : sentence.toUpperCase().toCharArray()) {
            if (morseCodeMap.containsKey(c)) {
                morseCode.append(morseCodeMap.get(c)).append(" ");
            } else {
                morseCode.append(" ");
            }
        }

        return morseCode.toString();
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a sentence: ");
            String input = scanner.nextLine();
            String morseCode = convertToMorseCode(input);
            System.out.println("Morse Code: " + morseCode);
        }
    }
}