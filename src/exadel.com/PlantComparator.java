package exadel.com;

import exadel.com.organisms.Plant;

import java.util.Comparator;

public class PlantComparator implements Comparator<Plant> {

    @Override
    public int compare(Plant a1, Plant a2) {
        return a1.getageCount() - a1.getageCount();
    }
}
