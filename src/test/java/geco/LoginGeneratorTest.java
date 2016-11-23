package geco;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Marianna on 22/11/2016.
 */
public class LoginGeneratorTest {
    LoginGenerator loginGenerator;

    @Before
    public void setUp() throws Exception {
        String logins[] = {"test"};
        LoginService loginService = new LoginService(new String[] {"JROL", "BPER",
                "CGUR", "JDUP", "JRAL", "JRAL1"});

        loginGenerator = new LoginGenerator(loginService);
    }

    @Test
    public void generateLoginForNomAndPrenom() throws Exception {
        String login = loginGenerator.generateLoginForNomAndPrenom("Durand", "Paul");
        assertEquals("PDUR", login);
    }


    @Test
    public void generateLoginForNomAndPrenom3() throws Exception {
        String login = loginGenerator.generateLoginForNomAndPrenom("Ralling", "John");
        assertEquals("JRAL2", login);
    }

    @Test
    public void generateLoginForNomAndPrenom1() throws Exception {
        String login = loginGenerator.generateLoginForNomAndPrenom("Rolling", "Jean");
        assertEquals("JROL1", login);
    }


    @Test
    public void generateLoginForNomAndPrenom4() throws Exception {
        String login = loginGenerator.generateLoginForNomAndPrenom("Dùrand", "Paul");
        assertEquals("PDUR", login);
    }

   
}