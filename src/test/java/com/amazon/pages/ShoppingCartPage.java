package com.amazon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends BasePage {


    @FindBy(xpath = "//*[@aria-labelledby='attach-sidesheet-view-cart-button-announce']")
    public WebElement cartButton;
}
