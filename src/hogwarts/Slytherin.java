package hogwarts;

public class Slytherin extends Faculty {
    @Override
    public void makeMagic() {
        System.out.println("Avada Kedavra!");
    }

    @Override
    public String toString() {
        return "Slytherin";
    }
}
