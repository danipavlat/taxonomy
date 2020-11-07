package edu.umsl;

public class AmadouMushroom extends Fungi {

    @Override
    public String toString() {
        return "Amadou Mushroom:" +
                "\nEats through: " + eatFood() +
                "\nReproduces through: " + modeOfReproduction() +
                "\nFun fact: Also known as hoof fungus, this mushroom was a precious resource to ancient people." +
                "\nIt allowed them to start fires, and was even found with the 5,000 year old remains of Ötzi the Iceman.";
    }

}
