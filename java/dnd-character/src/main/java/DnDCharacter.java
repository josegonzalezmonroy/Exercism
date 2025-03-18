import java.util.*;

class DnDCharacter {

    private final int strength;
    private final int dexterity;
    private final int constitution;
    private final int intelligence;
    private final int wisdom;
    private final int charisma;

    public DnDCharacter() {
        this.strength = ability();
        this.dexterity = ability();
        this.constitution = ability();
        this.intelligence = ability();
        this.wisdom = ability();
        this.charisma = ability();
    }

    public static int ability(List<Integer> scores) {
        List<Integer> sortedScores = new ArrayList<>(scores);
        Collections.sort(sortedScores, Collections.reverseOrder());
        return sortedScores.get(0) + sortedScores.get(1) + sortedScores.get(2);
    }

    public static int ability() {
        return ability(rollDice());
    }

    public static List<Integer> rollDice() {
        Random random = new Random();
        List<Integer> rolls = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            rolls.add(random.nextInt(6) + 1);
        }
        return rolls;
    }

    public static int modifier(int score) {
        return Math.floorDiv(score - 10, 2);
    }

    public int getStrength() {
        return strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public int getConstitution() {
        return constitution;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getCharisma() {
        return charisma;
    }

    public int getHitpoints() {
        return 10 + modifier(getConstitution());
    }
}
