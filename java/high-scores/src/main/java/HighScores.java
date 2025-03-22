import java.util.*;

public class HighScores {
    private List<Integer> highScores;

    public HighScores(List<Integer> highScores) {
        this.highScores = new ArrayList<>(highScores);
    }

    List<Integer> scores() {
        return highScores;
    }

    Integer latest() {
        return highScores.get(highScores.size() - 1);
    }

    Integer personalBest() {
        return Collections.max(highScores);
    }

    List<Integer> personalTopThree() {
        List<Integer> sorted = new ArrayList<>(highScores);
        Collections.sort(sorted, Collections.reverseOrder());
        return sorted.subList(0, Math.min(3, sorted.size()));
    }
}
