import ie.atu.week12e.PassengerData;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PassengerDataTest {

    @Test
    public void testValidTitleIsAccepted() {
        PassengerData p = new PassengerData("Mr", "John", "Doe");
        assertEquals("Mr", p.getTitle());
    }

    @Test
    public void testInvalidTitleIsNotAccepted() {

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new PassengerData("Emre", "Emre", "Demir");
        });

        assertEquals("Title must be Mr, Mrs, or Ms", exception.getMessage());

    }

    @Test
    public void testValidFirstNameIsAccepted() {
        PassengerData p = new PassengerData("Mr", "John", "Doe");
        assertEquals("John", p.getFirstName());
    }

    @Test
    public void testInvalidFirstNameIsNotAccepted() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new PassengerData("Emre", "Em", "Demir");
        });

        assertThrows(IllegalArgumentException.class, () -> {

        });
    }
}
