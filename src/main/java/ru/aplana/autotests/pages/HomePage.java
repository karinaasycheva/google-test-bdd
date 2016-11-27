package ru.aplana.autotests.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

/**
 * Created by aplana on 24.11.16.
 */
public class HomePage extends PageObject{

    @FindBy(id="gb_70")
    public WebElement enderLogin;

    public void goToLoginGmailPage(){
        enderLogin.click();
    }
}
