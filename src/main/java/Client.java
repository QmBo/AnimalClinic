/**
 * Client's Class.
 */
public class Client {
    /**
     * Client's name.
     */
    private String id;
    /**
     * Client's Pet.
     */
    private Pet pet;

    /**
     * Client's constructor.
     * @param id name of Client.
     * @param pet Client's Pet.
     */
    public Client(final String id, final Pet pet) {
        this.id = id;
        this.pet = pet;
    }

    /**
     * Return Client's Pet name.
     * @return String name.
     */
    public String getPetName() {
        return this.pet.getName();
    }

    /**
     * Return Client's name.
     * @return String Client's name.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Convert Client to string.
     * @return String "Client's name Clint's Pet type Pet name".
     */
    @Override
    public String toString() {
        return this.id + " " + this.pet.toString();
    }

    /**
     * Set Client name.
     * @param id new name
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Set Client's Pet name.
     * @param name new Pet's name.
     */
    public void setPet(final String name) {
        this.pet.setName(name);
    }

    /**
     * Deleted Client's Pet.
     */
    public void removePet() {
        this.pet = null;
    }

    /**
     * Return Client's Pet.
     * @return Pet.
     */
    public Pet getPet() {
        return this.pet;
    }
}
