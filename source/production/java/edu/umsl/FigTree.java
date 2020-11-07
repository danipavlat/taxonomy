package edu.umsl;

class FigTree extends Plant {

    @Override
    public String toString(){
        return "Fig Tree:" +
                "\nEats through: " + eatFood() +
                "\nReproduces through: " + modeOfReproduction() +
                "\nFun Fact: A wild fig tree in South Africa has the greatest reported root depth in the world." +
                "\nThis particular tree has roots that span 400ft, breaching into Echo Caves below.";

    }

}
