import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Calendar;

import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {

    private Person person;

    @BeforeEach
    void setup() {
        person = new Person();
        person.setName("Paul");
        person.setSurname("McCartney");
        Calendar c = Calendar.getInstance();
        c.set(2000, Calendar.JANUARY, 1);
        person.setBirthDate(c.getTime());
        person.setAnotherCompanyOwner(true);
        person.setPensioner(true);
        person.setPublicServer(true);
        person.setSalary(0f);
    }

    @Test
    void show_full_name() {
        assertEquals("Paul McCartney", person.fullName());
    }

    @Test
    void test_calculateYearlySalary() {
        person.setSalary(1200f);
        assertEquals(14400f, person.calculateYearlySalary(), 0.001f);
    }

    @Test
    void person_is_MEI() {
        person.setAnotherCompanyOwner(false);
        person.setPensioner(false);
        person.setPublicServer(false);
        person.setSalary(1000f);
        assertTrue(person.isMEI());
    }

    @Test
    void person_is_not_MEI() {
        person.setSalary(1200f);
        assertFalse(person.isMEI());
    }


}
