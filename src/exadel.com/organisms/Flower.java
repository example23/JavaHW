package exadel.com.organisms;


public class Flower extends Plant{
    public Colour colour;
    private int leafsNumber;

    public Flower() {
        super (4);
        }

    public Flower(Colour colour) {
        super(4);
         this.colour = colour;
    }
    private boolean canLeafsBeCounted (Tree tree) {
        return tree.isHigh() && tree.isOld();
    }
    public Integer getLeafsCount(Tree tree) {
       return canLeafsBeCounted(tree) ? leafsNumber : null;

    }

    @Override
    public String toString() {
        return "Flower{" +
                "colour=" + colour +
                ", leafsNumber=" + leafsNumber +
                '}';
    }

    @Override
    public void sayHi() {
        System.out.println("Sssshhhh!");

    }

    @Override
    public String getName() {
        return "Flower";
    }
}
