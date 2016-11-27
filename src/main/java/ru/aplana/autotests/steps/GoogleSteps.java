package ru.aplana.autotests.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.webdriver.ThucydidesWebDriverSupport;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import ru.aplana.autotests.pages.HomePage;
import ru.aplana.autotests.pages.LoginPage;

/**
 * Created by aplana on 24.11.16.
 */
public class GoogleSteps {

    @Steps
    GoogleScenarioSteps googleScenarioSteps;

    @Given("открыта главная страница")
    public void openHomePage(){
        String workingDir = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        String baseUrl = "https://www.google.ru/";
        ThucydidesWebDriverSupport.getDriver().get(baseUrl);
    }
    @When("выполнен переход к странице авторизации")
    public void goToLoginGmailPage(){
        googleScenarioSteps.stepGoToLoginGmailPage();
    }

    @When("выполнена авторизация с логином $login")
    public void loginGmailPage(String login){
        googleScenarioSteps.stepGmailLogin(login);
    }

    @Then("сообщение об ошибке равно \"$expected\"")
    public void checkErrorMsg(String expected){
        String actual = googleScenarioSteps.stepGetErrorMsg();
        Assert.assertEquals("Получено некорретное сообщение об ошибке", expected, actual);

    }
}
