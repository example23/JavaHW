package exadel.com.organisms;

public abstract class Plant implements Organism {
    protected double weight;
    private int ageCount;

    public Plant (int ageCount) {
        this.ageCount = ageCount;

    }
    public int getageCount(){
        return ageCount;
    }
    public abstract void sayHi();
}
