package com.amazon.pages;

import com.amazon.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends HomePage {


    @FindBy (id = "price_inside_buybox")
    public WebElement price;

    @FindBy(id = "add-to-cart-button")
    public WebElement addToCart;

    @FindBy(xpath = "//*[@aria-labelledby='attach-sidesheet-view-cart-button-announce']")
    public WebElement cartButton;





}






