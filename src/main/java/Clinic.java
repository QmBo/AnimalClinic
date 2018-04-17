import java.util.ArrayList;

public class Clinic {
    private final Client[] clients;

    public Clinic(int size) {
        this.clients = new Client[size];
    }

    public void addClient(final int position, final Client client) {
        this.clients[position] = client;
    }

    public Client[] findClientForPetName(final String name) {
        ArrayList<Integer> find = new ArrayList<Integer>();
        for (int i = 0; i < this.clients.length; i++) {
            if (this.clients[i] != null){
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

    public Client[] allClients() {
        return this.clients;
    }
}
