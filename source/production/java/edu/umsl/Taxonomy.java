package edu.umsl;

import java.util.ArrayList;
import java.util.List;

public class Taxonomy {
    public static void main(String[] args) {
        //creature declarations and initializations, lists

        //animals
        BrownBear brownBear = new BrownBear();
        Wombat wombat = new Wombat();
        List<Animal> animalList = new ArrayList<>();
        animalList.add(brownBear);
        animalList.add(wombat);

        //plants
        FigTree figTree = new FigTree();
        Bamboo bamboo = new Bamboo();
        List<Plant> plantList = new ArrayList<>();
        plantList.add(figTree);
        plantList.add(bamboo);

        //fungi
        HoneyFungi honeyFungi = new HoneyFungi();
        AmadouMushroom amadouMushroom = new AmadouMushroom();
        List<Fungi> fungiList = new ArrayList<>();
        fungiList.add(honeyFungi);
        fungiList.add(amadouMushroom);

        //display taxonomy info, calling the toString() method from each class in each list
        System.out.println("There are many types of creatures, including plants, animals, and fungi!\n" +
                "Here are a couple of examples of each:\n");

        System.out.println("Animals:\n");
        for (Animal animal : animalList){
            System.out.println(animal.toString() + "\n");
        }

        System.out.println("Plants:\n");
        for (Plant plant : plantList) {
            System.out.println(plant.toString() + "\n");
        }

        System.out.println("Fungi:\n");
        for (Fungi fungi : fungiList) {
            System.out.println(fungi.toString() + "\n");
        }
    }

}
