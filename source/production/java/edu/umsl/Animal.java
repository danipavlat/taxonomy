package edu.umsl;

class Animal extends Creature implements Reproduction {

    @Override
    String eatFood() {
        return "Ingestion";
    }

    @Override
    public String modeOfReproduction() {
        return "Sexual Reproduction";
    }

}
