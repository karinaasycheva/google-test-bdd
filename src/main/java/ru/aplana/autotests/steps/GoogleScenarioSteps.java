package ru.aplana.autotests.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.webdriver.ThucydidesWebDriverSupport;
import org.jbehave.core.annotations.BeforeScenario;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import ru.aplana.autotests.pages.HomePage;
import ru.aplana.autotests.pages.LoginPage;

/**
 * Created by aplana on 24.11.16.
 */
public class GoogleScenarioSteps {

    HomePage homePage;

    LoginPage loginPage;

    @Step("Выполнен переход к странице авторизации")
    public void stepGoToLoginGmailPage(){
        homePage.goToLoginGmailPage();
    }

    @Step("Выполнена авторизация с логином {0}")
    public void stepGmailLogin(String login){
        loginPage.login(login);
    }

    @Step("Получено сообщение об ошибке")
    public String stepGetErrorMsg(){
        return loginPage.getErrorMsg();
    }
}
