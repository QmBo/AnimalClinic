public abstract class Pet {
    private final String name;

    protected Pet(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return this.whatPet() + " " + this.name;
    }

    private String whatPet() {
    String[] result = String.valueOf(this.getClass()).split(" ");
    return result[1];
    }
}
