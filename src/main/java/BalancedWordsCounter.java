class BalancedWordsCounter {
    public static int count(String input) throws RuntimeException {
        if (input == null) {
            throw new RuntimeException("Input can't be null");
        }
        if (!input.matches("[a-zA-Z]+")) {
            throw new RuntimeException("Input can only contain letters");
        }

        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            for (int j = i; j < input.length(); j++) {
                String subword = input.substring(i, j + 1);
                if (isBalanced(subword)) {
                    count++;
                }
            }
        }
        return count;
    }

    private static boolean isBalanced(String word) {
        int[] letterCounts = new int[26];
        for (int i = 0; i < word.length(); i++) {
            letterCounts[word.charAt(i) - 'a']++;
        }

        int referenceCount = letterCounts[0];
        for (int i = 1; i < 26; i++) {
            if (letterCounts[i] == 0) {
                continue;
            } else if (referenceCount == 0) {
                referenceCount = letterCounts[i];
            } else if (letterCounts[i] != referenceCount) {
                return false;
            }
        }
        return true;
    }
}