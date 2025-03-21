import java.util.HashMap;
import java.util.Map;

class ResistorColorTrio {

    private static final Map<String, Integer> COLOR_VALUES = createColorMap();

    private static Map<String, Integer> createColorMap() {
        Map<String, Integer> map = new HashMap<>();
        map.put("black", 0);
        map.put("brown", 1);
        map.put("red", 2);
        map.put("orange", 3);
        map.put("yellow", 4);
        map.put("green", 5);
        map.put("blue", 6);
        map.put("violet", 7);
        map.put("grey", 8);
        map.put("white", 9);
        return map;
    }

    String label(String[] colors) {
        int digit1 = COLOR_VALUES.get(colors[0]);
        int digit2 = COLOR_VALUES.get(colors[1]);
        int multiplier = COLOR_VALUES.get(colors[2]);

        long value = (digit1 * 10L + digit2) * (long) Math.pow(10, multiplier);

        if (value >= 1_000_000_000) {
            return (value / 1_000_000_000) + " gigaohms";
        } else if (value >= 1_000_000) {
            return (value / 1_000_000) + " megaohms";
        } else if (value >= 1_000) {
            return (value / 1_000) + " kiloohms";
        } else {
            return value + " ohms";
        }
    }
}
