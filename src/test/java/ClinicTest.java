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
}