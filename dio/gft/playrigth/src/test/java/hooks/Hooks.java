package hooks;

import core.DriverManager;
import cucumber.api.java.After;
import cucumber.api.java.Before;


public class Hooks extends DriverManager {

    @Before
    public static void before(){
        web();
    }

    @After
    public static void tearDown(){
        DriverManager.tearDown();
    }

}
