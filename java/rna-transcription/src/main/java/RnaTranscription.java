class RnaTranscription {

    String transcribe(String dnaStrand) {
        StringBuilder rnaStrand = new StringBuilder();

        for (char nucleotide : dnaStrand.toCharArray()) {
            switch (nucleotide) {
                case 'G':
                    rnaStrand.append('C');
                    break;
                case 'C':
                    rnaStrand.append('G');
                    break;
                case 'T':
                    rnaStrand.append('A');
                    break;
                case 'A':
                    rnaStrand.append('U');
                    break;
                default:
                    throw new IllegalArgumentException("Invalid nucleotide: " + nucleotide);
            }
        }

        return rnaStrand.toString();
    }
}
