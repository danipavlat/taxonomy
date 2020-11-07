package edu.umsl;

class BrownBear extends Animal {

    @Override
    public String toString() {
        return "Brown bear:" +
                "\nEats through: " + eatFood() +
                "\nReproduces through: " + modeOfReproduction() +
                "\nFun Fact: Brown bears are celebrated annually during Katmai National Park's Fat Bear Week!" +
                "\nThis year's champion was Bear 747, who was estimated to weigh more than 1,400lbs.";
    }

}
