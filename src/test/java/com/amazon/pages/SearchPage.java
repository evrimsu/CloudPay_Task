package com.amazon.pages;

import com.amazon.utilities.BrowserTools;
import com.amazon.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class SearchPage extends BasePage{


    public void selectGB_Option(String GB_option){

        Driver.get().findElement(By.xpath("//*[.='"+GB_option+"']")).click();
    }

    @FindBy(xpath = "//*[contains(text(), 'Next')]")
    public WebElement nextPage;


    public void searchItem(String product){

        boolean flag = false;

            while ( ! flag){

                try {

                    WebElement element = Driver.get().findElement(By.xpath("//*[contains(text(), '" + product + "')]"));

                    BrowserTools.scrollToElementAndClick(element);

                    flag = true;

                }catch (NoSuchElementException e){

                    BrowserTools.scrollToElementAndClick(nextPage);
                    BrowserTools.waitFor(2);
                }

            }

    }


}
