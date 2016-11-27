package ru.aplana.autotests.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

/**
 * Created by aplana on 24.11.16.
 */
public class LoginPage extends PageObject{

    @FindBy(id = "Email")
    public WebElement email;

    @FindBy(id = "next")
    public WebElement next;

    @FindBy(id = "errormsg_0_Email")
    public WebElement errorMsg;

    public void login(String login){
        email.sendKeys(login);
        next.click();
    }

    public String getErrorMsg(){
        return errorMsg.getText();
    }
}
