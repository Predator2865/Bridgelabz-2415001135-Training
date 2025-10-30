public class GameScoreboard {

    public static void main(String[] args) {
        
        Integer[] scores = {100, null, 250, 175, null, 300};

        int notPlayedCount = 0;
        int totalScore = 0;

        for (Integer score : scores) {
            if (score == null) {
                
                notPlayedCount++;
            } else {
                
                totalScore += score;
            }
        }

        
        System.out.println("Number of players who haven't played: " + notPlayedCount);
        System.out.println("Total score of active players: " + totalScore);
    }
}
