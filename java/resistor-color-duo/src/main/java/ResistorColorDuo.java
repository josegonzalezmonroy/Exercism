import java.util.HashMap;
import java.util.Map;

class ResistorColorDuo {

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

    int value(String[] colors) {
        int firstDigit = COLOR_VALUES.get(colors[0]);
        int secondDigit = COLOR_VALUES.get(colors[1]);
        return firstDigit * 10 + secondDigit;
    }
}