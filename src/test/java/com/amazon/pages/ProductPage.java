package com.amazon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage {


    @FindBy (id = "price_inside_buybox")
    public WebElement price;

    @FindBy(id = "add-to-cart-button")
    public WebElement addToCart;






}






