import java.util.*;

class ProteinTranslator {

    List<String> translate(String rnaSequence) {
        
        List<String> proteins = new ArrayList<>();

        int i;
        
        for (i = 0; i + 2 < rnaSequence.length(); i += 3) {
            String codon = rnaSequence.substring(i, i + 3);

            switch (codon) {
                case "AUG":
                    proteins.add("Methionine");
                    break;
                case "UUU", "UUC":
                    proteins.add("Phenylalanine");
                    break;
                case "UUA", "UUG":
                    proteins.add("Leucine");
                    break;
                case "UCU", "UCC", "UCA", "UCG":
                    proteins.add("Serine");
                    break;
                case "UAU", "UAC":
                    proteins.add("Tyrosine");
                    break;
                case "UGU", "UGC":
                    proteins.add("Cysteine");
                    break;
                case "UGG":
                    proteins.add("Tryptophan");
                    break;
                case "UAA", "UAG", "UGA":
                    return proteins;
                default:
                    throw new IllegalArgumentException("Invalid codon");
            }
        }

        if (i < rnaSequence.length())
            throw new IllegalArgumentException("Invalid codon");

        return proteins;
    }
}
