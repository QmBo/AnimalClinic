import java.util.ArrayList;

/**
 * Main Class of Clinic.
 */
public class Clinic {
    /**
     * Client's list.
     */
    private final Client[] clients;

    /**
     * Clinic's constructor.
     * @param size siz Client's list.
     */
    public Clinic(int size) {
        this.clients = new Client[size];
    }

    /**
     * Add Client to client list.
     * @param position Client's position.
     * @param client Client.
     */
    public void addClient(final int position, final Client client) {
        this.clients[position] = client;
    }

    /**
     * Find Clients for Pet's name.
     * @param name name for search.
     * @return Client[].
     */
    public Client[] findClientForPetName(final String name) {
        ArrayList<Integer> find = new ArrayList<Integer>();
        for (int i = 0; i < this.clients.length; i++) {
            if (this.clients[i] != null) {
                if (this.clients[i].getPetName().equals(name)) {
                    find.add(i);
                }
            }
        }
        Client[] result = new Client[find.size()];
        for (int i = 0; i < find.size(); i++) {
            result[i] = this.clients[find.get(i)];
        }
        return result;
    }

    /**
     * Find Clients for name.
     * @param name name for search.
     * @return Client[].
     */
    public Client[] findClientForOwnerId(final String name) {
        ArrayList<Integer> find = new ArrayList<Integer>();
        for (int i = 0; i < this.clients.length; i++) {
            if (this.clients[i] != null) {
                if (this.clients[i].getId().equals(name)) {
                    find.add(i);
                }
            }
        }
        Client[] result = new Client[find.size()];
        for (int i = 0; i < find.size(); i++) {
            result[i] = this.clients[find.get(i)];
        }
        return result;
    }

    /**
     * Return all Clients.
     * @return Clients[].
     */
    public Client[] allClients() {
        return this.clients;
    }

    /**
     * Return Client of position.
     * @param position Client's position.
     * @return Client.
     */
    public Client showClient(final int position) {
        return this.clients[position];
    }

    /**
     * Renaming Client.
     * @param position Client's position.
     * @param id new ID.
     */
    public void clientRename(final int position, final String id) {
        this.clients[position].setId(id);
    }

    /**
     * Renaming Pet.
     * @param position Client's position.
     * @param name new Pet's name.
     */
    public void petRename(final int position, final String name) {
        this.clients[position].setPet(name);
    }

    /**
     * Deleted Client.
     * @param position Client's position.
     */
    public void removeClient(int position) {
        this.clients[position] = null;
    }

    /**
     * Deleted Client's Pet.
     * @param position Client's position.
     */
    public void removePet(int position) {
        this.clients[position].removePet();
    }

    /**
     * Return Client's Pet.
     * @param position Client's position.
     * @return Pet.
     */
    public Pet getClientPet(int position) {
        return this.clients[position].getPet();
    }
}
