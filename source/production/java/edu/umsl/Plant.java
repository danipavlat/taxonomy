package edu.umsl;

class Plant extends Creature implements Reproduction {

    @Override
    String eatFood() {
        return "Sunlight (aka photosynthesis)";
    }

    @Override
    public String modeOfReproduction() {
        return "Seeds";
    }

}
