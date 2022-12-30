package StepDefinitions;

import Utilities.GeneralWD;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;


public class Hooks {

    @Before
    public void before() {
        System.out.println("senaryo basladi");

    }

    @After
    public void after(Scenario senaryo) {

        System.out.println("Senaryo bitti");
        GeneralWD.quitDriver();

    }
}
