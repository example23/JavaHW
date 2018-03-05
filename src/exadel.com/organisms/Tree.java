package exadel.com.organisms;

public class Tree extends Plant {
    private boolean isHigh;
    private boolean isOld;

    public Tree(){
        super(4);

    }
    public boolean isHigh() {
        return isHigh;
    }

    public void setHigh(boolean high) {
        System.out.println("hey, I'm being modified");
        isHigh = high;
    }
    public boolean isOld() {
        return isOld;
    }

    public void setOld(boolean old) {
        isOld = old;
    }

    @Override
    public String toString() {
        return "Tree{" +
                "isHigh=" + isHigh +
                ", isOld=" + isOld +
                '}';
    }

    @Override
    public String getName() {
        return "Tree";}

        @Override
        public void sayHi() {
            System.out.println("SSSShhh!");
            }
}

