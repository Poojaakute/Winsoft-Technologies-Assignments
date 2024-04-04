import java.util.Arrays;
import java.util.HashMap;

public class WordCounts {

    public static void main(String[] args) {
        String inputString = "Java is an object-oriented, class-based and secured  computer-programming language. It is a widely used robust technology. ";

        HashMap<String, Integer> wordCountMap = new HashMap<>();
        Arrays.stream(inputString.split("\\s+"))
                .map(word -> word.replaceAll("[^a-zA-Z0-9]", "").toLowerCase())
                .forEach(word -> wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1));

        System.out.println("Word Counts:");
        wordCountMap.forEach((word, count) -> System.out.println(word + ": " + count));
    }
}
