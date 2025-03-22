import java.util.*;

public class Say {

    private static final String[] units = {
        "zero", "one", "two", "three", "four",
        "five", "six", "seven", "eight", "nine",
        "ten", "eleven", "twelve", "thirteen", "fourteen",
        "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"
    };

    private static final String[] tens = {
        "", "", "twenty", "thirty", "forty",
        "fifty", "sixty", "seventy", "eighty", "ninety"
    };

    private static final String[] thousands = {
        "", "thousand", "million", "billion", "trillion"
    };

    public String say(long number) {
        if (number < 0 || number >= 1_000_000_000_000L) {
            throw new IllegalArgumentException("Number out of range");
        }

        if (number == 0) return "zero";

        List<String> parts = new ArrayList<>();

        int chunkIndex = 0;

        while (number > 0) {
            int chunk = (int)(number % 1000);
            if (chunk > 0) {
                String chunkText = convertChunk(chunk);
                if (!thousands[chunkIndex].isEmpty()) {
                    chunkText += " " + thousands[chunkIndex];
                }
                parts.add(0, chunkText);
            }
            number /= 1000;
            chunkIndex++;
        }

        return String.join(" ", parts).trim();
    }

    private String convertChunk(int number) {
        List<String> chunkParts = new ArrayList<>();

        if (number >= 100) {
            chunkParts.add(units[number / 100] + " hundred");
            number %= 100;
        }

        if (number >= 20) {
            chunkParts.add(tens[number / 10]);
            if (number % 10 != 0) {
                int lastIndex = chunkParts.size() - 1;
                chunkParts.set(lastIndex, chunkParts.get(lastIndex) + "-" + units[number % 10]);
            }
        } else if (number > 0) {
            chunkParts.add(units[number]);
        }

        return String.join(" ", chunkParts);
    }
}
