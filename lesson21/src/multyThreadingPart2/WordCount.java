package multyThreadingPart2;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class WordCount {

    private static Map<String, Integer> mostPopular = new HashMap<>();

    public WordCount() throws IOException {
    }

    private static class Counter extends Thread {
        private final String string;

        private Counter(String string) {
            this.string = string;
        }

        public void run() {

            synchronized (WordCount.class) {
                String[] strs = string.toLowerCase().replaceAll("\\p{P}", " ").replaceAll("\n", " ").split(" ");

                for (String word : strs) {
                    if (word.length() > 0) {
                        if (!mostPopular.containsKey(word)) {
                            mostPopular.put(word, 1);
                        } else {
                            mostPopular.put(word, mostPopular.get(word) + 1);
                        }
                    }
                }
            }
        }
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        WordCount wordCount = new WordCount();

        int cpus = Runtime.getRuntime().availableProcessors();

        byte[] bytes = Files.readAllBytes(new File("/Users/katerina/Documents/ITMOJava/Lesson11/TextWP/wp.txt").toPath());

        String all = new String(bytes);

        int length = all.length();
        int part = length/cpus;

        List<Counter> counters = new ArrayList<>();
        for (int i = 0; i < cpus; i++) {
            counters.add(new Counter(all.substring(i*part, i*part + part)));
        }

        for (Counter counter : counters) {
            counter.start();
        }

        for (Counter counter : counters) {
            counter.join();
        }

        topRating(mostPopular);
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

            if (top.isEmpty()) {
                break;
            }
        }
    }
}
