import java.util.List;
import java.util.ArrayList;

class DiamondPrinter {

    List<String> printToList(char letter) {
        
        List<String> list = new ArrayList<String>();
        StringBuilder line = new StringBuilder();

        for (char i = 'A'; i <= letter; i++) {

            for (int j = 0; j < (int) letter - i; j++) {
                line.append(" ");
            }

            line.append(i);

            for (int j = (int) letter - i; j < (int) letter - 'A'; j++) {
                line.append(" ");
            }

            for (int j = 0; j < (int) i - 'A' - 1; j++) {
                line.append(" ");
            }

            if (i != 'A')
                line.append(i);


            for (int j = (int) i - 'A'; j < (int) letter - 'A'; j++) {

                line.append(" ");
            }

            list.add(line.toString());
            line = new StringBuilder();
        }

        for (char i = (char) (letter - 1); i >= 'A'; i--) {

            for (int j = 0; j < (int) letter - i; j++) {
                line.append(" ");
            }

            line.append(i);

            for (int j = (int) letter - i; j < (int) letter - 'A'; j++) {
                line.append(" ");
            }

            for (int j = 0; j < (int) i - 'A' - 1; j++) {
                line.append(" ");
            }

            if (i != 'A')
                line.append(i);

            for (int j = (int) i - 'A'; j < (int) letter - 'A'; j++) {

                line.append(" ");
            }

            list.add(line.toString());
            line = new StringBuilder();
        }
        return list;
    }

}
