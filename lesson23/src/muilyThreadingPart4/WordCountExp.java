package muilyThreadingPart4;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.*;
import java.util.concurrent.*;

public class WordCountExp {

    public static int parts = 4;

    public static void main(String[] args) throws ExecutionException, InterruptedException, IOException {
        Map<String, Integer> topWords = new HashMap<>();

        ExecutorService pool = Executors.newFixedThreadPool(parts);

        List<Future<Map<String, Integer>>> futs = new ArrayList<>(parts);

        byte[] bytes = Files.readAllBytes(new File("/Users/katerina/Documents/ITMOJava/Lesson11/TextWP/wp.txt").toPath());

        String all = new String(bytes);

        int length = all.length();
        int part = length/parts;

        for (int i = 0; i < parts; i++) {

            Counter counter = new Counter(all.substring(i*part, i*part + part));

            Future<Map<String, Integer>> fut = pool.submit(counter);

            futs.add(fut);
        }

        for (Future<Map<String, Integer>> fut : futs) {
            Map<String, Integer> res = fut.get();

            for (Map.Entry<String, Integer> entry : res.entrySet()) {
                if (topWords.containsKey(entry.getKey()))
                    topWords.put(entry.getKey(), topWords.get(entry.getKey()) + entry.getValue());
                else
                    topWords.put(entry.getKey(), entry.getValue());
            }
        }

        topRating(topWords);
    }

    private static class Counter implements Callable<Map<String, Integer>> {

        private final String string;

        private Counter(String string) {
            this.string = string;
        }

        @Override
        public Map<String, Integer> call() throws Exception {
            Map<String, Integer> map = new HashMap<>();

            String[] strs = string.toLowerCase().replaceAll("\\p{P}", " ").replaceAll("\n", " ").split(" ");

            for (String word : strs) {
                if (word.length() > 0) {
                    if (!map.containsKey(word)) {
                        map.put(word, 1);
                    } else {
                        map.put(word, map.get(word) + 1);
                    }
                }
            }
            return map;
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

            if (top.isEmpty()) {
                break;
            }
        }
    }
}
