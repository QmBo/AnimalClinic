public class Client {
    private final String id;
    private final Pet pet;

    public Client(String id, Pet pet) {
        this.id = id;
        this.pet = pet;
    }

    public String getPetName() {
        return this.pet.getName();
    }

    @Override
    public String toString() {
        return this.id + " " + this.pet.toString();
    }
}
