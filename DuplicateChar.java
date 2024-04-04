import java.util.HashSet;

public class DuplicateChar {

    public static void main(String[] args) {
        String inputString = "JavaProgramming";
        HashSet<Character> duplicates = new HashSet<>();
        HashSet<Character> nonDuplicates = new HashSet<>();

        for (char c : inputString.toCharArray()) {
            if (!nonDuplicates.add(c)) {
                duplicates.add(c);
            }
        }

        System.out.println("Duplicate characters in the string are : " + duplicates);
    }
}
