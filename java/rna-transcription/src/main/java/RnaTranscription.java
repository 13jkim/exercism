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
            transcribed.append(complements.get(dnaStrand.charAt(i)));
        }
        return transcribed.toString();
    }

}
