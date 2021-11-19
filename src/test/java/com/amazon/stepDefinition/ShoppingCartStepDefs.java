package com.amazon.stepDefinition;

import com.amazon.pages.BasePage;
import com.amazon.pages.SearchPage;
import com.amazon.pages.ProductPage;
import com.amazon.pages.ShoppingCartPage;
import com.amazon.utilities.BrowserTools;
import com.amazon.utilities.Driver;
import com.amazon.utilities.ReadConfigurations;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class ShoppingCartStepDefs {

    SearchPage searchPage = new SearchPage();
    ProductPage productPage=new ProductPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();

    @Given("user is on the Home Page")
    public void user_is_on_the_Home_Page() {

        Driver.get().get(ReadConfigurations.get("url"));

    }

    @When("user search for a {string}")
    public void user_search_for_a(String product) {

        searchPage.searchBox.sendKeys(product);
        searchPage.searchButton.click();

        BrowserTools.waitFor(2);

    }
    @When("user filters search with {string} option")
    public void user_filters_search_with_option(String GB_option) {


        searchPage.selectGB_Option(GB_option);
        BrowserTools.waitFor(1);

    }
    @When("user select a {string}")
    public void user_select_a(String product) {

        searchPage.searchItem(product);
        BrowserTools.waitFor(2);


    }
    @When("user check the price is {string}")
    public void user_check_the_price_is(String expectedPrice) {

        String priceText = productPage.price.getText();
        Assert.assertEquals(expectedPrice, priceText);
        BrowserTools.waitFor(2);

    }
    @When("user adds the item in the basket")
    public void user_adds_the_item_in_the_basket() {
       productPage.addToCart.click();
        BrowserTools.waitFor(2);
    }


    @Then("user sees the {string} is in the shopping cart")
    public void
    user_sees_the_is_in_the_shopping_cart(String product) {

        shoppingCartPage.cartButton.click();
        BrowserTools.waitFor(2);

        BrowserTools.verifyElementIsDisplayed( Driver.get().findElement(By.xpath("//*[contains(text(), '" + product + "') and @class='a-truncate-cut']")));

    }

}