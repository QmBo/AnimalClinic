import org.junit.Test;
import static org.junit.Assert.*;

public class PetTest {

    @Test
    public void PetToStringTest() {
        Pet tested = new Dog("Bob");
        String result = tested.toString();
        assertEquals(result, "Dog Bob");
    }
}