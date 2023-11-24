public class MaximumProductofWordLengths {
    public static void main(String[] args) {
        String[] words = { "acd", "aes", "tygf", "wqrgghi" };
        System.out.println(maxProduct(words));
    }

    public static int maxProduct(String[] words) {
        int n = words.length;
        int[] masks = new int[n];

        for (int i = 0; i < n; i++)
            for (char c : words[i].toCharArray())
                masks[i] = masks[i] | (1 << (c - 'a'));

        int largest = 0;
        for (int i = 0; i < n - 1; i++)
            for (int j = i + 1; j < n; j++)
                if ((masks[i] & masks[j]) == 0)
                    largest = Math.max(largest, words[i].length() * words[j].length());

        return largest;
    }
}
