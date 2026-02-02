public class SSIII {
    public static void main(String[] args) {
        String s1 = "My Haley";
        String s2 = "My name is Haley";

        // String s1 = "Jane";
        // String s2 = "Hello Jane";

        System.out.println(areSentencesSimilar(s1, s2));
    }

    static boolean areSentencesSimilar(String sentence1, String sentence2) {

        sentence1 = sentence1.trim();
        sentence2 = sentence2.trim();

        if (sentence1.isEmpty() || sentence2.isEmpty()) {
            return false;
        }

        String s1_words[] = sentence1.split("\\s+");
        String s2_words[] = sentence2.split("\\s+");

        // making sure that s1 is shorter
        if (s1_words.length > s2_words.length) {
            String[] temp = s1_words;
            s1_words = s2_words;
            s2_words = temp;
        }

        int i = 0;

        while (i < s1_words.length && s1_words[i].equals(s2_words[i])) {
            i++;
        }

        int j = 0;
        while (j < s1_words.length - i && s1_words[s1_words.length - 1 - j].equals(s2_words[s2_words.length - 1 - j])) {
            j++;
        }

        return i + j == s1_words.length;

    }
}