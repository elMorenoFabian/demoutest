package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.Answer;
import task.OpenUp;
import task.RegisterUser;

public class UtestStepDefinitions {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^user wants register in page$")
    public void userWantsRegisterInPage() {
        OnStage.theActorCalled("User").wasAbleTo(OpenUp.thePage());
    }

    @When("^user fill user registration$")
    public void userFillUserRegistration() {
        OnStage.theActorInTheSpotlight().attemptsTo(RegisterUser.thePage());
    }

    @Then("^user register success (.*)$")
    public void userRegisterSuccess(String question) {
//        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));
    }

}
