package exadel.com.organisms;

public interface Organism {

    String getName();

  default void move(){
      System.out.println(getName() + " moving..."); }
}
