import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class BinaryString {

  // Exercise:
  // Secret string: 11010110010011011100111111010111
  // Chunks of 8 length: [11010111, 01001101, 11001111, 11010111]
  // Chunk architecture: <1 controller character><7 data characters>
  // A chunk is a letter if it starts with 1
  // A chunk is a number if it starts with 0
  public static void main(String[] args) {
    String decodedString = decode("11010111010011011100111111010111");
    String decodedString2 = decode("11010110010011011100111111010111");
    System.out.println(decodedString2); // WOW
    HashMap<String, Integer> letterOccurencies = letterOccurencies(decodedString); // W: 2, O: 1
    loopOnHashMap(letterOccurencies);
  }

  private static void loopOnHashMap(HashMap<String, Integer> letterOccurencies) {
    for (String key : letterOccurencies.keySet()) {
      System.out.println("key: " + key);
    }
    for (Integer value : letterOccurencies.values()) {
      System.out.println("value: " + value);
    }
    for (Map.Entry<String, Integer> entry : letterOccurencies.entrySet()) {
      System.out.println("key: " + entry.getKey() + " , value: " + entry.getValue());
    }
  }

  private static HashMap<String, Integer> letterOccurencies(String decodedString) {
    HashMap<String, Integer> letterOccurencies = new HashMap<>();

    for (int i = 0; i < decodedString.length(); i++) {
      String letter = decodedString.substring(i, i + 1);
      if (letterOccurencies.containsKey(letter)) {
        letterOccurencies.put(letter, letterOccurencies.get(letter) + 1);
      } else {
        letterOccurencies.put(letter, 1);
      }
    }

    return letterOccurencies;

  }

  private static String decode(String secretString) {
    String[] chunks = separateToChunks(secretString); // Single Responsibility Principle
    ArrayList<String> letterBinaries = filterOnlyLetters(chunks);
    int[] letters = convertBinariesToLetters(letterBinaries);
    String decodedString = concatenateLetters(letters);
    return decodedString;
  }

  private static String concatenateLetters(int[] charCodes) {
    String decodedString = "";
    for (int charCode : charCodes) {
      decodedString += (char) charCode;
    }
    return decodedString;
  }

  private static int[] convertBinariesToLetters(ArrayList<String> letterBinaries) {
    int[] letterCodes = new int[letterBinaries.size()];

    for (int j = 0; j < letterBinaries.size(); j++) {
      String letterBinary = letterBinaries.get(j);
      int charCode = calculateCharCode(letterBinary);
      letterCodes[j] = charCode;
    }

    return letterCodes;
  }

  private static int calculateCharCode(String letterBinary) {
    int charCode = 0;

    for (int i = 1; i < letterBinary.length(); i++) {
      int bit = Integer.parseInt(letterBinary.substring(i, i + 1));
      int exponent = letterBinary.length() - i - 1;
      int multiplier = (int) Math.pow(2, exponent); // 2^exponent
      charCode += bit * multiplier;
    }

    return charCode;
  }

  private static ArrayList<String> filterOnlyLetters(String[] chunks) {
    ArrayList<String> letterBinaries = new ArrayList<>();

    for (int i = 0; i < chunks.length; i++) {
      if (chunks[i].charAt(0) == '1') {
        letterBinaries.add(chunks[i]);
      }
    }

    return letterBinaries;
  }

  private static String[] separateToChunks(String secretString) {
    int chunkSize = 8;
    int chunksIndex = 0;
    String[] chunks = new String[secretString.length() / chunkSize];

    for (int i = 0; i < secretString.length(); i += chunkSize) {
      String chunk = secretString.substring(i, i + chunkSize);
      chunks[chunksIndex] = chunk;
      chunksIndex++;
    }

    return chunks;
  }

}
