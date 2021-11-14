package com.amazon.pages;

import com.amazon.utilities.BrowserTools;
import com.amazon.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    public HomePage(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(id = "twotabsearchtextbox")
    public WebElement searchBox;

    @FindBy(id = "nav-search-submit-button")
    public WebElement searchButton;

    public void selectGB_Option(String GB_option){

        Driver.get().findElement(By.xpath("//*[.='"+GB_option+"']")).click();
    }

    @FindBy(xpath = "//*[contains(text(), 'Next')]")
    public WebElement nextPage;


    public void searchItem(String Product){




            if ( ! Driver.get().findElement(By.xpath("//contain(text(), '"+Product+"')]")).isDisplayed()){

                String next =" //*[contains(text(), 'Next')]";

                BrowserTools.scrollToElement(Driver.get().findElement(By.xpath(next)));

                BrowserTools.waitFor(2);

                nextPage.click();
            }else {
                //Driver.get().findElement(By.xpath("//contain(text(), '"+Product+"')]")).click();
            }


    }

}
