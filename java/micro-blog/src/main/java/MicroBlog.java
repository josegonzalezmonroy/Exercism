public class MicroBlog {
    public String truncate(String input) {
        StringBuilder truncatedString = new StringBuilder();
        
        int charCount = 0;
        for (int i = 0; i < input.length(); ) {
            int codePoint = input.codePointAt(i);  
            int charLength = Character.charCount(codePoint);
            
            if (charCount < 5) {
                truncatedString.appendCodePoint(codePoint);
                charCount++;
            } else {
                break; 
            }
            i += charLength;
        }

        return truncatedString.toString();
    }
}
