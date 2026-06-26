public class SmartTV implements StreamingService, GamingService {

    String[] movies = {
            "Avengers",
            "Inception",
            "Interstellar",
            "Avatar"
    };

    String[] games = {
            "FIFA",
            "Minecraft",
            "Need for Speed",
            "PUBG"
    };

    @Override
    public void streamMovie() {
        System.out.println("Streaming Movies:");
        for (String movie : movies) {
            System.out.println(movie);
        }
    }

    @Override
    public void playGame() {
        System.out.println("Available Games:");
        for (String game : games) {
            System.out.println(game);
        }
    }

    // Resolving default method conflict
    @Override
    public void showSubscriptionDetails() {
        StreamingService.super.showSubscriptionDetails();
        GamingService.super.showSubscriptionDetails();
    }
}
