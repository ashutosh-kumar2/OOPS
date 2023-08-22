package springbootcamp;

public class Human extends LivingBeing{

    private char gender;

    private int id;

    @Override
    public void walk(){
        System.out.println("Human walking");
    }
}
