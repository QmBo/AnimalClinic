import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ClinicTest {

    @Test
    public void findClientForPetName() {
        Clinic clinic = new Clinic(10);
        clinic.addClient(0, new Client("Иванов", new Dog("Бобик")));
        Client thisIs = new Client("Петров", new Cat("Мурка"));
        clinic.addClient(1, thisIs);
        clinic.addClient(2, new Client("Сидоров", new CatDog("Котопёс")));
        Client[] result = clinic.findClientForPetName("Мурка");
        assertThat(result, is(new Client[]{thisIs}));
    }

    @Test
    public void findClientForPetNameTwoFind() {
        Clinic clinic = new Clinic(10);
        Client thisIs = new Client("Петров", new Cat("Мурка"));
        Client thisIsTwo = new Client("Васичкин", new CatDog("Мурка"));
        clinic.addClient(0, new Client("Иванов", new Dog("Бобик")));
        clinic.addClient(1, thisIs);
        clinic.addClient(2, new Client("Сидоров", new CatDog("Котопёс")));
        clinic.addClient(5, thisIsTwo);
        Client[] result = clinic.findClientForPetName("Мурка");
        assertThat(result, is(new Client[]{thisIs, thisIsTwo}));
    }

    @Test
    public void findClientForOwnerId() {
        Clinic clinic = new Clinic(10);
        Client thisIs = new Client("Петров", new Cat("Мурка"));
        Client thisIsTwo = new Client("Петров", new Dog("Шапик"));
        clinic.addClient(0, new Client("Иванов", new Dog("Бобик")));
        clinic.addClient(1, thisIs);
        clinic.addClient(2, new Client("Сидоров", new CatDog("Котопёс")));
        clinic.addClient(5, thisIsTwo);
        Client[] result = clinic.findClientForOwnerId("Петров");
        assertThat(result, is(new Client[]{thisIs, thisIsTwo}));
    }

    @Test
    public void clientRename() {
        Clinic clinic = new Clinic(10);
        Client thisIs = new Client("Петров", new Cat("Мурка"));
        Client thisIsTwo = new Client("Петров", new Dog("Шапик"));
        clinic.addClient(0, new Client("Иванов", new Dog("Бобик")));
        clinic.addClient(1, thisIs);
        clinic.addClient(2, new Client("Сидоров", new CatDog("Котопёс")));
        clinic.addClient(5, thisIsTwo);
        clinic.clientRename(1, "Петров Сергей");
        assertThat(clinic.showClient(1), is(thisIs));
    }

    @Test
    public void petRename() {
        Clinic clinic = new Clinic(10);
        Client thisIs = new Client("Петров", new Cat("Мурка"));
        Client thisIsTwo = new Client("Петров", new Dog("Шапик"));
        clinic.addClient(0, new Client("Иванов", new Dog("Бобик")));
        clinic.addClient(1, thisIs);
        clinic.addClient(2, new Client("Сидоров", new CatDog("Котопёс")));
        clinic.addClient(5, thisIsTwo);
        clinic.petRename(1, "Шарик Сергеевич");
        assertThat(clinic.showClient(1), is(thisIs));
    }


    @Test
    public void removeClient() {
        Clinic clinic = new Clinic(10);
        Client thisIs = new Client("Петров", new Cat("Мурка"));
        Client thisIsTwo = new Client("Петров", new Dog("Шапик"));
        clinic.addClient(0, new Client("Иванов", new Dog("Бобик")));
        clinic.addClient(1, thisIs);
        clinic.addClient(2, new Client("Сидоров", new CatDog("Котопёс")));
        clinic.addClient(5, thisIsTwo);
        clinic.removeClient(1);
        assertNotEquals(clinic.showClient(1), thisIs);
    }

    @Test
    public void removePet() {
        Clinic clinic = new Clinic(10);
        Client thisIs = new Client("Петров", new Cat("Мурка"));
        Client thisIsTwo = new Client("Петров", new Dog("Шапик"));
        clinic.addClient(0, new Client("Иванов", new Dog("Бобик")));
        clinic.addClient(1, thisIs);
        clinic.addClient(2, new Client("Сидоров", new CatDog("Котопёс")));
        clinic.addClient(5, thisIsTwo);
        Pet result = clinic.getClientPet(1);
        clinic.removePet(1);
        assertNotEquals(clinic.getClientPet(1), result);
    }
}