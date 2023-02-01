package hogwarts;

public class Gryffindor extends Faculty {
    @Override
    public void makeMagic() {
        System.out.println("Patronus!");
    }

    @Override
    public String toString() {
        return "Gryffindor";
    }
}
