public class Client {
    private String id;
    private final Pet pet;

    public Client(final String id, final Pet pet) {
        this.id = id;
        this.pet = pet;
    }

    public String getPetName() {
        return this.pet.getName();
    }

    public String getId() {
        return this.id;
    }

    @Override
    public String toString() {
        return this.id + " " + this.pet.toString();
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPet(final String name) {
        this.pet.setName(name);
    }
}
