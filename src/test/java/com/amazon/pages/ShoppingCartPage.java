package com.amazon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends HomePage{


    @FindBy(id = "add-to-cart-button")
    public WebElement addToCart;

    @FindBy(xpath = "//*[@aria-labelledby='attach-sidesheet-view-cart-button-announce']")
    public WebElement cartButton;
}
