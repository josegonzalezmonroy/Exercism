class SqueakyClean {
    static String clean(String identifier) 
    {
        char[] frase = identifier.toCharArray();

        StringBuilder newString = new StringBuilder();

        boolean nextUpperCase = false;

        for (char c : frase) 
        {
            if (Character.isWhitespace(c))
                newString.append('_');
            else if (c == '-')
                nextUpperCase = true;
            else if (nextUpperCase)
            {
                newString.append(Character.toUpperCase(c));
                nextUpperCase = false;
            }
            else if (Character.isLetterOrDigit(c))
            {
                if(Character.isDigit(c))
                {
                    switch (c) {
                        case '0':
                            newString.append('o');
                            break;
                        case '1':
                            newString.append('l');
                            break;
                        case '3':
                            newString.append('e');
                            break;
                        case '4':
                            newString.append('a');
                            break;
                        case '7':
                            newString.append('t');
                            break;
                    }
                }
                else 
                    newString.append(c);
            }        
        }
        return newString.toString();
    }
}
