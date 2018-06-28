import java.util.HashMap;

class RnaTranscription {

    String transcribe(String dnaStrand) {
        HashMap<Character, String> complements = new HashMap<>();
        complements.put('G', "C");
        complements.put('C', "G");
        complements.put('T', "A");
        complements.put('A', "U");

        StringBuilder transcribed = new StringBuilder();
        for (int i = 0; i < dnaStrand.length(); i++) {
            transcribed.append(Nucleotide.valueOf(
                    "" + dnaStrand.charAt(i)).complement);
//            transcribed.append(complements.get(dnaStrand.charAt(i)));
        }
        return transcribed.toString();
    }

    enum Nucleotide {
        G('C'), C('G'), T('A'), A('U');

        private char complement;

        Nucleotide(char complement) {
            this.complement = complement;
        }
    }

}
