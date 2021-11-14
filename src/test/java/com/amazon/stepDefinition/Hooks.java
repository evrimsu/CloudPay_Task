package com.amazon.stepDefinition;

import com.amazon.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {


    @Before
    public void startUp(){

        Driver.get().manage().window().maximize();

    }

    @After
    public void shutDown(){
        Driver.closeDriver();
    }
}
