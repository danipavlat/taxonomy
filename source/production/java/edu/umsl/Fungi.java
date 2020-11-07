package edu.umsl;

class Fungi extends Creature implements Reproduction {

    @Override
    String eatFood() {
        return "External digestion with hyphae";
    }

    @Override
    public String modeOfReproduction() {
        return "Spores";
    }

}
