public class P7 {
    private P7(){}
    private static void get_permutation(String prefix, String to_permute) {
        if (to_permute.isEmpty()) {
            System.out.println(prefix);
        } else {
            for (int i = 0; i < to_permute.length(); i++) {
                char currentChar = to_permute.charAt(i);
                String newPrefix = prefix + currentChar;
                String new_to_permute = to_permute.substring(0, i) + to_permute.substring(i + 1);
                get_permutation(newPrefix, new_to_permute);
            }
        }
    }

    public static void print(String input) {
        get_permutation("", input);
    }
}
