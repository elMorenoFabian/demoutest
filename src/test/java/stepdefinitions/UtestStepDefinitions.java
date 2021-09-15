package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.UTestData;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.Answer;
import task.OpenUp;
import task.RegisterUser;

import java.util.List;

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
    public void userFillUserRegistration(List<UTestData> uTestData) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(RegisterUser.thePage(
                uTestData.get(0).getName(),
                uTestData.get(0).getLastName(),
                uTestData.get(0).getEmail(),
                uTestData.get(0).getBirthMont(),
                uTestData.get(0).getBirthDay(),
                uTestData.get(0).getBirthYear(),
                uTestData.get(0).getLenguage(),
                uTestData.get(0).getCity(),
                uTestData.get(0).getZip(),
                uTestData.get(0).getCountry(),
                uTestData.get(0).getosPc(),
                uTestData.get(0).getOsVersion(),
                uTestData.get(0).getOsLenguage(),
                uTestData.get(0).getPassword(),
                uTestData.get(0).getPasswordConfirm()
        ));
    }

    @Then("^user register success$")
    public void userRegisterSuccess(List<UTestData> uTestData) throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(uTestData.get(0).getHeaderTitle())));
    }

}
