package springbootcamp;

public class Animal extends LivingBeing{

    private int animalId;

    public Animal(int animalId){
    }

    @Override
    public void walk(){
        System.out.println("Animal walking");
    }
}
