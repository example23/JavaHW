package exadel.com;

import exadel.com.organisms.Colour;
import exadel.com.organisms.Flower;
import exadel.com.organisms.Organism;
import exadel.com.organisms.Plant;
import exadel.com.organisms.Tree;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Tree tree = new Tree();
        tree.setHigh(true);
        tree.setOld(false);
        System.out.println(tree);

        Flower flower = new Flower(Colour.valueOf("WHITE"));
        Flower flower2 = new Flower(Colour.RED);

        flower.getLeafsCount(tree);
        System.out.println(flower.colour);
        System.out.println(flower2.colour);

        Plant plant = new Flower();
        Organism organism = new Flower();

        System.out.println(plant.getName());

        List<Plant> plants = new ArrayList<>();
        plants.add(flower);
        plants.add(flower2);
        plants.add(tree);

        for (Plant b : plants) {
            System.out.println(b);
        }

        plants.sort(new PlantComparator());
        System.out.println();

        for (Plant a: plants){
        System.out.println(a);
    }
        System.out.println(plants.get(2));
}
}

