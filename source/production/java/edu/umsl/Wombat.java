package edu.umsl;

class Wombat extends Animal {

    @Override
    public String toString() {
        return "Wombat:" +
                "\nEats through: " + eatFood() +
                "\nReproduces through: " + modeOfReproduction() +
                "\nFun fact: These Australian marsupials can pass up to 100 deposits of square poops a night." +
                "\nYou read that right--a wombat's poop is always cube shaped.";
    }

}
