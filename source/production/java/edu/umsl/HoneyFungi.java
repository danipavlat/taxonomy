package edu.umsl;

public class HoneyFungi extends Fungi {

    @Override
    public String toString() {
        return "Honey Fungi:" +
                "\nEats through: " + eatFood() +
                "\nReproduces through: " + modeOfReproduction() +
                "\nFun fact: Honey fungi form some of the largest living organisms in the world." +
                "\nThe honey fungi in Oregon's Malheur National Forest is over 2,400 years old and covers 3.4sq mi.";
    }

}
