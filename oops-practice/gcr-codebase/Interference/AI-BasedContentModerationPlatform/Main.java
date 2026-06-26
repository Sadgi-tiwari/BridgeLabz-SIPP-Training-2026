public class Main {

    public static void main(String[] args) {

        String[] posts = {
                "I love programming.",
                "Buy now and get 50% OFF!",
                "I hate everyone.",
                "Click here to win a free phone.",
                "Have a wonderful day!"
        };

        ContentModerator moderator = new ContentModerator();

        moderator.displayModerationPolicy();

        System.out.println("\nPost Status:");

        for (String post : posts) {

            System.out.println("\nPost: " + post);

            if (moderator.checkSpam(post)) {
                System.out.println("Status: Spam Post");
            } else if (moderator.checkOffensiveContent(post)) {
                System.out.println("Status: Offensive Post");
            } else {
                System.out.println("Status: Valid Post");
            }
        }
    }
}
