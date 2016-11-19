package Top100;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


/**
 * Найти топ100 слов в романе Толстого "Война и мир".
 */

public class WarAndPeace {

    static Map<String, Integer> top = new HashMap<>();

    public static void main(String[] args) {

        String fileName = "/Users/katerina/Documents/ITMOJava/Lesson11/TextWP/wp.txt";

        try {
            File file = new File(fileName);
            Scanner input = new Scanner(file);

            while (input.hasNextLine()) {
                String line = input.nextLine();
                parse(line);
            }
            input.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        topRating(top);
    }

    private static void parse(String line) {

        String lineCut = line.replace(",", "")
                .replace(".", "")
                .replace("'", "")
                .replace("!", "")
                .replace("?", "")
                .replace("--", "")
                .replace("-", "")
                .replace("\"", "")
                .replace("/", " ")
                .replace(":", "")
                .replace(";", "")
                .replace("(", "")
                .replace(")", "")
                .toLowerCase();
        String[] words = lineCut.split(" ");

        for (String word : words) {
            if (word.length() > 0) {
                if (!top.containsKey(word)) {
                    top.put(word, 1);
                } else {
                    top.put(word, top.get(word) + 1);
                }
            }
        }
    }

    private static void topRating(Map<String, Integer> top) {
        for (int i = 1; i < 101; i++) {
            Integer topCount = 0;
            String topWord = "";
            for (Map.Entry<String, Integer> entry : top.entrySet()) {
                if (entry.getValue() > topCount) {
                    topCount = entry.getValue();
                    topWord = entry.getKey();
                }
            }

            System.out.println(i + ": " + topWord + " (" + topCount + ")");
            top.remove(topWord);
        }
    }
}
