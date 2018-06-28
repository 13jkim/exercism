class Acronym {
    private String phrase;

    Acronym(String phrase) {
        this.phrase = phrase;
    }

    String get() {
        String acronym = "";
        for (String word : phrase.split("( )|-")) {
            acronym += ("" + word.charAt(0)).toUpperCase();
        }
        return acronym;
    }

}
