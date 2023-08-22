package springbootcamp;

public abstract class Game {


    private final String name;

    public Game(String name) {
        this.name = name;
    }

    public abstract void play();
}
