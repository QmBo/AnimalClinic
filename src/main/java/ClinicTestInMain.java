import java.util.Arrays;

public class ClinicTestInMain {
    public static void main(String[] args) {
        Clinic clinic = new Clinic(10);
        clinic.addClient(0, new Client("Иванов", new Dog("Бобик")));
        clinic.addClient(1, new Client("Петров", new Cat("Мурка")));
        clinic.addClient(2, new Client("Сидоров", new CatDog("Котопёс")));
        System.out.println(Arrays.toString(clinic.allClients()));
        System.out.println(Arrays.toString(clinic.findClientForPetName("Мурка")));
        System.out.println(Arrays.toString(clinic.findClientForOwnerId("Сидоров")));
    }
}
