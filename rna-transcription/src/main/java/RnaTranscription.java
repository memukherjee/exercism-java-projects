class RnaTranscription {

    String transcribe(String dnaStrand) {
        StringBuilder rnaStrand = new StringBuilder();
        for(char dnaNucleotide: dnaStrand.toUpperCase().toCharArray()) {
            char rnaNucleotide = switch (dnaNucleotide) {
                case 'G' -> 'C';
                case 'C' -> 'G';
                case 'A' -> 'U';
                case 'T' -> 'A';
                default -> throw new IllegalStateException("Unexpected value: " + dnaNucleotide);
            };
            rnaStrand.append(rnaNucleotide);
        }
        return rnaStrand.toString();
    }

}
