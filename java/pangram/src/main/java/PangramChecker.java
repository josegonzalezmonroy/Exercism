public class PangramChecker {

    public boolean isPangram(String input) {
        input = input.toLowerCase().replaceAll("[^a-z]", "");

        boolean[] seen = new boolean[26];
        for (char c : input.toCharArray()) {
            seen[c - 'a'] = true;
        }

        for (boolean b : seen) {
            if (!b) {
                return false;
            }
        }

        return true;
    }

}
