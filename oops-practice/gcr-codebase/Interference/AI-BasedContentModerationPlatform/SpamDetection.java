public interface SpamDetection {

    // Abstract method
    boolean checkSpam(String post);

    // Default method
    default void displayModerationPolicy() {
        System.out.println("Policy: Spam content is not allowed.");
    }
}

