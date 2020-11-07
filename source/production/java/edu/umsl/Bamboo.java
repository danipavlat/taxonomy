package edu.umsl;

class Bamboo extends Plant {

    @Override
    public String toString() {
        return "Bamboo:" +
                "\nEats through: " + eatFood() +
                "\nReproduces through: " + modeOfReproduction() +
                "\nFun Fact: Bamboo can grow 35in in a single day!" +
                "\nA bamboo plant in the United Kingdom actually holds the Guiness World Record for fastest growing plant.";
    }

}
