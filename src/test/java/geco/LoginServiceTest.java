package geco;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Marianna on 22/11/2016.
 */
public class LoginServiceTest {
    LoginService loginService;
    @Before
    public void setUp() throws Exception {
        String logins[] = {"test"};
        loginService = new LoginService(logins);
    }

    @Test
    public void loginExists() throws Exception {
        assertTrue(loginService.loginExists("test"));
    }

    @Test
    public void addLogin() throws Exception {
        loginService.addLogin("test2");
        assertTrue(loginService.loginExists("test2"));
    }

    @Test
    public void findAllLoginsStartingWith() throws Exception {
        loginService.addLogin("test3");
        loginService.addLogin("test4");
        loginService.addLogin("login1");
        loginService.addLogin("login2");
        List<String> logins = loginService.findAllLoginsStartingWith("test");

        assertEquals(logins.size(), 3);
    }

    @Test
    public void findAllLogins() throws Exception {
        loginService.addLogin("test3");
        loginService.addLogin("test4");
        loginService.addLogin("login1");
        loginService.addLogin("login2");

        List<String> logins = loginService.findAllLogins();
        assertEquals(logins.size(), 5);
    }



}