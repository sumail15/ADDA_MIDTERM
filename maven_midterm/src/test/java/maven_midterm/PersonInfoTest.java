package maven_midterm;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class PersonInfoTest {

    @Test
    public void testGetPersonDetailsWithCorrectInput() {
        PersonInfo personInfo = new PersonInfo();
        String result = personInfo.getPersonDetails("ram", 3025);
        assertEquals("Correct Person", result);
    }

    @Test
    public void testGetPersonDetailsWithIncorrectInput() {
        PersonInfo personInfo = new PersonInfo();
        String result = personInfo.getPersonDetails("wrongName", 1234);
        assertEquals("Incorrect Person", result);
    }
}

