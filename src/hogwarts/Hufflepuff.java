package hogwarts;

public class Hufflepuff extends Faculty {
    @Override
    public void makeMagic() {
        System.out.println("Lumos!");
    }

    @Override
    public String toString() {
        return "Hufflepuff";
    }
}
