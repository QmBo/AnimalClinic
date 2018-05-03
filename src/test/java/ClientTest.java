import org.junit.Test;

import static org.junit.Assert.*;

public class ClientTest {

    @Test
    public void ClientToString() {
        Client tested = new Client("Tom", new Dog("Bob"));
        String result = tested.toString();
        assertEquals(result, "Tom Dog Bob");
    }
}