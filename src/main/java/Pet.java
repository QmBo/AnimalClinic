/**
 * Class of Pet.
 */
public abstract class Pet {
    /**
     * Pet's name.
     */
    private String name;

    /**
     * Pet constructor.
     * @param name Pet's name.
     */
    protected Pet(String name) {
        this.name = name;
    }

    /**
     * Return Pet's name.
     * @return String name.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Pet to String converter.
     * @return String "Pet's type Pet's name".
     */
    @Override
    public String toString() {
        return this.whatPet() + " " + this.name;
    }

    /**
     * Helper for toString.
     * @return Pet's type.
     */
    private String whatPet() {
    String[] result = String.valueOf(this.getClass()).split(" ");
    return result[1];
    }

    /**
     * Set new Pet's name.
     * @param name new name.
     */
    public void setName(final String name) {
        this.name = name;
    }
}
