package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import models.Constantes;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.ValidateTestDone;
import questions.validateTitle;
import tasks.Login;
import tasks.SendData;

import java.util.List;
import java.util.Map;

public class evalartStepDefinition {
  @Before
  public void setStage () {
    OnStage.setTheStage(new OnlineCast());
  }

  @Given("I am on evalart automation test web")
  public void i_am_on_evalart_automation_test_web() {
    OnStage.theActorCalled(Constantes.ACTOR)
            .wasAbleTo(Open.url(Constantes.URL));
  }
  @When("I login with my credentials")
  public void i_login_with_my_credentials(DataTable table) {
    List<Map<String, String>> userData = table.asMaps();
    OnStage.theActorInTheSpotlight().attemptsTo(
            Login.withCredentials(userData)
    );
  }
  @Then("^I should see the title (.*)")
  public void i_should_see_the_title_prueba_de_automatización(String msg) {
    OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(
            validateTitle.onWeb(msg)
    ));
  }
  // ----------------------- COMPLETE TEST --------------------------

  @When("I login with my credentials and send required data")
  public void iLoginWithMyCredentialsAndSendRequiredData(DataTable table) {
    List<Map<String, String>> userData = table.asMaps();
    OnStage.theActorInTheSpotlight().attemptsTo(
            Login.withCredentials(userData),
            SendData.required(userData)
    );

  }
  @Then("^I should see the message (.*)")
  public void iShouldSeeTheMessageFelicitaciones(String msg) {
    OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(
            ValidateTestDone.onWeb(msg)
    ));
  }

}