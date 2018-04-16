public class Dog implements Pet {
    private final String name;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
