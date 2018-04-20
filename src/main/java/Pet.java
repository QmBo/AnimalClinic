public abstract class Pet {
    private String name;

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

    public void setName(final String name) {
        this.name = name;
    }
}
