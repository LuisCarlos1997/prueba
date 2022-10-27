package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import models.LoginModel;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import tasks.LoginTask;

import java.util.List;

public class LoginStepDefinition {

    @Managed
    private WebDriver hisdriver;

    @Before
    public void open() {
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("Luis Carlos");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisdriver));

    }
    @Given("Luis open pages")
    public void luisOpenPages() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.saucedemo.com/"));
    }

    @When("I enter the main screen of the page")
    public void iEnterTheMainScreenOfThePage(List<LoginModel> loginModelList) {
        LoginModel loginModel;
        loginModel = loginModelList.get(0);
        OnStage.theActorInTheSpotlight().wasAbleTo(LoginTask.loginTask(loginModel));

    }

    @Then("I successfully entered the page")
    public void iSuccessfullyEnteredThePage() {

      }
    }

