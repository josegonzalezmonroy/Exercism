class Acronym {

    private final String acronym;

    Acronym(String phrase) {
        
        String cleaned = phrase.replace("-", " ").replaceAll("[^a-zA-Z ]", "");
        String[] words = cleaned.split("\\s+");

        StringBuilder result = new StringBuilder();
        for (String word : words) {
            if (!word.isEmpty()) {
                result.append(Character.toUpperCase(word.charAt(0)));
            }
        }

        this.acronym = result.toString();
    }

    String get() {
        return acronym;
    }
}
