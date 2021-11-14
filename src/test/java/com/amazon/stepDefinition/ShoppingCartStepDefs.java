package com.amazon.stepDefinition;

import com.amazon.pages.HomePage;
import com.amazon.utilities.BrowserTools;
import com.amazon.utilities.Driver;
import com.amazon.utilities.ReadConfigurations;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ShoppingCartStepDefs {

    HomePage homePage=new HomePage();

    @Given("user is on the Home Page")
    public void user_is_on_the_Home_Page() {

        Driver.get().get(ReadConfigurations.get("url"));

    }

    @When("user search for a {string}")
    public void user_search_for_a(String product) {

        homePage.searchBox.sendKeys(product);
        homePage.searchButton.click();
        BrowserTools.waitFor(2);

    }
    @When("user filters search with {string} option")
    public void user_filters_search_with_option(String GB_option) {


        homePage.selectGB_Option(GB_option);
        BrowserTools.waitFor(1);

    }
    @When("user select a {string}")
    public void user_select_a(String product) {

        homePage.searchItem(product);


    }
    @When("user check the price is {string}")
    public void user_check_the_price_is(String string) {

    }
    @When("user adds the {string} in the basket")
    public void user_adds_the_in_the_basket(String string) {

    }
    @Then("user sees the {string} is in the shopping cart")
    public void user_sees_the_is_in_the_shopping_cart(String string) {

    }

}