public interface TextModeration {

    // Abstract method
    boolean checkOffensiveContent(String post);

    // Default method
    default void displayModerationPolicy() {
        System.out.println("Policy: Offensive language is not allowed.");
    }

    // Static method
    static boolean containsRestrictedWords(String post) {
        String[] restrictedWords = {"hate", "abuse", "violence"};

        post = post.toLowerCase();

        for (String word : restrictedWords) {
            if (post.contains(word)) {
                return true;
            }
        }
        return false;
    }
}